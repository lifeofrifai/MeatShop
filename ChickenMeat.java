//class ChickenMeat implements interface meat
public class ChickenMeat implements Meat {

  // Override method getPrice() from interface Meat to have price of this type of meat
  @Override
  public double getPrice() {
    return 40000;
  }

  // toString method to get name of meat
  public String toString() {
    return "Chicken Meat";
  }
}
