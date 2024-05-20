package Question1;
//Word Frequency Counter
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter text to count word frequency:");
        String text = sc.nextLine();
        sc.close();
        Map<String, Integer> wordCounts = countWordFrequencies(text);

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequencies(String text) {
        Map<String, Integer> wordCounts = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(text.toLowerCase(), " .,;!?");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }
}

