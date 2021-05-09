package com.spring.spring2021.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
    @Id
    private Long id;
    private String hospitalName;
    private String branchName;
    private String location;
    private String mobileNumber;

    public Hospital() {
    }

    public Hospital(Long id, String hospitalName, String branchName, String location, String mobileNumber) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.branchName = branchName;
        this.location = location;
        this.mobileNumber = mobileNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hospital{");
        sb.append("id=").append(id);
        sb.append(", hospitalName='").append(hospitalName).append('\'');
        sb.append(", branchName='").append(branchName).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", mobileNumber='").append(mobileNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
