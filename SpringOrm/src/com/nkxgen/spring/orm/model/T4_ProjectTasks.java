package com.nkxgen.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_ProjectTasks")
public class T4_ProjectTasks implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id", foreignKey = @ForeignKey(name = "fk_projecttasks_tasks"))
    private T4_Tasks task;

    private Integer task_modl_id;

    @ManyToOne
    @JoinColumn(name = "task_user_id", foreignKey = @ForeignKey(name = "fk_projecttasks_users"))
    private T4_Users user;

    @ManyToOne
    @JoinColumn(name = "proj_id", foreignKey = @ForeignKey(name = "fk_projecttasks_projects"))
    private T4_Projects project;

    public T4_ProjectTasks() {
    }

    public T4_Tasks getTask() {
        return task;
    }

    public void setTask(T4_Tasks task) {
        this.task = task;
    }

    public Integer getTask_modl_id() {
        return task_modl_id;
    }

    public void setTask_modl_id(Integer task_modl_id) {
        this.task_modl_id = task_modl_id;
    }

    public T4_Users getUser() {
        return user;
    }

    public void setUser(T4_Users user) {
        this.user = user;
    }

    public T4_Projects getProject() {
        return project;
    }

    public void setProject(T4_Projects project) {
        this.project = project;
    }
}
