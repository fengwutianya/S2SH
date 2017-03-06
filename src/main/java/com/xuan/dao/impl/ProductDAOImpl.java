package com.xuan.dao.impl;

import com.xuan.dao.ProductDAO;
import com.xuan.pojo.Product;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

/**
 * Created by xuan on 2017/3/6 0006.
 */
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {
    public List<Product> list() {
        return find("from Product");
    }

    public void add(Product p) {
        save(p);
    }
}
