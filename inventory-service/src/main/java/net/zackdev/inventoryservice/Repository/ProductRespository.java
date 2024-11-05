package net.zackdev.inventoryservice.Repository;

import net.zackdev.inventoryservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ProductRespository extends JpaRepository<Product, String> {
}
