package com.aleiku.inyecciondependencias.practicados.springapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;
import com.aleiku.inyecciondependencias.practicados.springapp.repositories.ProductRepository;
import com.aleiku.inyecciondependencias.practicados.springapp.repositories.ProductRepositoryImpl;


@Service
public class ProductServiceImpl implements ProductService {// Se puede hacer logica de negocio



    private ProductRepository productRepository;

    //Inyección de dependecia mediante contructor

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List <Product> findAll(){
        return productRepository.findAll().stream().map(product -> {

            Double priceTax = product.getPrice() * 1.25d;
            Product newProduct = (Product)product.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;//devuelvo el producto modificado

        }).collect(Collectors.toList());
    }

    public Product findById(Long id){

        return productRepository.findById(id);
    }

}
