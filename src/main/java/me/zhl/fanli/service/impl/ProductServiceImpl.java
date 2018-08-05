package me.zhl.fanli.service.impl;

import me.zhl.fanli.entity.Product;
import me.zhl.fanli.repository.ProductRepository;
import me.zhl.fanli.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository mProductRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.mProductRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return mProductRepository.findAll();
    }
}
