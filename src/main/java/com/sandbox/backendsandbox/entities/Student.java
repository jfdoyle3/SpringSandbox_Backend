package com.sandbox.backendsandbox.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int age;

}
