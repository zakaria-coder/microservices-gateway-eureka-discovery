package net.zackdev.billingservice.modelDto;

import lombok.*;



@Getter
@Setter
public class Customer {
    private long id;
    private String name;
    private String email;
}