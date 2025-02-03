package br.edu.utfpr.pb.pw44s.server.controller;

import br.edu.utfpr.pb.pw44s.server.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.server.entity.CategoryEntity;
import br.edu.utfpr.pb.pw44s.server.services.ICategoryService;
import br.edu.utfpr.pb.pw44s.server.services.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController extends CrudController<CategoryEntity, CategoryDTO, Long> {

    private final ICategoryService categoryService;
    private final ModelMapper modelMapper;

    public CategoryController(ICategoryService categoryService, ModelMapper modelMapper) {
        super(CategoryEntity.class, CategoryDTO.class);
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<CategoryEntity, Long> getService() {
        return categoryService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
