package org.team4.spring.dao;

import java.util.List;

import org.team4.spring.model.T4_Tasks;

public interface T4_taskDAO {
	T4_Tasks getTaskByNo(Integer taskid);

	List<T4_Tasks> getAllTasks();

	// boolean deleteTask(T4_Tasks ts);

	boolean updateTask(T4_Tasks tk);

	boolean createTask(T4_Tasks tk);

}
