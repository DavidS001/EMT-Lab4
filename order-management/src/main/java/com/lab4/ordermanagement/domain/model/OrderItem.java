package com.lab4.ordermanagement.domain.model;

import com.lab4.ordermanagement.domain.valueobjects.WatchId;
import com.lab4.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_item")
public class OrderItem extends AbstractEntity<OrderItemID> {

    private int quantity;

    @AttributeOverride(name = "id", column = @Column(name = "watch_id",nullable = false))
    private WatchId watchId;
}
