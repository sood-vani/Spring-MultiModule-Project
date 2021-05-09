package com.spring.spring2021.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

    @Id
    private Long doctorId;

    private String doctorName;
    private String doctorSpecialisation;

    public Doctor() {
    }

    public Doctor(Long doctorId, String doctorName, String doctorSpecialisation) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorSpecialisation = doctorSpecialisation;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialisation() {
        return doctorSpecialisation;
    }

    public void setDoctorSpecialisation(String doctorSpecialisation) {
        this.doctorSpecialisation = doctorSpecialisation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doctor{");
        sb.append("doctorId=").append(doctorId);
        sb.append(", doctorName='").append(doctorName).append('\'');
        sb.append(", doctorSpecialisation='").append(doctorSpecialisation).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
