package com.example.basket.model;

public class Individual extends Customer {

  private String lastName;
  private String firstName;

  public Individual(String idClient, String lastName, String firstName) {
    super(idClient);
    this.lastName = lastName;
    this.firstName = firstName;
  }

  @Override
  public double getPremiumMobilePrice() {
    return 1500.00;
  }

  @Override
  public double getStandardMobilePrice() {
    return 800.00;
  }

  @Override
  public double getLaptopPrice() {
    return 1200.00;
  }
}
