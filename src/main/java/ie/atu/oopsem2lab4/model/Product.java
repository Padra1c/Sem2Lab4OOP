package ie.atu.oopsem2lab4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "Product name is required")
    private String name;

    @Positive(message = "Price must be greater than zero")
    private double price;
}
