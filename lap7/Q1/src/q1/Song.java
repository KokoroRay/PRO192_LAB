package q1;

public class Song {
    private String name;
    private int duration;
    private String composer;

    public Song(String name, int duration, String composer) {
        this.name = name;
        this.duration = duration;
        this.composer = composer;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getComposer() {
        return composer;
    }
}
