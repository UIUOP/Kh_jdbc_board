package com.kh;

import com.kh.utill.Common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
       try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELCT * from EMP";
            rs = stmt.executeQuery(sql);

            System.out.println(rs);
            while (rs.next()) {

            }


       } catch (Exception e) {
           e.printStackTrace();
       }





    }
}
