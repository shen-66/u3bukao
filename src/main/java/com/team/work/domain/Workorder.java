package com.team.work.domain;

import java.util.Date;

public class Workorder {
    private Integer id;

    private Integer projectid;

    private String executor;

    private String description;

    private String orderlevel;

    private Date createdate;

    private String projectname;

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @Override
    public String toString() {
        return "Workorder{" +
                "id=" + id +
                ", projectid=" + projectid +
                ", executor='" + executor + '\'' +
                ", description='" + description + '\'' +
                ", orderlevel='" + orderlevel + '\'' +
                ", createdate=" + createdate +
                ", projectname='" + projectname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderlevel() {
        return orderlevel;
    }

    public void setOrderlevel(String orderlevel) {
        this.orderlevel = orderlevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}