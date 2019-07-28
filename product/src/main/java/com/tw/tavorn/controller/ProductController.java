package com.tw.tavorn.controller;

import com.tw.tavorn.dto.DTOMapper;
import com.tw.tavorn.dto.ProductDto;
import com.tw.tavorn.entity.Product;
import com.tw.tavorn.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    @Transactional
    public List<ProductDto> getProducts() throws InterruptedException {
        System.out.println("in getProducts");
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDto = products.stream()
                .map(post -> DTOMapper.productMapper(post))
                .collect(Collectors.toList());
        return productDto;
    }
}
