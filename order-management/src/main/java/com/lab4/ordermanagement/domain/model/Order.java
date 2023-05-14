package com.lab4.ordermanagement.domain.model;

import com.lab4.sharedkernel.domain.base.AbstractEntity;
import com.lab4.sharedkernel.domain.financial.Money;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity<OrderID> {

    private Instant orderCreatedOn;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="total")),
            @AttributeOverride(name="currency", column = @Column(name="total_currency"))
    })
    private Money total;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER )
    private Set<OrderItem> orderItems;

    // TODO: 13/05/2023 add UserID


    public Order() {
    }
}
