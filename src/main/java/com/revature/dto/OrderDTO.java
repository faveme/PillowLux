package com.revature.dto;

import lombok.Getter;
import lombok.Setter;

public class OrderDTO {
	@ Getter @Setter private int customerID;
	@ Getter @Setter private String comments;
	@ Getter @Setter private String city;
	@ Getter @Setter private ProductDTO[] products;


}
