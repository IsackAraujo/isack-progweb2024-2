package br.edu.utfpr.pb.pw44s.server.services.impl;
import br.edu.utfpr.pb.pw44s.server.entity.ProductEntity;
import br.edu.utfpr.pb.pw44s.server.repository.ProductRepository;
import br.edu.utfpr.pb.pw44s.server.services.IProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl extends CrudServiceImpl<ProductEntity, Long>
        implements IProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected JpaRepository<ProductEntity, Long> getRepository() {
        return productRepository;
    }
}
