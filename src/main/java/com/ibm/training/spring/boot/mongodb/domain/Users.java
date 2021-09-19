package com.ibm.training.spring.boot.mongodb.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection="Users")
public class Users  {
	
   /**
	 * 
	 */
	
public Users(String id, String first_name, String last_name, String email, String gender, String ip_address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.ip_address = ip_address;
	}
public Users()
{
	
}
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return first_name;
	}
	public void setFirstname(String firstname) {
		this.first_name = firstname;
	}
	public String getLastname() {
		return last_name;
	}
	public void setLastname(String lastname) {
		this.last_name = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIpaddress() {
		return ip_address;
	}
	public void setIpaddress(String ipaddress) {
		this.ip_address = ipaddress;
	}
@Id	
   private String id;
   private String  first_name;
   private String  last_name;
   private String  email;
   private String  gender;
   private String  ip_address;
   


}
