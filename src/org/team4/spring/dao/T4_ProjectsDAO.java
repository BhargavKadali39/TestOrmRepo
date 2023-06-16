package org.team4.spring.dao;

import java.util.List;

import org.team4.spring.model.T4_Projects;
import org.team4.spring.model.T4_Tasks;

public interface T4_ProjectsDAO {
	T4_Projects getProjById(Integer projid);

	List<T4_Projects> getAllProjs();

	// boolean deleteTask(T4_Tasks ts);
	List<T4_Projects> getProjectsByStatus(String status);

	boolean updateTask(T4_Tasks tk);

	boolean createTask(T4_Tasks tk);
}
