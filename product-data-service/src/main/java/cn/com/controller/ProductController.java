package cn.com.controller;

import cn.com.pojo.Product;
import cn.com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/ps")
    public Object products() {
        List<Product> productList = productService.products();
        return productList;
    }
}
