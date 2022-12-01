package com.project.Shop.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "TBL_PRODUCT")
public class Product {

	public Product( String name, String description, double preco, String img) {
		this.name = name;
		this.description = description;
		this.preco = preco;
		this.imgUrl = img;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String imgUrl;
	private Double preco;
	@JsonIgnore
	@ManyToMany
	@JoinTable( name = "tbl_product_category" ,
	joinColumns = @JoinColumn(name= " product_id") , 
	inverseJoinColumns = @JoinColumn(name="category_id"))
	private Set<Category> categories = new HashSet<>();
}
