package com.example.basket.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professional extends Customer {
  protected String name;
  protected String vatNumber;
  protected String sirenNumber;
  protected double annualRevenues;

  public Professional(String idClient, String name, String vatNumber, String sirenNumber, double annualRevenues) {
    super(idClient);
    this.name = name;
    this.vatNumber = vatNumber;
    this.sirenNumber = sirenNumber;
    this.annualRevenues = annualRevenues;
  }
}
