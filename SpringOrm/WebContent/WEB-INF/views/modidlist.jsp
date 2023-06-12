<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.nkxgen.spring.orm.model.T4_ProjectModules,com.nkxgen.spring.orm.model.T4_Projects,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mod Id List through Spring ORM </title>
</head>
<body>
    <h1>Mod IdList through Spring ORM </h1>

    <table border="1">
        <tr>
            <th>Modl_id</th>
            <th>Modl_name</th>
            <th>Modl_desc</th>
            <th>Modl_Proj_id</th>
        </tr>
        <%
            List<T4_ProjectModules> modules = (List<T4_ProjectModules>) request.getAttribute("pmidList");
            for (T4_ProjectModules mods : modules) {
                T4_Projects proj = (T4_Projects)mods.getProject();
        %>
        <tr>
            <td><%= mods.getModl_id() %></td>
            <td><%= mods.getModl_name() %></td>
            <td><%= mods.getModl_desc() %></td>
            <td><%= proj.getProj_id()%></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>