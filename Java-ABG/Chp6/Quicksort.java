// sample version of the Quicksort
class Quicksort {
    
    // Set up a call to the actual Quicksortmethod.
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }

    // A recursive version of Quicksort for characters.
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left+right)/2];

        
    }
}
