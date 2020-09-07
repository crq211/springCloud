package cn.com.service;

import cn.com.client.ProductClientFeign;
import cn.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> products() {
        return productClientFeign.products();
    }
}
