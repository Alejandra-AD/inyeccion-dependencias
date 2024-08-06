package com.aleiku.inyecciondependencias.practicados.springapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;
import com.aleiku.inyecciondependencias.practicados.springapp.service.ProductServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class ProductoController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping()
    public List <Product> getProducts () {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct (@PathVariable Long id) {
        return productService.findById(id);
    }

}
