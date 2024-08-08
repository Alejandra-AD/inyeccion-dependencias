package com.aleiku.inyecciondependencias.practicados.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.aleiku.inyecciondependencias.practicados.springapp.repositories.ProductRepository;
import com.aleiku.inyecciondependencias.practicados.springapp.repositories.ProductRepositoryJson;

@Configuration
public class AppConfig {

      
      @Bean
      @Primary
     ProductRepository productRepositoryJson(){
        return new ProductRepositoryJson();
     }

}
