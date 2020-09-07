package cn.com.client;

import cn.com.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

    @Override
    public List<Product> products() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(0,"产品数据为服务不可用", 0));
        return productList;
    }
}
