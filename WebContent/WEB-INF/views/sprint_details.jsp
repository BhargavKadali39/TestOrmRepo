<%@ page import="java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sprint Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 20px;
        }

        h1, h2, h3 {
            color: #333333;
        }

        h1 {
            text-align: center;
        }

        h2 {
            margin-top: 20px;
        }

        p {
            margin: 10px 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #cccccc;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }

        a.back-btn {
            display: block;
            margin-top: 20px;
            margin-bottom: 20px;
            text-align: center;
            text-decoration: none;
            color: #ffffff;
            background-color: #007bff;
            padding: 10px 20px;
            border-radius: 5px;
        }

        a.back-btn:hover {
            background-color: #0056b3;
        }

        a.back-btn:active {
            background-color: #003d80;
        }
    </style>
</head>
<body>
    <h1>Sprint Details</h1>

    <% 
    Connection con = null;
    Statement stmt = null;
    ResultSet sprintRs = null;
    ResultSet sprintTaskRs = null;

    try {
        int sprintId = Integer.parseInt(request.getParameter("sprintId"));

        // JDBC code to fetch sprint details from the database
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://192.168.110.48:5432/plf_training?user=plf_training_admin&password=pff123");
        stmt = con.createStatement();
        
        // Fetch sprint information
        sprintRs = stmt.executeQuery("SELECT * FROM Tarak_Sprints WHERE sprn_id = " + sprintId);
        if (sprintRs.next()) {
            String sprintName = sprintRs.getString("sprint_name");
            Timestamp startDate = sprintRs.getTimestamp("sprn_stdate");
            Timestamp endDate = sprintRs.getTimestamp("sprn_enddate");
            int moduleId = sprintRs.getInt("sprn_modl_id");
            int projectId = sprintRs.getInt("proj_id");
    %>
            <h2>Sprint <%= sprintId %></h2>
            <p><strong>Name:</strong> <%= sprintName %></p>
            <p><strong>Start Date:</strong> <%= startDate %></p>
            <p><strong>End Date:</strong> <%= endDate %></p>
            <p><strong>Module ID:</strong> <%= moduleId %></p>
            <p><strong>Project ID:</strong> <%= projectId %></p>
    <% 
        }
        
        // Fetch users and tasks associated with the sprint
        sprintTaskRs = stmt.executeQuery("SELECT user_id, task_id FROM Tarak_SprintTasks WHERE sprn_id = " + sprintId);
    %>
        <h3>Users and Tasks</h3>
        <table>
            <tr>
                <th>User ID</th>
                <th>Task ID</th>
            </tr>
        <% 
        while (sprintTaskRs.next()) {
            // Extract user and task information
            int userId = sprintTaskRs.getInt("user_id");
            int taskId = sprintTaskRs.getInt("task_id");
        %>
            <tr>
                <td><%= userId %></td>
                <td><%= taskId %></td>
            </tr>
        <% 
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close the database resources
        try {
            if (sprintTaskRs != null) {
                sprintTaskRs.close();
            }
            if (sprintRs != null) {
                sprintRs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    %>

    <a href="sprints" class="back-btn">Back to Sprints</a>
</body>
</html>
