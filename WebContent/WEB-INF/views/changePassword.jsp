<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "com.spring.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form id="myform" action="updatePassword">
<% User u =  (User)request.getAttribute("u"); %>
Old password: <input type="password" placeholder="enter old password">
New password: <input type="password" id="user_password" name="user_password" placeholder="enter new password">
Confirm password: <input type="password" placeholder="confirm password">
<button onclick="changePassword();">Change password</button>
</form>
</body>
<script>
function changePassword() {
	console.log(document.getElementById("user_password").value);
    document.getElementById("myform").submit();
    alert("Password changed successfully!");
    // Redirect to the profile page with the updated values
}
</script>
</html>
