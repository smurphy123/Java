// Use a staic block
class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    /* This block is executed when the class is loaded */
    static { 
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
