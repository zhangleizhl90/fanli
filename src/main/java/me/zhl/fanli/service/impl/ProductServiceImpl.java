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

    @Autowired
    ProductRepository productDao;

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
