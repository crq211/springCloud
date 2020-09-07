package cn.com.client;


import cn.com.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient("PRODUCT-DATA-SERVICE")
@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
//这就表示，如果访问的 PRODUCT-DATA-SERVICE 不可用的话，就调用 ProductClientFeignHystrix 来进行反馈信息。
public interface ProductClientFeign {

    @GetMapping("/ps")
    List<Product> products();
}
