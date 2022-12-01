package com.project.Shop.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name ="TBL_CATEGORY")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String name ;
	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	private Set<Product> products = new HashSet<>() ; 
}


