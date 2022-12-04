
public class Song {

    private final String artist;
    private final String name;
    private final int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if (!(compared instanceof Song)) {
            return false;
        }
        
        Song comparedSong = (Song) compared;
        
        if (this.artist.equals(comparedSong.artist) && this.name.equals(comparedSong.name) && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        } else {
            return false;
        }
         
    }
}
