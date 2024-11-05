package net.zackdev.customerservice.ENTITES;


import org.springframework.data.rest.core.config.Projection;

@Projection(name ="emails", types = {Customer.class})
public interface CustomerProjection2 {
        String getEmail();
}
