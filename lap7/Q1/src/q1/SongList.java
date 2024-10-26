package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SongList {
    private List<Song> listSong;
    private String info;

    public SongList() {
        this.listSong = new ArrayList<>();
        this.info = "";
    }

    public void inputData(String name, int duration, String composer) {
        Song s = new Song(name, duration, composer);
        listSong.add(s);
        info = String.format("Add Song(%s, %d, %s)\n", s.getName(), s.getDuration(), s.getComposer());
    }

    public Song getSongMaxDuration() {
        if (listSong.isEmpty()) {
            info = "No songs available.\n";
            return null;
        }
        Song maxSong = Collections.max(listSong, Comparator.comparingInt(Song::getDuration));
        info = String.format("Max Duration Song is %s\n", maxSong.getName());
        return maxSong;
    }

    public List<Song> getTop3Ranking() {
        if (listSong.isEmpty()) {
            info = "No songs available.\n";
            return new ArrayList<>();
        }
        listSong.sort(Comparator.comparingInt(Song::getDuration).reversed());
        info = "Top 3 Songs include ";
        List<Song> top3 = new ArrayList<>(listSong.subList(0, Math.min(3, listSong.size())));
        for (Song s : top3) {
            info += s.getName() + ",";
        }
        info = info.substring(0, info.length() - 2) + "\n"; // Remove trailing comma and space
        return top3;
    }

    public void removeSongMaxDuration() {
        Song maxSong = getSongMaxDuration();
        if (maxSong != null) {
            listSong.remove(maxSong);
            info = "Remove Song Max Duration\n";
        } else {
            info = "No songs to remove.\n";
        }
    }

    public void removeAllData() {
        listSong.clear();
        info = "*** Remove All Song\n";
    }

    public String getInfo() {
        return info;
    }
}
