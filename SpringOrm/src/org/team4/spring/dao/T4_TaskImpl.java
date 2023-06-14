package org.team4.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.team4.spring.model.T4_Tasks;
import org.team4.spring.model.T4_TasksMapper;

public class T4_TaskImpl implements T4_taskDAO {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_TASK = "select * from T4_TASKS where task_id= ?";
	// private final String SQL_UPDATE_PROGRAMMER = "update T4_TASKS set name = ?, dob = ?, doj = ?, gender = ?, prof1 =
	// ?, prof2 = ?, salary = ? where progid = ?";
	private final String SQL_GET_ALL = "select * from T4_TASKS";
	private final String SQL_INSERT_TASK = "insert into T4_TASKS (progid,name, dob, doj, gender,prof1,prof2,salary) values(?,?,?,?,?,?,?,?)";
	private final String SQL_GET_ALL_PAST_30DAYS_COMPLETED_TASKS = "SELECT date_series.completed_date, COUNT(T4_Tasks.task_id) AS completed_tasks FROM(SELECT generate_series(CURRENT_DATE - INTERVAL '30 days', CURRENT_DATE, INTERVAL '1 day') AS completed_date) AS date_series LEFT JOIN T4_Tasks ON date_trunc('day', T4_Tasks.task_cmp_datetime) = date_series.completed_date AND T4_Tasks.task_status = 'COMP' WHERE date_series.completed_date >= CURRENT_DATE - INTERVAL '30 days' GROUP BY date_series.completed_date ORDER BY date_series.completed_date;";

	@Autowired
	public T4_TaskImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public T4_Tasks getTaskByNo(Integer taskid) {
		// TODO Auto-generated method stub
		return (T4_Tasks) jdbcTemplate.query(SQL_FIND_TASK, new T4_TasksMapper());
	}

	@Override
	public List<T4_Tasks> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTask(T4_Tasks tk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createTask(T4_Tasks tk) {
		// TODO Auto-generated method stub
		return false;
	}

}
