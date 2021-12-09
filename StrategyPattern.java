//Strategy pattern class
public class StrategyPattern {
  private Meat meat;

  //method Setter setMeat
  public void setMeat(Meat meat){
    this.meat = meat;
  }

  // method getter for get value name of meat
  public Meat getMeat(){
    return meat;
  }

  // method getter for get value price of meat
  public double getPrice(){
    return meat.getPrice();
  }
}
