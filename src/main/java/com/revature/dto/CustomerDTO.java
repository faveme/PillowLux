package com.revature.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	
	private String first_name;
	private String last_name;


	private String email;
	private String password;
	private String dob;
	private String address;
	private String city;
	private String state;

		@Override
		public String toString() {
			return "CustomerDTO [fName=" + first_name + ", last_name=" + last_name + ", email=" + email + ", password=" + password
					+ ", dob=" + dob + ", address=" + address + ", city=" + city + ", state=" + state + "]";
			 
}
}
