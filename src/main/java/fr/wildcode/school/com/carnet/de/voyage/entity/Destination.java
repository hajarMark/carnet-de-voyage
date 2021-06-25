package fr.wildcode.school.com.carnet.de.voyage.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "destination")
public class  Destination{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany (mappedBy="destination")
    @Column(columnDefinition="int")
    private List<Step> destination;



}

