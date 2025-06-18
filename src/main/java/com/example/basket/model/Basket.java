package com.example.basket.model;

public class Basket {
  private final Customer customer;
  private int qtyPremiumMobile;
  private int qtyStandardMobile;
  private int qtyLaptop;

  public Basket(Customer customer) {
    this.customer = customer;
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

  public double getTotal() {
    return qtyPremiumMobile * customer.getPremiumMobilePrice() + qtyStandardMobile * customer.getStandardMobilePrice() + qtyLaptop * customer.getLaptopPrice();
  }
}
