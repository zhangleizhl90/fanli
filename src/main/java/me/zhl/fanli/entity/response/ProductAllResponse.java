package me.zhl.fanli.entity.response;

import me.zhl.fanli.entity.Product;

import java.util.List;

public class ProductAllResponse extends BaseResponse {
    List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
