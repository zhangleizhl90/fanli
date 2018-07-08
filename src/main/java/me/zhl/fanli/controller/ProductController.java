package me.zhl.fanli.controller;

import me.zhl.fanli.entity.Product;
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
    public Response getAll() {
        List<Product> productList = productService.getAll();
        Response response = new Response();
        response.productList = productList;
        return response;
    }

    private static class Response {
        List<Product> productList;
        String resCode = "00";
        String resMsg = "请求成功";

        public List<Product> getProductList() {
            return productList;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }

        public String getResCode() {
            return resCode;
        }

        public void setResCode(String resCode) {
            this.resCode = resCode;
        }

        public String getResMsg() {
            return resMsg;
        }

        public void setResMsg(String resMsg) {
            this.resMsg = resMsg;
        }
    }
}
