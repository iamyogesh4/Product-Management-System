/*
 * package com.product.entity;
 * 
 * import java.sql.Date; import java.util.List;
 * 
 * import jakarta.persistence.Column; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.JoinColumn; import jakarta.persistence.OneToMany; import
 * jakarta.persistence.OneToOne; import jakarta.persistence.SequenceGenerator;
 * import jakarta.persistence.Table; import lombok.AllArgsConstructor; import
 * lombok.Data; import lombok.NoArgsConstructor;
 * 
 * @Entity
 * 
 * @Table(name="User_Purchase")
 * 
 * @Data
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor public class UserPurchase {
 * 
 * 
 * @Id
 * 
 * @SequenceGenerator(name="Gen4",sequenceName ="User_Purchase-Seq",initialValue
 * = 1,allocationSize = 1)
 * 
 * @GeneratedValue(generator = "Gen4",strategy = GenerationType.SEQUENCE)
 * 
 * @Column(name="PurchaseID") private Integer purchaseId;
 * 
 * @Column(name="PurchaseDate") private Date purchaseDate;
 * 
 * @OneToMany
 * 
 * @JoinColumn(name="FKproductId") private List<Product> productId;
 * 
 * @Column(name="TotalUnit") private Integer totalUnit;
 * 
 * @OneToMany
 * 
 * @JoinColumn(name="FKuserId") private List<User> purchaseByUser;
 * 
 * @OneToOne
 * 
 * @JoinColumn(name="FKuserId") private User purchaseFromUser;
 * 
 * }
 */