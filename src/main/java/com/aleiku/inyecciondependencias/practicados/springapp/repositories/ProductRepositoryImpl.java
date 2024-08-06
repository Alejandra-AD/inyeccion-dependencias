package com.aleiku.inyecciondependencias.practicados.springapp.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;


@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List <Product> products;


    public ProductRepositoryImpl() {
        this.products = Arrays.asList(
            new Product(1L,"Nintendo Switch",300L),
            new Product(2L,"The Legend Of Zelda: Tears of the Kingdom",70L),
            new Product(3L,"Splatoon 3",70L),
            new Product(4L,"Animal Crossing: New Horizon",50L)
        );
    }

    @Override
    public List<Product> findAll(){
        return products;

    }

    @Override
    public Product findById(Long id){

        // var findProduct = products.stream().filter(p->p.getId().equals(id)).findFirst();

        // if (findProduct.isPresent()){
        //     return findProduct.get();

        // }else{
        //     return null;
        // }
        
        return products.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);



    }

    

}
