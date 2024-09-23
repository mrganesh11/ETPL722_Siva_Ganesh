package com.ganesh.samplegame.guessing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

class AudioTextPlayer {

    public static void main(String[] args) {
        String audioFilePath = "C:\\Users\\SIVA GANESH\\Music\\finalwav.wav";
        String textFilePath = "C:\\Users\\SIVA GANESH\\OneDrive\\Desktop\\programs\\cvfamily.txt";

        AudioPlayerExample1 player = new AudioPlayerExample1();
        Thread audioThread = new Thread(() -> player.play(audioFilePath));
        Thread textThread = new Thread(new TextPrinter(textFilePath));

        audioThread.start();
        textThread.start();

        try {
            audioThread.join();
            textThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AudioPlayerExample1 implements LineListener {
    private boolean playCompleted = false;

    public void play(String audioFilePath) {
        File audioFile = new File(audioFilePath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            try (Clip audioClip = (Clip) AudioSystem.getLine(info)) {
                audioClip.addLineListener(this);
                audioClip.open(audioStream);
                audioClip.start();

                synchronized (this) {
                    while (!playCompleted) {
                        wait(100); // Adjusted to 100ms for better responsiveness
                    }
                }
                System.out.println("Playback completed.");
            }
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");
        } else if (type == LineEvent.Type.STOP) {
            synchronized (this) {
                playCompleted = true;
                notify();
            }
        }
    }
}

class TextPrinter implements Runnable {
    private String filePath;

    public TextPrinter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}