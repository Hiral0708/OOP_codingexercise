import java.util.LinkedList;
import java.util.Scanner;
public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            LinkedList<Integer> rollList = new LinkedList<>();
            System.out.print("Enter number of roll numbers: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter roll number " + i + ": ");
                rollList.add(sc.nextInt());
            }
            System.out.print("Enter roll number to search: ");
            int rollSearch = sc.nextInt();
            boolean rollFound = searchElement(rollList, rollSearch);
            System.out.println("Roll number found: " + rollFound);
            sc.nextLine(); // clear buffer
            LinkedList<String> nameList = new LinkedList<>();
            System.out.print("\nEnter number of names: ");
            int m = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= m; i++) {
                System.out.print("Enter name " + i + ": ");
                nameList.add(sc.nextLine());
            }
            System.out.print("Enter name to search: ");
            String nameSearch = sc.nextLine();
            boolean nameFound = searchElement(nameList, nameSearch);
            System.out.println("Name found: " + nameFound);
        } 
        catch (Exception e) {
            System.out.println("Invalid input.");
        } 
        finally {
            sc.close();
        }
    }
}
