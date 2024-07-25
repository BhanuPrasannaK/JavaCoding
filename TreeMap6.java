import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class TreeMap6{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();
        sc.close();
        String[] words = text.split("\\s+");

        // Creating a TreeMap to store word counts in alphabetical order
        TreeMap<String, Integer> wordCounts = new TreeMap<>();

        // Counting occurrences of each word
        for (String word : words) {
            // Removing punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                if (wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }
        }

        // Displaying the words and their occurrences in alphabetical order
        System.out.println("Word\t\tOccurrences");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}