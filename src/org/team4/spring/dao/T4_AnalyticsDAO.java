package org.team4.spring.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.team4.spring.model.T4_Projects;

public interface T4_AnalyticsDAO {
	T4_Projects getProjById(Integer projid);

	List<T4_Projects> getAllProjs();

	// boolean deleteTask(T4_Tasks ts);
	List<T4_Projects> getProjectsByStatus(String status);

	Map<String, Integer> getProjAnalysisById(Integer user_id) throws SQLException;

}
