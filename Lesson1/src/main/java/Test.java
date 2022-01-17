public class Test {
    public static void main(String[] args) {
        String str = "привет как дела";
        String[] strings = str.split(" ");
        int sumLength = 0;
        for (int i = 0; i < strings.length - 1; i++) {
            sumLength += strings[i].length();
        }
//        for (String string : strings) {
//            sumLength += string.length();
//        }
        System.out.println(sumLength / strings.length);
    }
}
