import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        String[] linesIn = Files.readAllLines(Path.of("inputPath")).toArray(new String[0]);
//        String str = "One two three раз два три one1 two2 123 ";
//        System.out.println(str.split("([а-яА-Я ]+)|([0-9 ]+)").length);
//        File directory = new File("/Users/pavel/Documents/Zoom/1");
//        for (File arg : directory.listFiles()) {
//            System.out.println(arg);
//        }
        String str = "One two three раз два три one1 two2 123 ";
        System.out.println(str.split("[a-zA-Z]+").length);
    }

    private static String getTwoMiddleChar(String string) {
        return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
    }
}
