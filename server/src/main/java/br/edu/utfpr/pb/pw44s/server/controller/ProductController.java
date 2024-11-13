package br.edu.utfpr.pb.pw44s.server.controller;

import br.edu.utfpr.pb.pw44s.server.model.Product;
import br.edu.utfpr.pb.pw44s.server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController  {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable Long categoryId) {
        return productRepository.findAllByCategoriaId(categoryId);
    }

    @GetMapping("{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productRepository.findById(Math.toIntExact(productId)).orElse(null);
    }
}
