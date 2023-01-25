package com.xloop.resourceloop.candidateprofile.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter

@Entity
@Table(name = "candidate_academic_information")
public class CandidateAcademicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String currentDegree;
    @Setter
    private String Title;
    @Setter
    private String University;
    @Setter
    private String Degree_progress;
    @Setter
    @Column(columnDefinition = "date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    // private Date dateOfBirth;
    private Date Graduation_date;
    
    @Setter
    private float CGPA;
    @Setter
    private String Final_Year_Project;
    @Setter
    private String Certificates;
}
