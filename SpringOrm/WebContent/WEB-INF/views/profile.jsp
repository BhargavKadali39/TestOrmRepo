<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "org.team4.spring.essentials.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="wedit">

<% User user = (User) request.getAttribute("user"); %>
<p><%= user %></p>
  <table>
    <tr>
      <td>User Id:</td>
      <td><input type="number"  name="user_id" value=<%= user.getUser_id() %>  disabled></td>
    </tr>
    <tr>
      <td>Name:</td>
      <td><input type="text" name="user_displayname" value=<%= user.getUser_displayname() %> id="name" disabled></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><input type="text" name="user_password" value=<%= user.getUser_password() %>   id="pass" disabled></td>
    </tr>
    <tr>
    	<td><input type="checkbox" onclick="toggleVisibility()"></td>
    	<td>Show Password</td>
    </tr>
    <tr>
      <td>Join date:</td>
      <td><input type="date"   disabled></td>
    </tr>
    <tr>
      <td>Status:</td>
      <td><input type="text"   disabled></td>
    </tr>
    <tr>
      <td>Employee Id:</td>
      <td><input type="text"  disabled></td>
    </tr>
    <tr>
      <td>Role:</td>
      <td><input type="text"   disabled></td>
    </tr>
  </table>
  <input type="submit"  value="Edit">
  
  </form>
</body>
</html>
