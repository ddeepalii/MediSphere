package com.wecp.medicalequipmentandtrackingsystem.entitiy;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Table(name = "hospital") // do not change table name
public class Hospital {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    Long test ;
}
