package edu.zut.cs.software.OSALS.order_good.domain;


import edu.zut.cs.software.OSALS.order.domain.Order;
import edu.zut.cs.software.base.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "T_ORDER_GOOD")
public class order_good extends BaseEntity {



    @Column(name = "NAME")
    String name;

    @Column(name = "PRICE")
    float price;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    Order order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
