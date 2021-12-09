/*
  Muhammad Nurifai
  1908107010057
  Praktikum APL A
*/

import java.util.Scanner; // import scanner 

public class JayaMeatShop {
  
  private static Scanner scan; // declaration of scanner as scan

  //main class
  public static void main(String[] args) {
    
    System.out.println("Hello Welcome to Jaya Meat Shop\nChoose Item to Check Price :\n1. Beef Meat \n2. Chicken Meat \n3. Pork Meat");
    System.out.println("---------------------------------");
    System.out.print("Please Input Your Choise : ");

    //process scan list of menu
    scan = new Scanner(System.in);
    int category = scan.nextInt();

    // Strategy Pattern implementation 

    //declare object StrategyPattern
    StrategyPattern choise = null;
    choise = new StrategyPattern();

    if (category == 1) {
      choise.setMeat(new BeefMeat());
    } else if (category == 2) {
      choise.setMeat(new ChickenMeat());
    } else if (category == 3) {
      choise.setMeat(new PorkMeat());
    } else {
      System.out.println("There Is No Choise !!!!!");
    }

    System.out.println("---------------------------------");
    System.out.println("For 1 Kilogram " + choise.getMeat());
    System.out.println("Price In Rupiah Is Rp." + String.format("%.0f", choise.getPrice()));

    //End of Strategy Pattern implementation


    // Adapter Pattern implementation 

    if (category == 1){
      Meat beefRupiahPrice = new BeefMeat();
      ConverterDollar dollarPrice = new AdapterPattern(beefRupiahPrice);
      System.out.println("Price in Dollar is $" + String.format("%.2f", dollarPrice.getPrice()));
    } else if (category == 2){
      Meat chickenRupiahPrice = new ChickenMeat();
      ConverterDollar dollarPrice = new AdapterPattern(chickenRupiahPrice);
      System.out.println("Price in Dollar is $" + String.format("%.2f", dollarPrice.getPrice()));
    } else if (category == 3){
      Meat porkRupiahPrice = new PorkMeat();
      ConverterDollar dollarPrice = new AdapterPattern(porkRupiahPrice);
      System.out.println("Price in Dollar is $" + String.format("%.2f", dollarPrice.getPrice()));
    }

    // End of Adapter Pattern implementation
    

  }
}
