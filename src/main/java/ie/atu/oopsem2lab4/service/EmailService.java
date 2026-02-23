package ie.atu.oopsem2lab4.service;

import ie.atu.oopsem2lab4.model.Email;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailService {
    private final List<Email> emails = new ArrayList<>();
    private long nextId = 1;
    public Email addEmail(Email email) {
        email.setId(nextId++);
        emails.add(email);
        return email;
    }
    public List<Email> getAllEmails() {
        return emails;
    }
}
