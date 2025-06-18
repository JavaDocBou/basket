package com.example.basket.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Individual extends Customer {

  protected String lastName;
  protected String firstName;

  public Individual(String idClient, String lastName, String firstName) {
    super(idClient);
    this.lastName = lastName;
    this.firstName = firstName;
  }
}
