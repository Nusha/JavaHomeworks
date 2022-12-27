import java.util.*;

public class hw5_1 {

    static Map<String, List> addValues() {
        List<String> phones = new ArrayList<>();
        List<String> addresses = new ArrayList<>();
        Map<String,List> entry = new HashMap<>();
        Scanner in = new Scanner(System.in);
        char sw = 0;
        while (sw != 's') {
            System.out.print("""
                    Please choose option\s
                    (p)hone - to input phone number to entry\s
                    (a)ddress - to input address to entry\s
                    (s)ave - to save entry to book\s
                    ********************************************\s
                    """);
            System.out.print("Choose option: ");
            sw = in.next().charAt(0);
            switch (sw) {
                case 'p' -> {
                    System.out.print("Input phone number: ");
                    phones.add(in.next());
                    System.out.println("Phone number added");
                }
                case 'a' -> {
                    System.out.print("Input address: ");
                    addresses.add(in.next());
                    System.out.println("Address added");
                }
                case 's' -> System.out.println("Saving and exiting to main menu");
                default -> System.out.println("Choose correct option");
            }
        }
        entry.put("Phones:", phones);
        entry.put("Addreses:", addresses);
        return entry;

    }
    public static void main(String[] args) {

        Map<String, Map> pb = new HashMap<>();
        Scanner in = new Scanner(System.in);
         char op = 0;
        while (op != 'q') {
            System.out.print("""
                    Please choose options:\s
                    (a)dd - to add entry to phonebook\s
                    (d)elete - to delete entry from phonebook\s
                    (v)iew - to view all entry's\s
                    (q)uit - to quit phonebook\s
                    *************************************************\s
                    """);
            System.out.print("Choose option: ");
            op = in.next().charAt(0);
            switch (op) {
                case 'a' -> {
                    System.out.print("Input name: ");
                    String name = in.next();
                    pb.put(name, addValues());
                }
                case 'd' -> {
                    System.out.print("Delete name: ");
                    String nametodel = in.next();
                    pb.remove(nametodel);
                }
                case 'v' -> pb.forEach((n, e) -> System.out.println(n + " " + e.toString().replaceAll("[\\[\\]}{=]", " ")));
                case 'q' -> System.out.println("Quiting");
                default -> System.out.println("Choose correct option.");
            }
         }
        in.close();

    }

}
