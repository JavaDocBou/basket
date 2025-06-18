package com.example.basket.service;

import com.example.basket.constant.Product;
import com.example.basket.model.Customer;
import com.example.basket.model.Individual;
import com.example.basket.model.Professional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PriceManagement {
  private final Map<Product, Double> standardPrices;
  private final Map<Product, Double> highDiscounts;
  private final Map<Product, Double> lowDiscounts;
  private final double revenuesThreshold;

  public PriceManagement(
    @Value("${premium.mobile.price}") double premiumMobilePrice,
    @Value("${standard.mobile.price}") double standardMobilePrice,
    @Value("${standard.laptop.price}") double laptopPrice,
    @Value("${high.discount.premium.mobile}") double premiumMobileHighDiscountPrice,
    @Value("${high.discount.standard.mobile}") double standardMobileHighDiscountPrice,
    @Value("${high.discount.laptop}") double highDiscountLaptopPrice,
    @Value("${low.dicount.premium.mobile}") double lowDiscountPremiumMobile,
    @Value("${low.discount.standard.mobile}") double lowDiscountStandardMobilePrice,
    @Value("${low.discount.laptop}") double lowDiscountLaptopPrice,
    @Value("${discount.revenues.threshold}") double revenuesThreshold) {

    standardPrices = new HashMap<>();
    standardPrices.put(Product.PREMIUM_MOBILE, premiumMobilePrice);
    standardPrices.put(Product.STANDARD_MOBILE, standardMobilePrice);
    standardPrices.put(Product.LAPTOP, laptopPrice);

    // annual revenues > 10M€
    highDiscounts = new HashMap<>();
    highDiscounts.put(Product.PREMIUM_MOBILE, premiumMobileHighDiscountPrice);
    highDiscounts.put(Product.STANDARD_MOBILE, standardMobileHighDiscountPrice);
    highDiscounts.put(Product.LAPTOP, highDiscountLaptopPrice);

    // annual revenues < 10M€
    lowDiscounts = new HashMap<>();
    lowDiscounts.put(Product.PREMIUM_MOBILE, lowDiscountPremiumMobile);
    lowDiscounts.put(Product.STANDARD_MOBILE, lowDiscountStandardMobilePrice);
    lowDiscounts.put(Product.LAPTOP, lowDiscountLaptopPrice);

    this.revenuesThreshold = revenuesThreshold;
  }

  public double getPrice(Customer customer, Product product) {
    double standardPrice = standardPrices.get(product);
    if (customer instanceof Individual) {
      return standardPrice;
    } else if (customer instanceof Professional) {
      double annualRevenues = ((Professional) customer).getAnnualRevenues();
      Map<Product, Double> discountPrices = annualRevenues > revenuesThreshold ? highDiscounts : lowDiscounts;
      return discountPrices.get(product);
    }
    throw new IllegalArgumentException("Client type unknown");
  }
}
