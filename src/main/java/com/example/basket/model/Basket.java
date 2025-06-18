package com.example.basket.model;

import com.example.basket.constant.Product;
import com.example.basket.service.PriceManagement;

public class Basket {
  private final Customer customer;
  private final PriceManagement priceManagement;
  private int qtyPremiumMobile;
  private int qtyStandardMobile;
  private int qtyLaptop;

  public Basket(Customer customer, PriceManagement priceManagement) {
    this.customer = customer;
    this.priceManagement = priceManagement;
  }

  public void addPremiumMobile(int qty) {
    this.qtyPremiumMobile += qty;
  }

  public void addStandardMobile(int qty) {
    this.qtyStandardMobile += qty;
  }

  public void addLaptop(int qty) {
    this.qtyLaptop += qty;
  }

  public double calculateTotalPrice() {
    return qtyPremiumMobile * priceManagement.getPrice(customer, Product.PREMIUM_MOBILE) +
      qtyStandardMobile * priceManagement.getPrice(customer, Product.STANDARD_MOBILE) +
      qtyLaptop * priceManagement.getPrice(customer, Product.LAPTOP);
  }
}
