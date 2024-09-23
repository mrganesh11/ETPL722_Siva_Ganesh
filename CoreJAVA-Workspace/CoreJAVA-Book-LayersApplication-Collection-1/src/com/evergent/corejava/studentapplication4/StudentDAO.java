package com.evergent.corejava.studentapplication4;

import java.sql.*;

public class StudentDAO {
    public int addStudent(StudentBean student) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = StudentDB.getConnection();
            String ins_str = "insert into student values(?,?,?,?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, student.getStudentId());
            pstmt.setString(2, student.getName());
            pstmt.setFloat(3, student.getGradePointAverage());
            pstmt.setString(4, student.getGrade());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }
}
