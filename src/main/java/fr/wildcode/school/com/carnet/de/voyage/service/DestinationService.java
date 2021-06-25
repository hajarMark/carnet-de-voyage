package fr.wildcode.school.com.carnet.de.voyage.service;

import fr.wildcode.school.com.carnet.de.voyage.entity.Destination;
import fr.wildcode.school.com.carnet.de.voyage.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public Destination saveDestination(Destination destination){
        return  destinationRepository.save(destination);
    }

    public void deleteDestination(Destination destination){
        destinationRepository.delete(destination);
    }

    public List<Destination> findAll(){
        return destinationRepository.findAll();
    }

    public Destination getDestination(Integer id){
        return DestinationRepository.findById(id);
    }

}


