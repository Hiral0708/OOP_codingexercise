import java.io.*;
import java.util.Scanner;
public class DataFileCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }
            System.out.println("\n--- File Analysis ---");
            System.out.println("Lines      : " + lineCount);
            System.out.println("Words      : " + wordCount);
            System.out.println("Characters : " + charCount);

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } 
        catch (IOException e) {
            System.out.println("Error reading file.");
        } 
        finally {
            try {
                if (br != null)
                    br.close();
                sc.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
