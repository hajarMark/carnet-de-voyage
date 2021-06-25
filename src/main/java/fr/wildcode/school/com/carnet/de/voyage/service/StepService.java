package fr.wildcode.school.com.carnet.de.voyage.service;

import fr.wildcode.school.com.carnet.de.voyage.entity.Destination;
import fr.wildcode.school.com.carnet.de.voyage.entity.Step;
import fr.wildcode.school.com.carnet.de.voyage.repository.DestinationRepository;
import fr.wildcode.school.com.carnet.de.voyage.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StepService {
    @Autowired
    private StepRepository stepRepository;

    public Destination saveStep(Step step){
        return  stepRepository.save(step);
    }
    public void deleteStep(Step step){
        stepRepository.delete(step);
    }
    public List<Step> findAll(){
        return stepRepository.findAll();
    }

    public Step getStep(Integer id){
        return StepRepository.findById(id);
    }

}
