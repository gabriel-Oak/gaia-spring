package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.FeedbackForm;
import com.example.gaiaapi.Models.Feedback;
import com.example.gaiaapi.Models.Notification;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.FeedbackRepository;
import com.example.gaiaapi.Repositories.NotificationRepository;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackRepository feedbackRepository;

    @Autowired
    NotificationRepository notificationRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    List<Feedback> listAll() {
        return feedbackRepository.findAll();
    }

    @PostMapping
    String create(@RequestBody FeedbackForm form) {
        Optional<User> u = userRepository.findById(form.getUser_id());
        User user = u.get();

        feedbackRepository.save(form.convert());
        notificationRepository.save(new Notification(user, "Seu feedback foi recebido!"));
        return "Seu feedback foi recebido!";
    }

    @DeleteMapping
    String deleteAll() {
        feedbackRepository.deleteAll();
        return "Feedbacks deletados";
    }
}
