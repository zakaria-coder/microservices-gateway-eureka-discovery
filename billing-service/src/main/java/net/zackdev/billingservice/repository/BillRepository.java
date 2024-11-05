package net.zackdev.billingservice.repository;

import net.zackdev.billingservice.Entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Bill,Long> {
}
