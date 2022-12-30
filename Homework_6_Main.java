import java.util.*;

public class Homework_6_Main {
    static void printLst(List<Notebook> list) {
        for (var item: list) {
            System.out.println(item);
        }
    }

    static void filterNotes (List<Notebook> notebooks) {
        Map<String, String> filter = new HashMap<>();
        filter.put("ram", "0" );
        filter.put("hdd", "0");
        filter.put("brand", "");
        filter.put("color", "");
        Scanner in = new Scanner(System.in);
        char op = 0;
        while (op != 'q') {
            System.out.println();
            System.out.print("""
                    **************************** \s
                    Please choose  option: \s
                    'r' - to filter by RAM \s
                    'h' - to filter by HDD \s
                    'b' - to filter by  BRAND \s
                    'c' - to filter by COLOR \s
                    'v' - to view the result \s
                    'd' - to drop filter \s
                    'q' - to quit \s
                    *************************** \s""");
            System.out.println();


            op = in.next().charAt(0);
            switch (op) {
                case 'r' -> {
                    System.out.print("Find notebooks with RAM above:  ");
                    String ram = in.next();
                    filter.put("ram", ram);
                }

                case 'h' -> {
                    System.out.print("Find notebooks with HDD above: ");
                    String hdd = in.next();
                    filter.put("hdd", hdd);
                }

                case 'b' -> {
                    System.out.print("Input brand: ");
                    String brand = in.next();
                    filter.put("brand", brand);
                }
                case 'c' -> {
                    System.out.print("Input color: ");
                    String color = in.next();
                    filter.put("color", color);
                }

                case 'v' -> {
                    List<Notebook> output = new ArrayList<>();

                    System.out.print("Search filter: " + filter + "\n");
                    boolean found = false;
                    for (Notebook item : notebooks) {
                        if (filter.get("brand").equals(item.getBrand()) || filter.get("brand").equals("")) {
                            if (filter.get("color").equals(item.getColor()) || filter.get("color").equals("")) {
                                if (Integer.parseInt(filter.get("ram")) <= item.getRam() && Integer.parseInt(filter.get("hdd")) <= item.getHdd()) {
                                    output.add(item);
                                    found = true;
                                }
                            }
                        }
                    }
                    if (found) {
                        System.out.println("Results:");
                        printLst(output);
                    } else {
                        System.out.println("No matches");
                    }
                }
                case 'd' -> {
                    filter.put("ram", "0" );
                    filter.put("hdd", "0");
                    filter.put("brand", "");
                    filter.put("color", "");
                    System.out.println("Filter has been dropped.");
                }

                case 'q' -> {
                    System.out.println("Quiting");
                    in.close();
                }
                default -> System.out.println("Please choose correct option.");
            }
        }
    }

    public static void main(String[] args) {
        Notebook note1 = new Notebook(1, "HP", "Celeron N4020", 4, 128, "no","black", "China" );
        Notebook note2 = new Notebook(2, "ASUS", "Intel Pentium Silver N5030", 8, 256, "Windows 11", "silver", "China" );
        Notebook note3 = new Notebook(3, "Huawei","AMD Ryzen 5 5500U", 16, 512, "Windows 10", "red", "China");
        Notebook note4 = new Notebook(4, "MSI", "Intel Core i7-12700H", 32, 2000, "Linux", "white", "China");

        List<Notebook> notebooks = Arrays.asList(note1, note2, note3, note4);
        printLst(notebooks);
        filterNotes(notebooks);
    }
}
