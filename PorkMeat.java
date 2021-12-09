//class PorkMeat implements interface meat
public class PorkMeat implements Meat {

  // Override method getPrice() from interface Meat to have price of this type of meat
  @Override
  public double getPrice() {
    return 80000;
  }

  // toString method to get name of meat
  public String toString() {
    return "Pork Meat";
  }
}