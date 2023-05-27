package bd.com.ronnie.product.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello from OrderController";
    }

}
