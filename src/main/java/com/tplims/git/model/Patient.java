package com.tplims.git.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table()
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    private String patientId;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private Integer age;

    private String address;

    private String drName;

    @ElementCollection(targetClass=String.class)
    private List<String> testName;

    private String createdBy;

    private String createdOn;

    private String updatedBy;

    private String updatedOn;

    private Boolean isActive;

    private String totalCost;

}
