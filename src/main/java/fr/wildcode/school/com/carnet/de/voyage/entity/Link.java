package fr.wildcode.school.com.carnet.de.voyage.entity;

import javax.persistence.*;

@Entity
@Table(name = "link")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String activity;
    private String link;

}
