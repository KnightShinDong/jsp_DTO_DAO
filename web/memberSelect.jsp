<%@ page import="java.lang.reflect.Member" %>
<%@ page import="com.sdh.ex.MemberDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.sdh.ex.MemberDTO" %><%--
  Created by IntelliJ IDEA.
  User: akdls
  Date: 2023-05-22
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>DAO,DTO</title>
</head>
<body>
<%
  MemberDAO memberDAO = new MemberDAO();
  ArrayList<MemberDTO> dtos = memberDAO.memberSelect();

  for(int i=0; i<dtos.size();i++) {
    //size()는 dtos의 크기를 반환 List의 동적변경값을 구할수 있다. List에서 사용
    //length()는 배열인 arr길이 반환. 정적이며 배열의 길이를 구할때 사용
    MemberDTO dto = dtos.get(i);
    String id = dto.getId();
    String pw = dto.getPw();
    String name = dto.getName();
    String phone = dto.getPhone();
    out.println("아이디: "+id+",비밀번호 :"+pw+",이름: :"+name+",연락처 :"+phone+"<br />"); //out.println이 안될떄는 tomcat이 깔린 폴더에 가서 라이브러리 폴더에 jsp-api를 추가
  }
%>



</body>
</html>
