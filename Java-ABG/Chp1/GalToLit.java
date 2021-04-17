/*
    This program converts gallons to liters.
*/
class GalToLit {
    publicstatic void main(String args[]) {
        double gallons; // hols the number of gallons
        double liters; // hold the number of liters

        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; // convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}