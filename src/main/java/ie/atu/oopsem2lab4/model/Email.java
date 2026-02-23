package ie.atu.oopsem2lab4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Email {
        private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "Email is required")
        private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long l) {

    }
}
