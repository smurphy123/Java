// Use Showbits as a local class.
class LocalClassDemo {
    public static void main(String args[]) {

        // An inner class version of Showbits.
        class ShowBits {
            int numbits;
        }

        void show(long val) {
            long mask = 1;

            // left-shift a 1 into the proper position
            mask <<= numbits-1;

            int spacer = 0;
            for(; mask != 0; mask >>>= 1) {
                if((val & mask) != 0) System.out.print("1");
            }
        }
    }
}
