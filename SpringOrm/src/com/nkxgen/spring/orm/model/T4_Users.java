package com.nkxgen.spring.orm.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "T4_Users")
public class T4_Users {

    @Id
    private Integer user_id;
    private String user_displayname;
    private String user_password;
    private Date user_cdate;
    private String user_empl_id;
    private String user_status;
    private Date user_ludate;

    @ManyToOne
    @JoinColumn(name = "user_role", foreignKey = @ForeignKey(name = "fk_users_roles"))
    private T4_Roles role;

    public T4_Users() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_displayname() {
        return user_displayname;
    }

    public void setUser_displayname(String user_displayname) {
        this.user_displayname = user_displayname;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Date getUser_cdate() {
        return user_cdate;
    }

    public void setUser_cdate(Date user_cdate) {
        this.user_cdate = user_cdate;
    }

    public String getUser_empl_id() {
        return user_empl_id;
    }

    public void setUser_empl_id(String user_empl_id) {
        this.user_empl_id = user_empl_id;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public Date getUser_ludate() {
        return user_ludate;
    }

    public void setUser_ludate(Date user_ludate) {
        this.user_ludate = user_ludate;
    }

    public T4_Roles getRole() {
        return role;
    }

    public void setRole(T4_Roles role) {
        this.role = role;
    }
}
