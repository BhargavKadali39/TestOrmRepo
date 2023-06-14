<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<embed id="sideframe" src="" style="width: 100%; height: 100%;">
<button onclick="loadAnalytics">click</button>
</body>
<script>
    function loadAnalytics() {
      var frame2 = document.getElementById('sideframe');
      frame2.src = 'login.jsp';
    }

    function loadpast() {
      var frame2 = document.getElementById('sideframe');
      frame2.src = 'pastdue.jsp';
    }
  </script>
</html>