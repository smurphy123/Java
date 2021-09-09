class StaticError {
    int demon = 3; // a normal instance variable
    static int val = 1024; // static variable

    /* Error! Can't access a non-static variable
    from within a static method. */
    static int valDivDenom() {
        return val/denom; //won't compile
    }
}
