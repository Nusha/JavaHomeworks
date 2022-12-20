import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;

public class hw3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> gen = new ArrayList<>();
        Random rnd = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) gen.add(rnd.nextInt(1, 15));
        System.out.println(gen);
        int min = gen.get(0);
        int max = gen.get(0);
        for (int i = 1; i < size ; i++) {
            if (gen.get(i) < min) min = gen.get(i);
                    }
        for (int i = 1; i < size ; i++) {
            if (gen.get(i) > max) max = gen.get(i);
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        int sum = 0;
        for (int e : gen)  sum += e;

        double ave = sum / size;
        System.out.println("Averege of list values: " + ave);

        double difference=abs(ave-gen.get(0));
        int suitable = gen.get(0);
        for (Integer elem : gen) {

            if (abs(ave - elem) < difference) {
                difference = abs(ave - elem);
                suitable = elem;
            }
        }
        System.out.println("Suitable average value in list: " + suitable);
            }

        }






