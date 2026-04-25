import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();
            input = input.toLowerCase();
            String[] words = input.split("\\s+");
            HashMap<String, Integer> map = new HashMap<>();
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            System.out.println("\nWord Frequencies:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        } 
        catch (Exception e) {
            System.out.println("Error processing input.");
        } 
        finally {
            sc.close();
        }
    }
}
