package com.gabriel.erp.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "products")
@Data // for generate the getters setters etc

public class Product{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(nullable = false, length = 100)
		private String description;

		@Column(nullable = false)
		private Double price;

		@Column(nullable = false)
		private Integer stock;

	}

