package fr.wildcode.school.com.carnet.de.voyage.controller;
import fr.wildcode.school.com.carnet.de.voyage.service.DestinationService;
import fr.wildcode.school.com.carnet.de.voyage.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StepController {

    @Autowired
    StepService stepService;

    @GetMapping("/step/")
    public String getCreateStepPage() {
        return "step";
    }

    @GetMapping("/step/{id}")
    public String getStep(@RequestParam Integer idList){
        stepService.getStep(idList);
        return "step";

    @PostMapping("/step/")
        public String postDestination(@RequestParam  Step step) {
            DestinationService.saveDestination(step);
            return "redirect:/";
        }

}
