package com.interview.WebTestapplication.candidate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "poc")
public class POC {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    private long userId;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Designation")
    private String designation;

    @Column(name="service")
    private String service;

    @Column(name = "ReportingManager")
    private String reportingManager;



    public POC(String fullName, String designation, String service, String reportingManager,long userId) {
        this.fullName = fullName;
        this.designation = designation;
        this.service = service;
        this.reportingManager = reportingManager;
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }



    protected POC() {

    }

    @Override
    public String toString() {
        return "{" + "userId=" + userId + ", fullName='" + fullName + '\'' + ", designation='"
            + designation + '\'' + ", service='" + service + '\'' + ", reportingManager='"
            + reportingManager + '\'' + '}';
    }
}
