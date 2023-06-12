package com.nkxgen.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_SprintResources")
public class T4_SprintResources implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "sprn_id", foreignKey = @ForeignKey(name = "fk_sprintresources_sprints"))
    private T4_Sprints sprint;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_sprintresources_users"))
    private T4_Users user;

    @ManyToOne
    @JoinColumn(name = "sprs_role_id", foreignKey = @ForeignKey(name = "fk_sprintresources_roles"))
    private T4_Roles role;

    public T4_SprintResources() {
    }

    public T4_Sprints getSprint() {
        return sprint;
    }

    public void setSprint(T4_Sprints sprint) {
        this.sprint = sprint;
    }

    public T4_Users getUser() {
        return user;
    }

    public void setUser(T4_Users user) {
        this.user = user;
    }

    public T4_Roles getRole() {
        return role;
    }

    public void setRole(T4_Roles role) {
        this.role = role;
    }
}
