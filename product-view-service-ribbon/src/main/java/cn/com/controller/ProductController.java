package cn.com.controller;

import cn.com.service.ProductService;
import cn.com.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;


    @RequestMapping("/ps")
    public Object products(Model model) {
        List<Product> productList = productService.products();
        model.addAttribute("ps", productList);
        return "products";
    }
}
