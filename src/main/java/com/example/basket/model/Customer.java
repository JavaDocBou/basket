package com.example.basket.model;

public abstract class Customer {
  protected String idClient;
  protected String name;

  protected Customer(String idClient) {
    this.idClient = idClient;
  }
}
