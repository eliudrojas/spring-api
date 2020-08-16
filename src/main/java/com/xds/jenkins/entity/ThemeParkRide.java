package com.xds.jenkins.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ThemeParkRide {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private  int id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;
    private int thrillFactor;
    private int vomitFactor;

    public ThemeParkRide(int id, String name, String description, int thrillFactor, int vomitFactor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.vomitFactor = vomitFactor;
    }
}
