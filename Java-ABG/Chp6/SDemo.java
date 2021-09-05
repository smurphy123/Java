class SDemo {
    public static void main(String args[]) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Each object has its own copy of an instance variable
        ob1.x = 10;
        ob2.x = 20;
    }    
}
