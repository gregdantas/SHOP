package com.project.Shop.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.project.Shop.entity.pk.OrderItemPk;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Table(name = "TBL_ORDER_ITEM")

public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OrderItemPk id;
	private Integer quantity;
	private double price;

	public OrderItem(Order order, Product product, Integer quantity, double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.price = price;
		this.quantity = quantity;

	}

	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}

}
