package com.xuan.service.impl;

import com.xuan.dao.ProductDAO;
import com.xuan.pojo.Product;
import com.xuan.service.ProductService;

import java.util.List;

/**
 * Created by xuan on 2017/3/6 0006.
 */
public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO;

    public List<Product> list() {
        List<Product> products = productDAO.list();
        if (products.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                Product p = new Product();
                p.setName("product " + i);
                productDAO.add(p);
                products.add(p);
            }
        }
        return products;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
}
