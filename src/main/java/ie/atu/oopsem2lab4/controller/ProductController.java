package ie.atu.oopsem2lab4.controller;

import ie.atu.oopsem2lab4.model.Product;
import ie.atu.oopsem2lab4.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("addProduct")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product)
    {
        Product saved = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>> getAllProducts()
    {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
