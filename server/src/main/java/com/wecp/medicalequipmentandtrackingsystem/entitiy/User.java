package com.wecp.medicalequipmentandtrackingsystem.entitiy;


import javax.persistence.*;

@Table(name = "users") // do not change table name
public class User {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String str;
    String role;

}
