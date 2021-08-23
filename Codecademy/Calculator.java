// Simple calculator
// Features: add, subtract, multiply, divide, modulo
public class Calculator {

    public Calculator() {
      
    }
  
    public int add(int a, int b) {
      int sum;
      sum = a + b;
      return sum;
    }
    
    public int subtract(int a, int b) {
      int sum;
      sum = a - b;
      return sum;
    }
  
    public int multiply(int a, int b) {
      int sum;
      sum = a * b;
      return sum;
    }
  
    public int divide(int a, int b) {
      int sum;
      sum = a / b;
      return sum;
    }
  
    public int modulo(int a, int b) {
      int sum;
      sum = a % b;
      return sum;
    }
  
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
  
      myCalculator.add(5,7);
      myCalculator.subtract(45,11);
      myCalculator.multiply(5,7);
      myCalculator.divide(1898,253);
      myCalculator.modulo(56,13);
  
    }
  }
  
