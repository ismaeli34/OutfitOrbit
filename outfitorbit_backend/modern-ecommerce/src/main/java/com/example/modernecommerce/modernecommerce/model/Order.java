package com.example.modernecommerce.modernecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "order_id")
    private String orderId;
    @ManyToOne
    private User user;

    // one order can have multiple orderitems->like shoes,watch,guitar,keyboard
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();
    private LocalDateTime orderDate;

    private LocalDateTime deliveryDate;
    //one order can have one address-because i can send to only one address
    @OneToOne
    private Address shippingAddress;
    @Embedded
    private PaymentDetails paymentDetails = new PaymentDetails();
    private double totalPrice;
    private Integer totalDiscountedPrice;
    private Integer discountedPercentage;

    private Integer discount;
    private String orderStatus;
    private int totalItem;
    private LocalDateTime createdAt;







}
