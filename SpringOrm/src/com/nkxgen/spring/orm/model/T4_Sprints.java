package com.nkxgen.spring.orm.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_Sprints")
public class T4_Sprints {

    @Id
    private Integer sprn_id;

    @ManyToOne
    @JoinColumn(name = "sprn_modl_id", foreignKey = @ForeignKey(name = "fk_sprints_modules"))
    private T4_ProjectModules module;

    @ManyToOne
    @JoinColumn(name = "sprn_master", foreignKey = @ForeignKey(name = "fk_sprints_users"))
    private T4_Users master;

    private Date sprn_stdate;
    private Date sprn_enddate;

    @ManyToOne
    @JoinColumn(name = "proj_id", foreignKey = @ForeignKey(name = "fk_sprints_projects"))
    private T4_Projects project;

    public T4_Sprints() {
    }

    public Integer getSprn_id() {
        return sprn_id;
    }

    public void setSprn_id(Integer sprn_id) {
        this.sprn_id = sprn_id;
    }

    public T4_ProjectModules getModule() {
        return module;
    }

    public void setModule(T4_ProjectModules module) {
        this.module = module;
    }

    public T4_Users getMaster() {
        return master;
    }

    public void setMaster(T4_Users master) {
        this.master = master;
    }

    public Date getSprn_stdate() {
        return sprn_stdate;
    }

    public void setSprn_stdate(Date sprn_stdate) {
        this.sprn_stdate = sprn_stdate;
    }

    public Date getSprn_enddate() {
        return sprn_enddate;
    }

    public void setSprn_enddate(Date sprn_enddate) {
        this.sprn_enddate = sprn_enddate;
    }

    public T4_Projects getProject() {
        return project;
    }

    public void setProject(T4_Projects project) {
        this.project = project;
    }
}
