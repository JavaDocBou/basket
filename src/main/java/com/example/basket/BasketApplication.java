package com.example.basket;

import com.example.basket.model.Basket;
import com.example.basket.model.Customer;
import com.example.basket.model.Individual;
import com.example.basket.model.Professional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasketApplication {

  private static final Logger log = LogManager.getLogger(BasketApplication.class);

  public static void main(String[] args) {

    // Test avec un client particulier
    Customer individual = new Individual("C001", "Dupont", "Jean");
    Basket individualBasket = new Basket(individual);
    individualBasket.addPremiumMobile(2);
    individualBasket.addStandardMobile(1);
    individualBasket.addLaptop(1);
    log.info("Total panier particulier: {} euros", individualBasket.getTotal());

    // Test avec un client pro CA > 10M
    Customer pro1 = new Professional("P001", "Tech Innov SARL", "FR12345678901", "812345678", 15000000.00);
    Basket professionalBasket = new Basket(pro1);
    professionalBasket.addPremiumMobile(2);
    professionalBasket.addStandardMobile(1);
    professionalBasket.addLaptop(1);
    log.info("Total panier pro (>10M): {} euros", professionalBasket.getTotal());

    // Test avec un client pro CA < 10M
    Customer pro2 = new Professional("P002", "BâtirPro SA", "FR98765432109", "912345671", 2750000.00);
    Basket professionalBasket1 = new Basket(pro2);
    professionalBasket1.addPremiumMobile(2);
    professionalBasket1.addStandardMobile(1);
    professionalBasket1.addLaptop(1);
    log.info("Total panier pro (<10M): {} euros", professionalBasket1.getTotal());

    // Test avec un client pro CA < 10M
    Customer pro3 = new Professional("P003", "BâtirPro SA", "FR98765432109", "912345671", 50000.00);
    Basket professionalBasket2 = new Basket(pro3);
    professionalBasket2.addPremiumMobile(2);
    professionalBasket2.addStandardMobile(1);
    professionalBasket2.addLaptop(1);
    log.info("Total panier pro (<10M): {} euros", professionalBasket2.getTotal());
  }

}
