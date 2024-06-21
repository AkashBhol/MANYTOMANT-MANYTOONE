package com.example.serviceImpl;

import com.example.Domain.Product;
import com.example.Domain.Result;
import com.example.Repo.ProductRepo;
import com.example.Service.ProductService;
import com.example.Util.BasicUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl extends BasicUtil implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private static  final Logger log= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public Result createProduct(Product product) {
        log.debug("Entering createProduct method with product: {}",product);
        Product save = productRepo.save(product);
        return prepareResponseObject("001","Product created successfully ",save);
    }

    @Override
    public List<Product> getAllProduct() {
        log.debug("Entering getAllProduct method with AllProduct {}");
        List<Product> all = productRepo.findAll();
        log.debug("entering getAllproduct method with all product {}",all);
        return all;
    }
}
