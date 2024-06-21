package com.example.Controller;

import com.example.Domain.Product;
import com.example.Domain.Result;
import com.example.Service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private static final Logger log= LoggerFactory.getLogger(ProductController.class);

    @PostMapping("/createProduct")
    public Result craeteProduct(@RequestBody Product product){
        log.info("Entering createProduct controller Method product {}",product);
        Result product1 = productService.createProduct(product);
        return product1;
    }

    @GetMapping("/get")
    public List<Product> getAllProduct(){
        log.info("Entering getAllProduct Controller method {}");
        List<Product> allProduct = productService.getAllProduct();
        log.info("Entering getAllProduct controller method {}",allProduct);
        return allProduct;
    }

}
