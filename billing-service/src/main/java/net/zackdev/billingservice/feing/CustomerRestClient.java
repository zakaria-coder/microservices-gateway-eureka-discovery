package net.zackdev.billingservice.feing;

import net.zackdev.billingservice.modelDto.Customer;
import net.zackdev.billingservice.modelDto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer-service")
public interface CustomerRestClient {
    @GetMapping( "/api/customers/{id}")
Customer GetCustomerById(@PathVariable Long customerId);
    @GetMapping("/api/customers")
    PagedModel<Customer> getAllCustomers();


}
