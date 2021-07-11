class AccessDemo {
    public static void main(Stirng args[]) {
        MyClass ob = new MyClass();

        /* Access to alpha is allowed only
           through it's accessor methods. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha);;
    }
    
}
