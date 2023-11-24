package com.product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="User_Role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {
	
	@Id
	@SequenceGenerator(name="Gen1",sequenceName ="UserRole-Seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "Gen1",strategy = GenerationType.SEQUENCE)
	@Column(name="RoleID")
	private Integer roleId;
	
	@Column(name="RoleName")
	private String roleName;
	
	@Column(name="RoleDescription")
	private String roleDescription;

}
