import java.util.LinkedList;

public class hw4_1 {
    static void reverseList(LinkedList list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            var temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> linlist = new LinkedList<>();
        linlist.add("Alpha");
        linlist.add("Bravo");
        linlist.add("Charlie");
        linlist.add("Delta");
        linlist.add("Echo");
        linlist.add("Foxtrot");
        linlist.add("Golf");

        System.out.printf("Number of elements: %d %n", linlist.size());
        System.out.printf("Original list: %s %n", linlist);

//        Collections.reverse(linlist); // It may be the answer? )))

        reverseList(linlist);
        System.out.printf("Reversed list: %s %n " ,linlist);
    }
}