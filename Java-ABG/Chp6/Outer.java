// Use an inner class
class Outer {
    int nums[];
    Outer(int n[]) {
        nums = n;
    }    

    void nalyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }
}

// TO DO: add analyze