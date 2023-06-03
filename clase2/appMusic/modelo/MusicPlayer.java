package clase2.appMusic.modelo;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
    private boolean isPlaying;
    private boolean isPaused;
    private Clip clip;

    public MusicPlayer() {
        isPlaying = false;
        isPaused = false;
        clip = null;
    }

    public void playTrack(String trackPath) {
        if (isPlaying) {
            System.out.println("Error: Music is already playing.");
            return;
        }

        try {
            File file = new File(trackPath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            isPlaying = true;
            isPaused = false;
            System.out.println("Playing track: " + trackPath);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void pauseTrack() {
        if (!isPlaying) {
            System.out.println("Error: No track is currently playing.");
            return;
        }

        if (isPaused) {
            System.out.println("Error: Track is already paused.");
            return;
        }

        clip.stop();
        isPaused = true;
        System.out.println("Track paused.");
    }

    public void resumeTrack() {
        if (!isPlaying) {
            System.out.println("Error: No track is currently playing.");
            return;
        }

        if (!isPaused) {
            System.out.println("Error: Track is not paused.");
            return;
        }

        clip.start();
        isPaused = false;
        System.out.println("Track resumed.");
    }

    public void stopTrack() {
        if (!isPlaying) {
            System.out.println("Error: No track is currently playing.");
            return;
        }

        clip.stop();
        clip.close();
        isPlaying = false;
        isPaused = false;
        System.out.println("Track stopped.");
    }
}
