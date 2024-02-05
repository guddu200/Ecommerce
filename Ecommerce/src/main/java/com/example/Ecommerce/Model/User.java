package com.example.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "ecommerce_user")

public class User {
    @GeneratedValue
    @Id

    @Column(name = "user_id")
    private  int id;
    @Column(name = "user_mobile")
    private int mobile;
    @Column(name = "user_first_name")
    private  String fName;
    @Column(name="user_last_name")
    private String lName;
    @Column(name = "user_email")
    private String email;
    @Column(name="user_password")
    private String password;
    @Column(name="user_address")
    private String address;
    @Column(name = "user_dob")
    private Date dob;
}
