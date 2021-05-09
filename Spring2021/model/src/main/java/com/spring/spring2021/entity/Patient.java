package com.spring.spring2021.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    private Long patientId;
    private String patientName;
    private String patientAge;

    public Patient() {
    }

    public Patient(Long patientId, String patientName, String patientAge) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("patientId=").append(patientId);
        sb.append(", patientName='").append(patientName).append('\'');
        sb.append(", patientAge='").append(patientAge).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
