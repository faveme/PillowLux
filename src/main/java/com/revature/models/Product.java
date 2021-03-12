package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "product", schema = "project0")
@Data @NoArgsConstructor @AllArgsConstructor 
@EqualsAndHashCode @ToString
@Entity
public class Product {
	
		@Id
		@Column(nullable=false)
		private int id;
		
		@Column(nullable=false)
		private String name;
		
		@Column(nullable=false)
		private String description;
		
		@Column(nullable=false)
		private String size;
		
		@Column(nullable=false)
		private int units;
		
		@Column
		private String comments;
		@Column (nullable=false)
		private float price;


}
