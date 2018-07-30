package me.zhl.fanli.controller;

import me.zhl.fanli.entity.Product;
import me.zhl.fanli.entity.response.ProductAllResponse;
import me.zhl.fanli.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/all")
    public ProductAllResponse getAll() {
        List<Product> productList = productService.getAll();
        ProductAllResponse response = new ProductAllResponse();
        response.setProductList(productList);
        return response;
    }

}
