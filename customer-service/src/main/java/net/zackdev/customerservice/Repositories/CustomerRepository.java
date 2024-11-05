package net.zackdev.customerservice.Repositories;

import net.zackdev.customerservice.ENTITES.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


 @RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
