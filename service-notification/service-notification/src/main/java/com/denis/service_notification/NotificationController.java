package com.denis.service_notification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest notification) {
        System.out.println(notification.message());
        return ResponseEntity.ok().build();
    }
}
