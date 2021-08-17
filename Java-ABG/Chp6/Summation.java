// Initialize one object with another.
class Summation {
    int sum;

    // Construct from an int.
    Summation(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += 1;
        }
    }

    // Construct from another object.
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
