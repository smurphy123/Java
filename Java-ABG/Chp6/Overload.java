class Overload {
    void ovlDemo() { // First version
        System.out.println("No parameters");
    }

    // Overload ovlDemo for one integer parameter
    void ovlDemo(int a) { // Second version
        System.out.println("One parameter: " +  a);
    }

    // Overload ovlDemo for two integer parameters.
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Overload ovlDemo for two double parameters
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}