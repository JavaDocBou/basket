package com.example.basket.model;

public abstract class Customer {
  protected String idClient;

  protected Customer(String idClient) {
    this.idClient = idClient;
  }

  public abstract double getPremiumMobilePrice();
  public abstract double getStandardMobilePrice();
  public abstract double getLaptopPrice();
}
