import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = {"1", "2", "3"};
        String s = "33? fff! ddd. ";
        System.out.println(Arrays.toString(s.split("[? |! |. ]")));
    }
}
