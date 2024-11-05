package net.zackdev.inventoryservice;

import net.zackdev.inventoryservice.Entities.Product;
import net.zackdev.inventoryservice.Repository.ProductRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner  (ProductRespository productRespository) {
        return args -> {

            productRespository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .price(2000)
                    .name("Samsung Galaxy")
                    .quantity(5).build());

            productRespository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .price(1500)
                    .name("Xiaomi mi 9T pro")
                    .quantity(6).build());
            productRespository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .price(5000)
                    .name("iphone 11pro")
                    .quantity(3).build());

            productRespository.findAll().forEach(product -> {
                        System.out.println(product.toString());
                    }
            );
        };
    }
}
