package net.zackdev.billingservice.Entities;

import jakarta.persistence.*;
import lombok.*;
import net.zackdev.billingservice.modelDto.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Builder@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Date bill_date;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems = new ArrayList<>();
    @Transient private Customer customer;
}
