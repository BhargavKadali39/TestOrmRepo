package org.team4.spring.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team4.spring.essentials.Login;
import org.team4.spring.essentials.Mail;
import org.team4.spring.essentials.User;
import org.team4.spring.model.T4_Analytics;

import com.google.gson.Gson;

// @Controller
public class LoginController {

	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	PreparedStatement statement = null;
	// EmpService eserv;
	// ProService pserv;
	// T4_ProjectModuleService promodserv;
	User user = new User(1, "John Doe", "password123", "2023-06-08", "EMP001", "Active", (short) 1,
			"2023-06-08 10:30:00");

	@Autowired
	public LoginController() throws ClassNotFoundException, SQLException {
		System.out.println("Here");
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://192.168.110.48:5432/plf_training";
		String username = "plf_training_admin";
		String password = "pff123";
		connection = DriverManager.getConnection(url, username, password);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		System.out.println("Login JSP Requested");
		return "login";
	}

	@RequestMapping(value = "/getProjAnaById", method = RequestMethod.POST)
	public @ResponseBody String getProjAnalysisById(@RequestParam("user_id") Integer user_id) throws SQLException {
		String response = "res : " + user_id;
		String query = "SELECT p.proj_id, p.proj_name, ABS(SUM(EXTRACT(EPOCH FROM (t.task_cmp_datetime - t.task_cdatetime))) / 3600) AS total_working_hours "
				+ "FROM T4_Projects p " + "JOIN T4_ProjectTasks pt ON p.proj_id = pt.proj_id "
				+ "JOIN T4_Tasks t ON pt.task_id = t.task_id " + "WHERE pt.task_user_id = ? "
				+ "GROUP BY p.proj_id, p.proj_name";

		Map<String, Integer> projectWorkingHoursMap = new HashMap<>();
		statement = connection.prepareStatement(query);
		statement.setInt(1, user_id);
		ResultSet rs = statement.executeQuery();
		T4_Analytics an = new T4_Analytics();
		while (rs.next()) {
			int projId = rs.getInt("proj_id");
			String project_name = rs.getString("proj_name");
			double project_working_hours = rs.getDouble("total_working_hours");
			an.setProject_name(project_name);
			an.setProject_working_hours(project_working_hours);
			// Do something with the retrieved data
			projectWorkingHoursMap.put(project_name, (int) project_working_hours);
		}
		Gson gson = new Gson();
		String json = gson.toJson(projectWorkingHoursMap);

		System.out.println(user_id + "\n" + json);
		return json;
		// return projectWorkingHoursMap;
	}

	@RequestMapping(value = "/getModlAnaById", method = RequestMethod.POST)
	public @ResponseBody String getModlAnalysisById(@RequestParam("user_id") Integer user_id) throws SQLException {
		String response = "res : " + user_id;
		String query = "SELECT p.proj_id, p.proj_name, ABS(SUM(EXTRACT(EPOCH FROM (t.task_cmp_datetime - t.task_cdatetime))) / 3600) AS total_working_hours "
				+ "FROM T4_Projects p " + "JOIN T4_ProjectTasks pt ON p.proj_id = pt.proj_id "
				+ "JOIN T4_Tasks t ON pt.task_id = t.task_id " + "WHERE pt.task_user_id = ? "
				+ "GROUP BY p.proj_id, p.proj_name";
		Map<String, Integer> projectWorkingHoursMap = new HashMap<>();
		statement = connection.prepareStatement(query);
		statement.setInt(1, user_id);
		ResultSet rs = statement.executeQuery();
		T4_Analytics an = new T4_Analytics();
		while (rs.next()) {
			int projId = rs.getInt("proj_id");
			String project_name = rs.getString("proj_name");
			double project_working_hours = rs.getDouble("total_working_hours");
			an.setProject_name(project_name);
			an.setProject_working_hours(project_working_hours);
			// Do something with the retrieved data
			projectWorkingHoursMap.put(project_name, (int) project_working_hours);
		}
		Gson gson = new Gson();
		String json = gson.toJson(projectWorkingHoursMap);

		System.out.println(user_id + "\n" + json);
		return json;
		// return projectWorkingHoursMap;
	}

	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public String getLoginPage(Model model) {
	// System.out.println("Profile JSP Requested");
	// model.addAttribute("user", this.user);
	// return "profile";
	// }

	@RequestMapping(value = "wedit", method = RequestMethod.GET)
	public String getNewedit(Model model) {
		System.out.println("Newedit JSP Requested");
		model.addAttribute("user", this.user);
		return "Newedit";
	}

	@RequestMapping(value = "/verify", method = RequestMethod.GET)
	public String getVerified(@Validated Login log, Model model) throws SQLException {
		System.out.println("managerAnalytics JSP Requested");

		// Execute SQL query
		String sql = "select * from T4_Users";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		User user = new User();
		// Retrieve and display data
		while (rs.next()) {
			Integer userid = rs.getInt("user_id");
			String name = rs.getString("user_displayname");
			String pwd = rs.getString("user_password");
			String user_empl_id = rs.getString("user_empl_id");
			String user_status = rs.getString("user_status");
			short role = rs.getShort("user_role");

			if (log.getUname().equalsIgnoreCase(name) && log.getPassword().equalsIgnoreCase(pwd)) {
				user.setUser_displayname(name);
				user.setUser_id(userid);
				user.setUser_password(pwd);
				user.setUser_empl_id(user_empl_id);
				user.setUser_status(user_status);
				user.setUser_role(role);
				System.out.println("logged in");
				model.addAttribute("user", user);
				if (Integer.toString(role).equalsIgnoreCase("1")) {
					// return "managerAnalytics";
					// return "analytics";
					return "prod";
				} else {
					// return "analytics";
					return "productivity";
				}

			}
		}
		return "login";

	}

	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public String getAllEmployees(@Validated Login log, Model model) {
		System.out.println("Login List JSP Requested");

		// Get the email parameter from the request
		String emailid = log.getEmail();
		System.out.println(emailid);
		Mail mail = new Mail();
		mail.email(emailid);
		// response.sendRedirect("otp.jsp");

		return "otp";
	}

	@RequestMapping(value = "/mail", method = RequestMethod.GET)
	public String getMail(Model model) {
		System.out.println("Mail JSP Requested");
		return "mail";
	}

	@RequestMapping(value = "/an", method = RequestMethod.GET)
	public String getAnalytics(Model model) {
		System.out.println("Analytics JSP Requested");
		return "analytics";
	}

	@RequestMapping(value = "/man", method = RequestMethod.GET)
	public String getManagerAnalytics(Model model) {
		System.out.println("Manager Analytics JSP Requested");
		return "managerAnalytics";
	}

	@RequestMapping(value = "/getEmail", method = RequestMethod.GET)
	public String getForgotPage(Model model) {
		System.out.println("getforgotpassword JSP Requested");
		return "mail";
	}

	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String getErrorPage(Model model) {
		System.out.println("Error Page JSP Requested");
		return "404error";
	}
}
