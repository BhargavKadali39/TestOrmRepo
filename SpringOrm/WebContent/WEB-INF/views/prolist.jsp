<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.nkxgen.spring.orm.model.T4_Projects,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projects List through Spring ORM </title>
</head>
<body>
    <h1>Projects List through Spring ORM </h1>

    <table border="1">
        <tr>
            <th>Proj_id</th>
            <th>Proj_name</th>
            <th>Proj_desc</th>
            <th>Proj_stdate</th>
            <th>Proj_status</th>
        </tr>
        <%
            List<T4_Projects> projects = (List<T4_Projects>) request.getAttribute("pList");
            for (T4_Projects project : projects) {
        %>
        <tr>
            <td><%= project.getProj_id() %></td>
            <td><%= project.getProj_name() %></td>
            <td><%= project.getProj_desc() %></td>
            <td><%= project.getProj_stdate() %></td>
            <td><%= project.getProj_status() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>