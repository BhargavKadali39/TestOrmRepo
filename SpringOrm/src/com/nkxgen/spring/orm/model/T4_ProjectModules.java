package com.nkxgen.spring.orm.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T4_ProjectModules")
public class T4_ProjectModules {

	@Id
	private Integer modl_id;
	private String modl_name;
	private String modl_desc;

	@ManyToOne
	@JoinColumn(name = "modl_proj_id", foreignKey = @ForeignKey(name = "fk_modules_projects"))
	private T4_Projects project;

	public T4_ProjectModules() {
	}

	public Integer getModl_id() {
		return modl_id;
	}

	public void setModl_id(Integer modl_id) {
		this.modl_id = modl_id;
	}

	public String getModl_name() {
		return modl_name;
	}

	public void setModl_name(String modl_name) {
		this.modl_name = modl_name;
	}

	public String getModl_desc() {
		return modl_desc;
	}

	public void setModl_desc(String modl_desc) {
		this.modl_desc = modl_desc;
	}

	public T4_Projects getProject() {
		return project;
	}

	public void setProject(T4_Projects project) {
		this.project = project;
	}
}
