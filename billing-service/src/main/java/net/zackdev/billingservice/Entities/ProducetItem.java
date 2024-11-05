package net.zackdev.billingservice.Entities;

import jakarta.persistence.*;
import lombok.*;
import net.zackdev.billingservice.modelDto.Product;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class ProducetItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    @ManyToOne
    private Bill bill;
    private int quantity;
    private double unitPrice;
    @Transient
    private Product product;
}
