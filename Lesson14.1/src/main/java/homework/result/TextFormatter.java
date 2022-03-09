package homework.result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * https://habr.com/ru/post/567106/
 * https://learn.javascript.ru/regexp-lookahead-lookbehind
 */
public final class TextFormatter {
    private static final Pattern WORD_REGEX_PATTERN = Pattern.compile("[\\wа-яА-Я]+");
    private static final String SENTENCE_SPLIT_REGEX = "(?<=[?.!])\\s*";//что-либо
    private static final Pattern MID_WORD_HYPHEN_PATTERN = Pattern.compile("(?<=[\\wа-яА-Я])-[$\\r\\n]+(?=[\\wа-яА-Я])");

    private TextFormatter() {
    }

    public static List<String> getSentencesFromText(String text) {//[?.!]
        List<String> originalSentences = Arrays.asList(text.split(SENTENCE_SPLIT_REGEX));
        List<String> result = new ArrayList<>();
        for (String sentence : originalSentences) {
            Matcher mSentence = MID_WORD_HYPHEN_PATTERN.matcher(sentence);
            result.add(mSentence.replaceAll(""));
        }
        return result;
    }

    public static int getCountWordsInString(String string) {
        return identifyWords(string).size();
    }

    public static List<String> getPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (isPalindrome(string)) {
                result.add(string);
            }
        }
        return result;
    }

    public static boolean hasPalindromeInString(String string) {
        for (String word : identifyWords(string)) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasBlacklistWordInString(String string, String[] blacklist) {
        for (String blWord : blacklist) {
            if (string.contains(blWord)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> identifyWords(String string) {
        return WORD_REGEX_PATTERN.matcher(string)
                .results()
                .map(MatchResult::group)
                .collect(Collectors.toList());
    }

    private static boolean isPalindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(string);
        return string.equalsIgnoreCase(sb.reverse().toString());
    }
}
