package com.sdh.ex;

import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
    private String url = "jdbc:mariadb://localhost:3306/test";
    private String uid = "root";
    private String upw = "1234";

    public MemberDAO() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<MemberDTO> memberSelect(){
        ArrayList<MemberDTO> memberDTOS = new ArrayList<MemberDTO>();
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url,uid,upw);
            pstmt = connection.prepareStatement("SELECT * FROM ttest");
            resultSet = pstmt.executeQuery();

            while (resultSet.next()){
                String id = resultSet.getString("id");
                String pw = resultSet.getString("pw");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");

                MemberDTO memberDTO = new MemberDTO(id, pw, name, phone);
                memberDTOS.add(memberDTO);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (resultSet != null) resultSet.close();
                if(pstmt != null) pstmt.close();
                if(connection != null) connection.close();
            }catch (Exception e) {}
        }
        return memberDTOS;
    }

}
