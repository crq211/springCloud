package cn.com.service;

import cn.com.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> products() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "product a from port:" + port, 100));
        productList.add(new Product(2, "product b from port:" + port, 200));
        productList.add(new Product(3, "product c from port:" + port, 300));
        return productList;
    }
}
