// Apromotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // No cast needed. Promoted to an int.

        b = 10;
        b = (byte) (b * b); // cast needed!! (Value too large to be stored in a byte. Needs to be converted to int)

        System.out.println("i and b: " + i + " " + b);
    }
}