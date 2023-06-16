package org.team4.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class T4_TasksMapper implements RowMapper<T4_Tasks> {

	@Override
	public T4_Tasks mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		T4_Tasks ts = new T4_Tasks();
		ts.setTask_id(rs.getInt("task_id"));
		ts.setTask_name(rs.getString("task_name"));
		ts.setTask_cdatetime(rs.getDate("task_cdatetime"));
		ts.setTask_type(rs.getString("task_type"));
		ts.setTask_ref_task_id(rs.getInt("task_ref_task_id"));
		ts.setTask_category(rs.getString("task_category"));
		ts.setTask_desc(rs.getString("task_desc"));
		ts.setTask_creator(rs.getInt("task_creator"));
		ts.setTask_noh_reqd(rs.getInt("task_noh_reqd"));
		ts.setTask_exp_datetime(rs.getDate("task_exp_datetime"));
		ts.setTask_cmp_datetime(rs.getDate("task_cmp_datetime"));
		ts.setTask_supervisor(rs.getInt("task_supervisor"));
		ts.setTask_remarks(rs.getString("task_remarks"));
		ts.setTask_status(rs.getString("task_status"));
		ts.setProj_id(rs.getInt("proj_id"));
		ts.setModl_id(rs.getInt("modl_id"));
		return ts;
	}

}
