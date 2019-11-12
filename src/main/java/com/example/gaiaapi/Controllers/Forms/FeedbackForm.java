package com.example.gaiaapi.Controllers.Forms;

import com.example.gaiaapi.Models.Feedback;

public class FeedbackForm {
    private String message;
    private Long user_id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Feedback convert() {
        return new Feedback(this.getMessage());
    }
}
