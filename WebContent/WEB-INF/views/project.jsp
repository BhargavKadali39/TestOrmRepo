<%@page import="java.sql.*,org.team4.spring.model.T4_Projects,java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
    <title>Card Grid View with Bootstrap</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <% String filterVal= "all"; %>
</head>
<body>
<form id="myForm" action="projectDetails">
    <select onchange="filterChange()" id="status-filter" class="form-control">
        <option value="%">All</option>
        <option value="%CM%">Completed</option>
        <option value="%OG%">Ongoing</option>
        <option value="%DC%">Discontinued</option>
    </select>
<% 
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        // Establish database connection
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://192.168.110.48:5432/plf_training";
        String username = "plf_training_admin";
        String password = "pff123";
        conn = DriverManager.getConnection(url, username, password);
        String projFilter = (String)request.getAttribute("projFilter");

        String sql = "SELECT * FROM t4_projects WHERE proj_stat LIKE ? ";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, projFilter);
        rs = statement.executeQuery();
    %>
        <div class="container">
            <div class="card-columns">
            <%
                while (rs.next()) {
                    String date = rs.getString("Date");
                    String employeeName = rs.getString("EmployeeName");
                    String task = rs.getString("Task");
                    double timeSpent = rs.getDouble("TimeSpent");
                    double efficiencyRating = rs.getDouble("EfficiencyRating");
            %>
            <div class="card clickable-row" onclick="location.href='projectDetails'">
                    <h5 class="card-title">View Project</h5>
                    <div class="card-body">
                        <p class="card-text"><%= employeeName %></p>
                    </div>
                </div>
            <% 
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            } finally {
                // Close database connections and resources
                try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        %>
            </div>
        </div>
	</form>
    <button class="btn btn-primary btn-add-project" type="button">Add Project</button>
    
</body>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script>
    function filterChange(){
    	var filterStat = document.getElementById("status-filter").value;
    	$.ajax({
    		  type: "POST",
    		  url: "/your-controller-url",
    		  data: JSON.stringify(dataToSend),
    		  contentType: "application/json",
    		  success: function(response) {
    		    // Handle the response from the controller
    		    console.log(response);
    		  },
    		  error: function(error) {
    		    // Handle any errors that occur during the AJAX call
    		    console.log(error);
    		  }
    		});
    }
    </script>
       <style>
        body, html {
            height: 100%;
        }
        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100%;
        }
        .card {
            margin-bottom: 20px;
            background-color: #f8f9fa;
        }
        .card-title {
            padding: 10px;
            background-color: #e9ecef;
            margin-bottom: 0;
        }
        .card-columns {
            column-count: 3;
            column-gap: 20px;
            max-width: 600px;
            margin: 0 auto;
        }
        .btn-add-project {
            display: block;
            margin: 20px auto;
        }
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }

        .container {
            max-width: 900px;
            margin: 0 auto;
        }

        .card-columns {
            column-count: 3;
            column-gap: 20px;
        }

        .card {
            border: none;
            border-radius: 8px;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card-title {
            background-color: #f8f9fa;
            color: #495057;
            font-size: 16px;
            padding: 10px;
            border-top-left-radius: 8px;
            border-top-right-radius: 8px;
            margin-bottom: 0;
        }

        .card-body {
            padding: 20px;
        }

        .card-text {
            color: #6c757d;
            font-size: 14px;
            margin-bottom: 0;
        }

        .btn-add-project {
            display: block;
            margin: 20px auto;
            border-radius: 8px;
        }
        .form-control{
        float:right;
        width:200px;
        }
    </style>
</html>
