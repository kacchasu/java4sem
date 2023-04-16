package com.example.practice15.loggers;

import com.example.practice15.entity.Manufacture;
import com.example.practice15.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Manufacture.class)
public class ManufactureEventHandler {

    @Autowired
    private EmailService emailService;

    @HandleAfterCreate
    public void handleManufactureSave(Manufacture manufacture) {
        // Вызывайте метод sendEmail с информацией о сохраненном объекте Manufacture
        String to = "7germania7@gmain.com";
        String subject = "New Manufacture Saved";
        String body = "Manufacture " + manufacture.getName() + " with ID " + manufacture.getId() + " was saved.";
        emailService.sendEmail(to, subject, body);
    }
}

