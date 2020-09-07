package cn.com.service;

import cn.com.client.ProductClientRibbon;
import cn.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> products() {
        return productClientRibbon.products();
    }
}
