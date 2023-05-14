package com.lab4.watchcatalog.domain.models;

import com.lab4.sharedkernel.domain.base.AbstractEntity;
import com.lab4.sharedkernel.domain.financial.Money;
import com.lab4.watchcatalog.domain.valueobjects.Category;

import javax.persistence.*;

@Entity
@Table(name = "watches")
public class Watch extends AbstractEntity<WatchId> {

    private String watchName;
    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="watch_price")),
            @AttributeOverride(name="currency", column = @Column(name="price_currency"))
    })

    private Money watchPrice;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "watch_category")
    private Category category;
}
