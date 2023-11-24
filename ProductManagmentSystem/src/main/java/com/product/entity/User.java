package com.product.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@Column(name="UserID")
	@SequenceGenerator(name="Gen2",sequenceName = "User-Seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "Gen2",strategy = GenerationType.SEQUENCE)
	private Integer userId;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="DateOfBirth")
	private Date dob;
	
	@Column(name="EmailID")
	private String emailId;
	
	@Column(name="MobileNo")
	private String mobileNo;
	
	@Column(name="Balance")
	private Double balance;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Address")
	private String Address;
	
    @OneToOne
    @JoinColumn(name="FKroleId")
	private UserRole userrole;
	
	

}
