package homework.result;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static homework.result.TextFormatter.getPalindromes;

public class Task1 {
    private static final String INPUT_FILE = "Lesson14/src/main/java/homework/result/input.txt";
    private static final String OUTPUT_FILE = "Lesson14/src/main/java/homework/result/output.txt";

    public static void main(String[] args) throws IOException {
        List<String> words = Files.readAllLines(Path.of(INPUT_FILE));
        Files.write(Path.of(OUTPUT_FILE), getPalindromes(words));
    }
}
