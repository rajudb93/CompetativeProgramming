package heroVired;
import java.util.LinkedList;
import java.util.*;


class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " - " + artist + " (" + duration + " mins)";
    }
}
class Playlist {
    private LinkedList<Song> playlist;
    private int currentSongIndex;

    public Playlist() {
        playlist = new LinkedList<>();
        currentSongIndex = -1; // -1 means no song is playing initially
    }

    public void addSongAtStart(Song song) {
        playlist.addFirst(song);
    }

    public void addSongAtLast(Song song) {
        playlist.addLast(song);
    }

    public void removeSongByTitle(String title) {
        playlist.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void removeSongByArtist(String artist) {
        playlist.removeIf(song -> song.getArtist().equalsIgnoreCase(artist));
    }

    public void playCurrentSong() {
        if (currentSongIndex >= 0 && currentSongIndex < playlist.size()) {
            Song currentSong = playlist.get(currentSongIndex);
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    public void shufflePlaylist() {
        List<Song> copyPlaylist = new ArrayList<>(playlist); // Create a copy of the playlist
        Collections.shuffle(copyPlaylist); // Shuffle the copy
        currentSongIndex = -1; // Reset the current song index
        playlist.clear(); // Clear the original playlist
        playlist.addAll(copyPlaylist); // Add the shuffled songs back to the original playlist
        System.out.println("Playlist has been shuffled.");
    }

    public void playNextSong() {
        if (currentSongIndex < playlist.size() - 1) {
            currentSongIndex++;
            System.out.println("Now playing next song: " + playlist.get(currentSongIndex));
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    public void playPreviousSong() {
        if (currentSongIndex > 0) {
            currentSongIndex--;
            System.out.println("Now playing previous song: " + playlist.get(currentSongIndex));
        } else {
            System.out.println("Reached the beginning of the playlist.");
        }
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Current Playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Test Insertion Methods
        playlist.addSongAtLast(new Song("XYZ 1", "Ram 1", 4));
        playlist.addSongAtLast(new Song("ABC 2", "Shyam 2", 3));
        playlist.addSongAtStart(new Song("PMN 3", "Dharam 3", 2.1));
        playlist.addSongAtLast(new Song("RTY 4", "Hari 1", 2.2));

        // Test Display Method
        playlist.displayPlaylist();

        // Test Deletion Methods
        playlist.removeSongByTitle("PMN 3");
        playlist.removeSongByArtist("Hari 1");

        // Test Playback Methods
        playlist.playNextSong();
        playlist.playPreviousSong();
        playlist.playCurrentSong();

        // Test Display Method After Deletion
        playlist.displayPlaylist();
        playlist.shufflePlaylist();
        playlist.displayPlaylist();
    }
}
