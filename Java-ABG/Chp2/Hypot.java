/*
    Use the Pythagorean theorm to find the length of the hypotenuse
    given the length of the two oppsing sides.
*/
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);

        System.out.println("Hypotenuse is " + z);
    }
}