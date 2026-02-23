package ie.atu.oopsem2lab4.controller;

import ie.atu.oopsem2lab4.model.Email;
import ie.atu.oopsem2lab4.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
        public class EmailController {
            private final EmailService emailService;

            public EmailController(EmailService emailService) {
                this.emailService = emailService;
            }

            @PostMapping("addEmail")
            public ResponseEntity<Email> addEmail(@Valid @RequestBody Email email) {
                Email saved = emailService.addEmail(email);
                return ResponseEntity.status(HttpStatus.CREATED).body(saved);
            }

            @GetMapping("/allEmails")
            public ResponseEntity<List<Email>> getAllEmails() {
                return ResponseEntity.ok(emailService.getAllEmails());
            }
        }
