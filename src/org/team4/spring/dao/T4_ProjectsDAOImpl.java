package org.team4.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.team4.spring.model.T4_Projects;
import org.team4.spring.model.T4_Tasks;

public class T4_ProjectsDAOImpl implements T4_ProjectsDAO {

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
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<T4_Projects> res = null;
		try {
			// Establish database connection
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://192.168.110.48:5432/plf_training";
			String username = "plf_training_admin";
			String password = "pff123";
			conn = DriverManager.getConnection(url, username, password);

			String sql = "SELECT * FROM t4_projects WHERE proj_stat LIKE ? ";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, status);
			rs = statement.executeQuery();
			res = null;
			T4_Projects pr = new T4_Projects();
			while (rs.next()) {
				pr.setProj_id(rs.getInt("proj_id"));
				pr.setProj_name(rs.getString("proj_name"));
			}
			res.add(pr);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
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
