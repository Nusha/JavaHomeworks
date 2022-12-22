import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hw4_2 {
    static void enqueue(Queue<String> llist, String value) {
        llist.offer(value);
    }

    static String dequeue(Queue<String> llist) {
        var el = llist.peek();
        llist.poll();
        return el;
    }

    static String first(Queue<String> llist) {
        return llist.peek();
    }


    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        qu.offer("Alpha");
        qu.offer("Bravo");
        qu.offer("Charlie");
        System.out.printf("Default Queue: %s %n", qu);
        char sw = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("'e' - to enqueue element to queue (Place element at the end of queue). %n" +
                "'d' - to dequeue element from queue (Returns first element and deletes it). %n" +
                "'f' - to view first element in queue. %n" +
                "'q' - to quit. %n");
        while (sw != 'q') {
            System.out.print("Choose option: ");
            sw = in.next().charAt(0);
            switch (sw) {
                case 'e':
                    System.out.printf("Input element value:  ");
                    var elem = in.next();
                    enqueue(qu, elem);
                    System.out.printf("Element has been added to queue, now list looks like: %n" +
                            "%s %n", qu);
                    break;
                case 'd':
                    System.out.printf("First element: %s %n", dequeue(qu));
                    System.out.printf("First element has been deleted from queue, now list looks like: %n" +
                            "%s %n", qu);
                    break;
                case 'f':
                    System.out.printf("First element: %s %n", first(qu));
                    System.out.printf("List looks like: %n" +
                            "%s %n", qu);
                    break;
                case 'q': in.close();
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.printf("Please input correct option. %n");
            }
        }
    }
}
