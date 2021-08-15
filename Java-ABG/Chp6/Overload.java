class Overload {
    void ovlDemo() { // First version
        System.out.println("No parameters");
    }

    // Overload ovlDemo for one integer parameter
    void ovlDemo(int a) { // Second version
        System.out.println("One parameter: " +  a);
    }

    // Overload ovlDemo for two integer parameters.
}