class Bakery {
    Cupcake bakeryCupcake;
    double price;
    String giveTotal;
   
    public Bakery(Cupcake cupcakeType, double priceOf) {
      bakeryCupcake = cupcakeType;
      price = priceOf;
      giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
    }
  }