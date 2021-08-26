public class Droid {
  
    String name = "";
    int batteryLevel = 0;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString() {
      String greeting = "Hello, I'm the droid: " + name;
      return greeting;
    }
  
    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
      batteryLevel = batteryLevel - 10;
    }
  
    public void energyReport() {
      System.out.println("Battery Level: " + batteryLevel);
    }
  
    public void energyTransfer(Droid Recipient, int transferAmount) {
      if ((this.batteryLevel - transferAmount) < 0) {
        System.out.println("Attempting to tranfer more energy than Droid has avialble. Please correct and try again.");
        this.energyReport();
      } else if ((Recipient.batteryLevel + transferAmount) > 100) {
        System.out.println("Attempting to tranfer amount of energy that exceeded recipient battery capacity. Please reduce and try again.");
      Recipient.energyReport();
      } else {
        this.batteryLevel = this.batteryLevel - transferAmount;
        Recipient.batteryLevel = Recipient.batteryLevel + transferAmount;
      }
    }
  
  
    public static void main(String[] args) {
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
  
      Codey.performTask("Step forward");
      Codey.performTask("Jump");
      Codey.energyReport();
      Codey.performTask("Turn left");
      Codey.performTask("Step forward");
      Codey.performTask("Step forward");
      Codey.performTask("Jump");
      Codey.energyReport();
      Codey.performTask("Turn right");
      Codey.performTask("Step forward");
      Codey.performTask("Step forward");
      Codey.performTask("Jump");
      Codey.energyReport();
  
      Droid Wendy = new Droid("Wendy");
      System.out.println(Wendy);
  
      Wendy.energyReport();
      Wendy.energyTransfer(Codey, 20);
      Wendy.energyReport();
      Codey.energyReport();
    }
  }