package net.zackdev.customerservice.ENTITES;


import org.springframework.data.rest.core.config.Projection;

@Projection(name ="all", types = {Customer.class})
public interface CustomerProjection {
        String getName();
        String getEmail();
}
