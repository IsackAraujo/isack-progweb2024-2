package br.edu.utfpr.pb.pw44s.server.controller;

import br.edu.utfpr.pb.pw44s.server.dto.ProductDTO;
import br.edu.utfpr.pb.pw44s.server.entity.CategoryEntity;
import br.edu.utfpr.pb.pw44s.server.entity.ProductEntity;
import br.edu.utfpr.pb.pw44s.server.repository.CategoryRepository;
import br.edu.utfpr.pb.pw44s.server.repository.ProductRepository;
import br.edu.utfpr.pb.pw44s.server.services.ICrudService;
import br.edu.utfpr.pb.pw44s.server.services.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("products")
public class ProductController extends CrudController<ProductEntity, ProductDTO, Long> {

    private final ProductRepository productRepository;
    private final CategoryRepository productCategoryRepository;
    private final IProductService productService;
    private final ModelMapper modelMapper;

    public ProductController(IProductService productService, ModelMapper modelMapper, ProductRepository productRepository, CategoryRepository productCategoryRepository) {
        super(ProductEntity.class, ProductDTO.class);
        this.productService = productService;
        this.productCategoryRepository = productCategoryRepository;
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<ProductEntity, Long> getService() {
        return productService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

    @PostMapping("create")
    public ProductEntity hintCreate(@RequestBody ProductDTO productDTO) {

        var category = productCategoryRepository.findById(productDTO.getCategory().getId())
                .orElseThrow(() -> new RuntimeException("Erro!"));

        return productRepository.save(ProductEntity.builder()
                .categoryEntityId(category)
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .description(productDTO.getDescription())
                .imageUrl(productDTO.getImageUrl())
                .build());
    }
}

