import java.util.LinkedList;
import java.util.Scanner;
public class MusicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();
        try {
            System.out.print("Enter number of songs to add: ");
            int n = sc.nextInt();
            sc.nextLine(); // clear buffer
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter song " + i + ": ");
                String song = sc.nextLine();
                playlist.add(song);
            }
            System.out.println("\nFull Playlist:");
            System.out.println(playlist);
            if (!playlist.isEmpty()) {
                String first = playlist.removeFirst();
                System.out.println("\nPlaying (removed): " + first);
                System.out.println("Playlist after playing first song:");
                System.out.println(playlist);
            }
            if (!playlist.isEmpty()) {
                String last = playlist.removeLast();
                System.out.println("\nSkipping (removed): " + last);
                System.out.println("Playlist after skipping last song:");
                System.out.println(playlist);
            }
        } 
        catch (Exception e) {
            System.out.println("Invalid input.");
        } 
        finally {
            sc.close();
        }
    }
}
