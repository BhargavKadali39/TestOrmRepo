package com.nkxgen.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_SubTasks")
public class T4_SubTasks implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id", foreignKey = @ForeignKey(name = "fk_subtasks_tasks"))
    private T4_Tasks task;

    private Integer sbts_id;
    private Integer sbts_parent_sbts_id;

    public T4_SubTasks() {
    }

    public T4_Tasks getTask() {
        return task;
    }

    public void setTask(T4_Tasks task) {
        this.task = task;
    }

    public Integer getSbts_id() {
        return sbts_id;
    }

    public void setSbts_id(Integer sbts_id) {
        this.sbts_id = sbts_id;
    }

    public Integer getSbts_parent_sbts_id() {
        return sbts_parent_sbts_id;
    }

    public void setSbts_parent_sbts_id(Integer sbts_parent_sbts_id) {
        this.sbts_parent_sbts_id = sbts_parent_sbts_id;
    }
}
