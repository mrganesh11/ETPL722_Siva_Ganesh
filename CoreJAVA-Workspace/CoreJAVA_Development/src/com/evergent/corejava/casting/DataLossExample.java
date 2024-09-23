/*New! Keyboard shortcuts … Drive keyboard shortcuts have been updated to give you first-letters navigation
DataLossExample.java*/
package com.evergent.corejava.casting;

public class DataLossExample {
    public static void main(String[] args) {
        int largeNum = 130;
        byte smallNum = (byte) largeNum; // Explicit casting from int to byte

        System.out.println("Original integer value: " + largeNum);
        System.out.println("Byte value (after casting): " + smallNum); // Output may be unexpected due to overflow
    }
}
