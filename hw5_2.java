import java.util.*;

public class hw5_2 {
    public static HashMap<String, Integer> sortMap(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
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
        for (int i = 0; i < nlt.size(); i++) {
            onln.add(nlt.get(i).split(" ") [0]);
        }

        Map<String,Integer> names = new HashMap<String,Integer>();
        for (int i = 0; i < onln.size(); i++) {
            String value = onln.get(i);
             if (names.get(value) != null) names.put(value, names.get(value) + 1);
             else names.put(value, 1);
             }

        Map<String,Integer> sortednames = sortMap((HashMap<String, Integer>) names);
        System.out.println("The result: ");
        sortednames.forEach((n, e) -> {
            System.out.println("Name " + n + " has " + e + " entries.");
        });
        }
        }



