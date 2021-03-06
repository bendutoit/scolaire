package com.ges_school.scolaire.entities;

import javax.persistence.ManyToOne;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Notes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotes;
    private Double valeurnote;
    @ManyToOne
    private Eleves eleves;
    @ManyToOne
    private Matieres matieres;

}
