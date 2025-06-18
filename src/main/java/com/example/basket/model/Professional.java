package com.example.basket.model;

public class Professional extends Customer {
  private String name;
  private String vatNumber;
  private String sirenNumber;
  private double annualRevenues;

  public Professional(String idClient, String name, String vatNumber, String sirenNumber, double annualRevenues) {
    super(idClient);
    this.name = name;
    this.vatNumber = vatNumber;
    this.sirenNumber = sirenNumber;
    this.annualRevenues = annualRevenues;
  }

  @Override
  public double getPremiumMobilePrice() {
    return annualRevenues > 10000000 ? 1000.00 : 1150.00;
  }

  @Override
  public double getStandardMobilePrice() {
    return annualRevenues > 10000000 ? 550.00 : 600.00;
  }

  @Override
  public double getLaptopPrice() {
    return annualRevenues > 10000000 ? 900.00 : 1000.00;
  }
}
