<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "org.team4.spring.essentials.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%  User user = (User) request.getAttribute("user"); %>
    <p> User Name: <%= user.getUser_displayname() %> </p>
<form action="profile" method="get">
<table>
<tr>
  <td>User Id:</td>
  <td><input type="number" value="206" disabled></td>
</tr>
<tr>
  <td>Name:</td>
  <td><input type="text" name="user_displayname" value=<%= user.getUser_displayname() %> id="inputName"></td>
</tr>
<tr>
  <td>Password:</td>
  <td><input type="text" value="srivamsi" id="inputPassword" disabled></td>
</tr>
<!-- <tr>
    <td><input type="checkbox" onclick="toggleVisibility()"></td>
    <td>Show Password</td>
</tr>
 --><tr>
  <td>Join date:</td>
  <td><input type="date" value="2023-02-02" disabled></td>
</tr>
<tr>
  <td>Status:</td>
  <td><input type="text" value="active" disabled></td>
</tr>
<tr>
  <td>Employee Id:</td>
  <td><input type="text" value="19B91Ao418" disabled></td>
</tr>
<tr>
  <td>Role:</td>
  <td><input type="text" value="dev" disabled></td>
</tr>
</table>
<!-- <button  onclick="saveChanges()">Save Changes</button>
<button onclick="location.href='changePassword.jsp'">change password</button> -->
<input type="submit" value="save-changes">
</form>
<script>
<%-- function saveChanges() {
  var name = document.getElementById("inputName").value;
  var password = '<%= request.getParameter("password") %>';
  document.getElementById("inputPassword").value = password;
  // Construct the URL with the updated values as parameters
  var url = "profile.jsp?name=" + encodeURIComponent(name)+"&password="+encodeURIComponent(password);

console.log(password);
  // Redirect to the profile page with the updated values
  window.location.href = url;
} --%>


/* function toggleVisibility() {  
	  var getPasword = document.getElementById("inputPassword");  
	  if (getPasword.type === "password") {  
	    getPasword.type = "text";  
	  } else {  
	    getPasword.type = "password";  
	  }  
	}  */
</script>

</body>
</html>
