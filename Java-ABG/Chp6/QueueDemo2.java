public class QueueDemo2 {
    public static void main(String args[]) {
        // construct 10-element empty queue
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};
        // construct queue from array
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // put some characters into q1
        for(i=0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // construct queue from another queue
        Queue q3 = new Queue(q1);

        // Show the queues
        System.out.print("Contants of q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();

            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for(i=0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
