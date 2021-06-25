package fr.wildcode.school.com.carnet.de.voyage.repository;

import fr.wildcode.school.com.carnet.de.voyage.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination,Integer> {
}
