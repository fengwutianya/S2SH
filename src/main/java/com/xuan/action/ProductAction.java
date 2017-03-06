package com.xuan.action;

import com.xuan.pojo.Product;
import com.xuan.service.ProductService;

import java.util.List;

/**
 * Created by xuan on 2017/3/6 0006.
 */
public class ProductAction {
    private ProductService productService;
    private List<Product> products;

    public String list() {
        products = productService.list();
        return "listsJsp";
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
