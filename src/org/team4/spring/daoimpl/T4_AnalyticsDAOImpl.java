package org.team4.spring.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.team4.spring.dao.T4_AnalyticsDAO;
import org.team4.spring.model.T4_Analytics;
import org.team4.spring.model.T4_Projects;

public class T4_AnalyticsDAOImpl implements T4_AnalyticsDAO {
	Connection connection = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	PreparedStatement statement = null;

	public T4_AnalyticsDAOImpl() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://192.168.110.48:5432/plf_training";
		String username = "plf_training_admin";
		String password = "pff123";
		connection = DriverManager.getConnection(url, username, password);
	}

	@Override
	public T4_Projects getProjById(Integer projid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T4_Projects> getAllProjs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T4_Projects> getProjectsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getProjAnalysisById(Integer user_id) throws SQLException {
		// TODO Auto-generated method stub
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
			String project_name = rs.getString("proj_name");
			double project_working_hours = rs.getDouble("total_working_hours");
			an.setProject_name(project_name);
			an.setProject_working_hours(project_working_hours);
			projectWorkingHoursMap.put(project_name, (int) project_working_hours);
		}
		return projectWorkingHoursMap;
	}

}
