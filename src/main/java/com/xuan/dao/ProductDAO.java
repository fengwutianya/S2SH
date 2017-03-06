package com.xuan.dao;

import com.xuan.pojo.Product;

import java.util.List;

/**
 * Created by xuan on 2017/3/6 0006.
 */
public interface ProductDAO {
    public List<Product> list();
    public void add(Product p);
}
