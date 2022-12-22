import java.util.Arrays;
import java.util.List;

public class hw4_3 {
    static Boolean checkHooks(String value) {
        int flag = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '(' || value.charAt(i) == '[' || value.charAt(i) == '{') ++flag;
            else if (value.charAt(i) == ')' || value.charAt(i) == ']' || value.charAt(i) == '}') --flag;
        }
        return flag == 0;
    }
    public static void main(String[] args) {
        List<String>  expressions = Arrays.asList("a+(d*3)", "\\[a+(1*3)", "\\[6+(3*3)]", "{a}\\[+\\]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" );
        System.out.println();
        for (String el : expressions)  System.out.println(el + " - " + checkHooks(el));
    }
}
