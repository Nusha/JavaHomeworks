import java.util.*;

public class hw5_2 {
    public static HashMap<String, Integer> sortMap(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(hm.entrySet());
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void printLst(List list) {
        for (var name: list) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        List<String> nlt = List.of("Иван Иванов","Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        System.out.println("Original namelist: ");
        printLst(nlt);
        System.out.println("*******************");
        List<String> onln = new ArrayList<>();
        for (String s : nlt) {
            onln.add(s.split(" ")[0]);
        }

        HashMap<String, Integer> names = new HashMap<>();
        for (String value : onln) {
            names.merge(value, 1, Integer::sum);
        }

        Map<String,Integer> sortednames = sortMap(names);
        System.out.println("The result: ");
        sortednames.forEach((n, e) -> System.out.println("Name " + n + " has " + e + " entries."));
        }
        }



