package com.example.basket;

import com.example.basket.model.Basket;
import com.example.basket.model.Customer;
import com.example.basket.model.Individual;
import com.example.basket.model.Professional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = BasketApplication.class)
class BasketApplicationTests {

  @Test
  void testIndividualBasket() {
    Customer particulier = new Individual("C001", "Dupont", "Jean");
    Basket panier = new Basket(particulier);
    panier.addPremiumMobile(2);
    panier.addStandardMobile(1);
    panier.addLaptop(1);
    assertEquals(5000.0, panier.getTotal(), 0.01);
  }

  @Test
  void testPanierProHautCA() {
    Customer pro = new Professional("P001", "Entreprise A", "FR12345678901", "552100554", 15000000.00);
    Basket panier = new Basket(pro);
    panier.addPremiumMobile(2);
    panier.addStandardMobile(1);
    panier.addLaptop(1);
    assertEquals(3450.0, panier.getTotal(), 0.01);
  }

  @Test
  void testPanierProBasCA() {
    Customer pro = new Professional("P002", "Entreprise B", "FR12345678901 ", "732829320", 9000000.00);
    Basket panier = new Basket(pro);
    panier.addPremiumMobile(2);
    panier.addStandardMobile(1);
    panier.addLaptop(1);
    assertEquals(3900.0, panier.getTotal(), 0.01);
  }

}
