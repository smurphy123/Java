// Read a character from the keyboard
class KbIn {
    public static void main(string args[]) {
        throws java.io.IOException {
            char ch;

            System.out.print("Press a key followed by Enter: ");
            ch = (char) System.in.read(); // get a char
            System.out.println("Your key is: " + ch);
        }
    }
}
