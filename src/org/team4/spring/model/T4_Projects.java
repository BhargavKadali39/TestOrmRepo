package org.team4.spring.model;

import java.sql.Date;

public class T4_Projects {
	private Integer proj_id;
	private String proj_name;
	private String proj_desc;
	private Date proj_stdate;
	private Integer proj_manager;
	private String proj_status;

	public T4_Projects() {
	}

	public T4_Projects(Integer proj_id, String proj_name, String proj_desc, Date proj_stdate, Integer proj_manager,
			String proj_status, Date proj_ludate) {
		super();
		this.proj_id = proj_id;
		this.proj_name = proj_name;
		this.proj_desc = proj_desc;
		this.proj_stdate = proj_stdate;
		this.proj_manager = proj_manager;
		this.proj_status = proj_status;
		this.proj_ludate = proj_ludate;
	}

	public Integer getProj_id() {
		return proj_id;
	}

	public void setProj_id(Integer proj_id) {
		this.proj_id = proj_id;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public String getProj_desc() {
		return proj_desc;
	}

	public void setProj_desc(String proj_desc) {
		this.proj_desc = proj_desc;
	}

	public Date getProj_stdate() {
		return proj_stdate;
	}

	public void setProj_stdate(Date proj_stdate) {
		this.proj_stdate = proj_stdate;
	}

	public Integer getProj_manager() {
		return proj_manager;
	}

	public void setProj_manager(Integer proj_manager) {
		this.proj_manager = proj_manager;
	}

	public String getProj_status() {
		return proj_status;
	}

	public void setProj_status(String proj_status) {
		this.proj_status = proj_status;
	}

	public Date getProj_ludate() {
		return proj_ludate;
	}

	public void setProj_ludate(Date proj_ludate) {
		this.proj_ludate = proj_ludate;
	}

	private Date proj_ludate;

}
