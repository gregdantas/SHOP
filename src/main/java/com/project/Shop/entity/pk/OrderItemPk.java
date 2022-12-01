package com.project.Shop.entity.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.project.Shop.entity.Order;
import com.project.Shop.entity.Product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class OrderItemPk implements Serializable{

	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product ; 
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order ; 

}
