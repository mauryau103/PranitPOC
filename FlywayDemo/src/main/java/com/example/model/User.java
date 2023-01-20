package com.example.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}
