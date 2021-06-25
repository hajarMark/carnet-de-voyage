package fr.wildcode.school.com.carnet.de.voyage.entity;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "step")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private LocalDate startDate;
    private String summary;
}
