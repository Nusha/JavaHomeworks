public class hw1_2 {
    public static void main(String[] args) {
        int n = 1000;
        for(int i = 2; i < n; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.printf("%d, ", i);
        }
            }


        }

