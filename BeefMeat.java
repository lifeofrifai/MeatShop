//class BeefMeat implements interface meat
public class BeefMeat implements Meat {

  // Override method getPrice() from interface Meat to have price of this type of meat
  @Override
  public double getPrice(){
    return 100000;
  }

  // toString method to get name of meat
  public String toString(){
    return "Beef Meat";
  }
}