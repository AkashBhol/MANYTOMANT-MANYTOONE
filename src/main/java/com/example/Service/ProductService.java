package com.example.Service;

import com.example.Domain.Product;
import com.example.Domain.Result;

import java.util.List;

public interface ProductService {

    public Result createProduct(Product  product);

    public List<Product> getAllProduct();
}
