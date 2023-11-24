/*
 * package com.product.entity;
 * 
 * import java.sql.Date;
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
 * @Table(name="Product")
 * 
 * @Data
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor public class Product {
 * 
 * 
 * @Id
 * 
 * @Column(name="ProductId")
 * 
 * @SequenceGenerator(name="Gen-3",sequenceName = "product-Seq",initialValue =
 * 1,allocationSize = 1)
 * 
 * @GeneratedValue(generator = "Gen-3",strategy = GenerationType.SEQUENCE)
 * private Integer productId;
 * 
 * @Column(name="ProductName") private String productName;
 * 
 * @Column(name="ProductDesc") private String productDesc;
 * 
 * @Column(name="ProductImg") private String productImg;
 * 
 * @Column(name="ProductSellPrice") private Double productSellPrice;
 * 
 * @Column(name="ProductCostPrice") private Double productCostPrice;
 * 
 * @Column(name="StockUnit") private Integer stockUnit;
 * 
 * @OneToMany
 * 
 * @JoinColumn(name="FKuserId") private User createdByUser;
 * 
 * @Column(name="CreateDate") private Date createDate;
 * 
 * @Column(name="IsDeleted") private Integer IsDeleted;
 * 
 * 
 * 
 * 
 * }
 */