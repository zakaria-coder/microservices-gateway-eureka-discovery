package net.zackdev.customerservice;

import net.zackdev.customerservice.ENTITES.Customer;
import net.zackdev.customerservice.Repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner cmdrun (CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save( Customer.builder()
                    .name("zakaria")
                    .email("zakaria@zackdev.com").build());
            customerRepository.save( Customer.builder()
                    .name("ahlam")
                    .email("ahlam@zackdev.com").build());
            customerRepository.save( Customer.builder()
                    .name("yahya")
                    .email("yahya@zackdev.com").build());
            customerRepository.findAll().forEach(c -> {
                    System.out.println(c.getId());
                    System.out.println(c.getName());
                    System.out.println(c.getEmail());
            });

    };
    }
}


