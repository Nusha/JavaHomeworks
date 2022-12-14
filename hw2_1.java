import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hw2_1 {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(hw2_1.class.getName());
        FileHandler fh = new FileHandler("sorting.txt", true);
        log.setUseParentHandlers(false);
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        log.info("Program started");
        Random rnd = new Random();
        int[] rannums = new int[11];
        System.out.println(Arrays.toString(rannums));
        for (int i = 0; i < rannums.length; i++) {
            rannums[i] = rnd.nextInt(20);
        }
        System.out.println("Random generated Array: " + Arrays.toString(rannums));
        log.info("Random generated array:" + Arrays.toString(rannums));
        int tmp;
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < rannums.length - 1; i++) {
                if (rannums[i] > rannums[i + 1]) {
                    sorted = false;

                    tmp = rannums[i];
                    rannums[i] = rannums[i + 1];
                    rannums[i + 1] = tmp;
                    ++count;
                    log.info("Iteration # " + count + " Array looks like: " + Arrays.toString(rannums));
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(rannums));
        log.info("Program finished.");
    }
}
