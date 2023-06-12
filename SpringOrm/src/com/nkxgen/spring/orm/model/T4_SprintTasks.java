package com.nkxgen.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_SprintTasks")
public class T4_SprintTasks implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "sprn_id", foreignKey = @ForeignKey(name = "fk_sprinttasks_sprints"))
    private T4_Sprints sprint;

    @ManyToOne
    @JoinColumn(name = "task_id", foreignKey = @ForeignKey(name = "fk_sprinttasks_tasks"))
    private T4_Tasks task;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_sprinttasks_users"))
    private T4_Users user;

    public T4_SprintTasks() {
    }

    public T4_Sprints getSprint() {
        return sprint;
    }

    public void setSprint(T4_Sprints sprint) {
        this.sprint = sprint;
    }

    public T4_Tasks getTask() {
        return task;
    }

    public void setTask(T4_Tasks task) {
        this.task = task;
    }

    public T4_Users getUser() {
        return user;
    }

    public void setUser(T4_Users user) {
        this.user = user;
    }
}
