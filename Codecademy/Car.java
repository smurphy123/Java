class Car {
 
    String color;
    int year;
 
    public Car(String carColor) {
        color = carColor;
    }

    public Car(String carColor, int carYear) {
        color = carColor;
        year = carYear;
    }

 
    public static void main(String[] args) {
        Car myCar = new Car("red");
        System.out.println(myCar);
    }
 
   public String toString() {
       return "This is a " + color + " car!";
   }
}