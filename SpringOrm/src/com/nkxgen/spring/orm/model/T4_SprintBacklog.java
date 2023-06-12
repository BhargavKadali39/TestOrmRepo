package com.nkxgen.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_SprintBacklog")
public class T4_SprintBacklog implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @ManyToOne
    @JoinColumn(name = "sprn_id", referencedColumnName = "sprn_id", foreignKey = @ForeignKey(name = "fk_sprintbacklog_sprints"))
    private T4_Sprints sprint;

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "task_id", foreignKey = @ForeignKey(name = "fk_sprintbacklog_tasks"))
    private T4_Tasks task;

    public T4_SprintBacklog() {
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
}
