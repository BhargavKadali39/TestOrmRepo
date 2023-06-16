package org.team4.spring.model;

import java.sql.Date;

public class T4_Tasks {

	private Integer task_id;
	private String task_name;
	private Date task_cdatetime;
	private String task_type;
	private Integer task_ref_task_id;
	private String task_category;
	private String task_desc;
	private Integer task_creator;
	private Double task_noh_reqd;
	private Date task_exp_datetime;
	private Date task_cmp_datetime;
	private Integer task_supervisor;
	private String task_remarks;
	private String task_status;
	private Integer proj_id;
	private Integer modl_id;

	public T4_Tasks() {
	}

	public T4_Tasks(Integer task_id, String task_name, Date task_cdatetime, String task_type, Integer task_ref_task_id,
			String task_category, String task_desc, Integer task_creator, Double task_noh_reqd, Date task_exp_datetime,
			Date task_cmp_datetime, Integer task_supervisor, String task_remarks, String task_status, Integer proj_id,
			Integer modl_id) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.task_cdatetime = task_cdatetime;
		this.task_type = task_type;
		this.task_ref_task_id = task_ref_task_id;
		this.task_category = task_category;
		this.task_desc = task_desc;
		this.task_creator = task_creator;
		this.task_noh_reqd = task_noh_reqd;
		this.task_exp_datetime = task_exp_datetime;
		this.task_cmp_datetime = task_cmp_datetime;
		this.task_supervisor = task_supervisor;
		this.task_remarks = task_remarks;
		this.task_status = task_status;
		this.proj_id = proj_id;
		this.modl_id = modl_id;
	}

	public Integer getTask_id() {
		return task_id;
	}

	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public Date getTask_cdatetime() {
		return task_cdatetime;
	}

	public void setTask_cdatetime(Date task_cdatetime) {
		this.task_cdatetime = task_cdatetime;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public Integer getTask_ref_task_id() {
		return task_ref_task_id;
	}

	public void setTask_ref_task_id(Integer task_ref_task_id) {
		this.task_ref_task_id = task_ref_task_id;
	}

	public String getTask_category() {
		return task_category;
	}

	public void setTask_category(String task_category) {
		this.task_category = task_category;
	}

	public String getTask_desc() {
		return task_desc;
	}

	public void setTask_desc(String task_desc) {
		this.task_desc = task_desc;
	}

	public Integer getTask_creator() {
		return task_creator;
	}

	public void setTask_creator(Integer task_creator) {
		this.task_creator = task_creator;
	}

	public Double getTask_noh_reqd() {
		return task_noh_reqd;
	}

	public void setTask_noh_reqd(double i) {
		this.task_noh_reqd = i;
	}

	public Date getTask_exp_datetime() {
		return task_exp_datetime;
	}

	public void setTask_exp_datetime(Date task_exp_datetime) {
		this.task_exp_datetime = task_exp_datetime;
	}

	public Date getTask_cmp_datetime() {
		return task_cmp_datetime;
	}

	public void setTask_cmp_datetime(Date task_cmp_datetime) {
		this.task_cmp_datetime = task_cmp_datetime;
	}

	public Integer getTask_supervisor() {
		return task_supervisor;
	}

	public void setTask_supervisor(Integer task_supervisor) {
		this.task_supervisor = task_supervisor;
	}

	public String getTask_remarks() {
		return task_remarks;
	}

	public void setTask_remarks(String task_remarks) {
		this.task_remarks = task_remarks;
	}

	public String getTask_status() {
		return task_status;
	}

	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}

	public Integer getProj_id() {
		return proj_id;
	}

	public void setProj_id(Integer proj_id) {
		this.proj_id = proj_id;
	}

	public Integer getModl_id() {
		return modl_id;
	}

	public void setModl_id(Integer modl_id) {
		this.modl_id = modl_id;
	}

}
