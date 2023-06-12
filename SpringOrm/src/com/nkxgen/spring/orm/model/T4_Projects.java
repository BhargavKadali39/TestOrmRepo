package com.nkxgen.spring.orm.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_Projects")
public class T4_Projects {

    @Id
    private Integer proj_id;
    private String proj_name;
    private String proj_desc;
    private Date proj_stdate;
    private String proj_status;
    private Date proj_ludate;

    @ManyToOne
    @JoinColumn(name = "proj_manager", foreignKey = @ForeignKey(name = "fk_projects_users"))
    private T4_Users manager;

    public T4_Projects() {
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

    public T4_Users getManager() {
        return manager;
    }

    public void setManager(T4_Users manager) {
        this.manager = manager;
    }
}
