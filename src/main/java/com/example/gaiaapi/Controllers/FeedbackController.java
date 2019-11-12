package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Models.Feedback;
import com.example.gaiaapi.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping
    List<Feedback> listAll() {
        return feedbackRepository.findAll();
    }

    @PostMapping
    Feedback create(@RequestBody String message) {
        return feedbackRepository.save(new Feedback(message));
    }

    @DeleteMapping
    String deleteAll() {
        feedbackRepository.deleteAll();
        return "Feedbacks deletados";
    }
}
