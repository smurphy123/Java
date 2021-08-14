// Return a programmer-defined object
class Err {
    String msg; // error message
    int severity; // code indicating serverity of error

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
