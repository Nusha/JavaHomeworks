import java.util.*;

public class hw2_3 {
        static String[] deparse(String string) {
        String regex = "[\\[ \\] \\{ \\} \\: \"]";
        string = string.replace("предмет","");
        string = string.replace("фамилия","");
        string = string.replace("оценка","");
        string = string.replaceAll(regex, "");
        String[] arr = string.split(("\\,"));
        return arr;
    };
    public static void main(String[] args) {
          String s = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//        String regex = "[\\[ \\] \\{ \\} \\: \"]";
//        s = s.replace("предмет","");
//        s = s.replace("фамилия","");
//        s = s.replace("оценка","");
//        s = s.replaceAll(regex, "");
//        String[] arr = s.split(("\\,"));
        String[] arr = deparse(s);
        List<String> surnames = new ArrayList<>();
        List<String> grades = new ArrayList<>();
        List<String> disciplines = new ArrayList<>();
        List<String> tmplt = new ArrayList<>(Arrays.asList("Студент","получил","по предмету"));

        for (int i = 0; i < arr.length-2;  i += 3) {
            surnames.add(arr[i]);
            grades.add(arr[i+1]);
            disciplines.add(arr[i+2]);
        }
        for (int i = 0; i < surnames.size(); i++) {
            String sb = new String(tmplt.get(0)+" "+surnames.get(i)+" "+tmplt.get(1)+" "+grades.get(i)+" "+tmplt.get(2)+" "+disciplines.get(i)+".");
            System.out.println(sb);
        }
        }
    }

