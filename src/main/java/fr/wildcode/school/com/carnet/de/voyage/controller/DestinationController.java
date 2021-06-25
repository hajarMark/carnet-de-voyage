package fr.wildcode.school.com.carnet.de.voyage.controller;

import fr.wildcode.school.com.carnet.de.voyage.entity.Destination;
import fr.wildcode.school.com.carnet.de.voyage.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DestinationController {

    @Autowired
    DestinationService destinationService;




    @GetMapping("/")
    public String getCreateMainPage(Model model) {
        model.addAttribute("destinations", destinationService.findAll());
        return "index";
    }

    @GetMapping("/destination/{id}")
    public String getDestination(@RequestParam Integer idList){
        destinationService.getDestination(idList);
        return "destination";


    @PostMapping("/destination/")
    public String postDestination (@RequestParam  Destination destination) {
        DestinationService.saveDestination(destination);
        return "redirect:/";
    }
}
