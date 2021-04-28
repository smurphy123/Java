// Demonstrate automatic conversion from long to double
class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 1000123285L;
        D = L; // Automatic conversion from long to double

        System.out.println("L and D: " + L + " " + D);
    }
}