//Adapter class that implements interface ConverterDollar class
public class AdapterPattern implements ConverterDollar {
  private Meat price;

  // Method Constructor Adapter Pattern
  public AdapterPattern(Meat price ) {
    this.price = price;
  }

  //Overide method getPrice() from interface ConverterDollar class
  @Override
  public double getPrice() {
    double rupiah = price.getPrice();
    return converterRupiahtoDollar(rupiah);
  }

  //Method to convert price from Rupiah to Dollar
  private double converterRupiahtoDollar(double rupiah) {
    return rupiah / 14300;
  }
}
