package clase2.appMusic.modelo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        player.playTrack("E:/java/clase2/appMusic/modelo/music/MYA.wav");

        while (true) {
            System.out.println("Enter 'p' to pause, 'r' to resume, or 'q' to quit:");
            String input = scanner.nextLine();

            if (input.equals("p")) {
                player.pauseTrack();
            } else if (input.equals("r")) {
                player.resumeTrack();
            } else if (input.equals("q")) {
                player.stopTrack();
                break;
            }
        }

        scanner.close();
    }
}
