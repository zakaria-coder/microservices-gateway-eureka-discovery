package net.zackdev.billingservice.feing;


import net.zackdev.billingservice.modelDto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="inventory-service")
public interface ProductRestClient {
    @GetMapping("/api/products/{id}")
    Product getProductById(@PathVariable  String productId);

    @GetMapping("/api/products")
    PagedModel<Product> getAllProducts();

}
