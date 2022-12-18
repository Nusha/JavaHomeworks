import java.util.ArrayList;
import java.util.Random;

public class hw3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> kuz = new ArrayList<>();
        Random rnd = new Random();
        int size = 15;
        for (int i = 0; i < size; i++) kuz.add(rnd.nextInt(1, 30));
        System.out.println("Original generated list: "+ kuz);
        int len = kuz.size();
        for (int i = 0; i < len; i++) {
            if (kuz.get(i) % 2 == 0) {
                kuz.remove(kuz.get(i));
                --len;
                --i;
            }
        }
        System.out.println("Modified list with only odd numbers: " + kuz);
    }
}

