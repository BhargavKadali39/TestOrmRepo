package com.nkxgen.spring.orm.model;

import java.sql.Date;

public class ProjectInput {

	private short projectId;
	private String projectName;
	private String projectDescription;
	private Date projectStartDate;
	private Short projectManager;
	private String projectStatus;
	private Date projectLastUpdatedDate;

	public short getProjectId() {
		return projectId;
	}

	public void setProjectId(short projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Short getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(Short projectManager) {
		this.projectManager = projectManager;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public Date getProjectLastUpdatedDate() {
		return projectLastUpdatedDate;
	}

	public void setProjectLastUpdatedDate(Date projectLastUpdatedDate) {
		this.projectLastUpdatedDate = projectLastUpdatedDate;
	}

	public Project toEntity() {
		Project project = new Project();
		project.setProjectId(this.projectId);
		project.setProjectName(this.projectName);
		project.setProjectDescription(this.projectDescription);
		project.setProjectStartDate(this.projectStartDate);
		User user = new User();
		user.setUserId((int) this.projectManager);
		project.setProjectManager(user);
		return project;
	}

}
