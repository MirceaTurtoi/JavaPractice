package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public boolean addSong(String titleOfSong, double durationOfSong){
        Song song = new Song(titleOfSong, durationOfSong);
        if (findSong(titleOfSong) == null) {
            songs.add(song);
            System.out.println("Song added " + titleOfSong + " in album " + name);
            return true;
        } else {
            System.out.println("Song already in playlist");
            return false;
        }
    }
    private Song findSong(String titleOfSong){
        Iterator<Song> iterator = songs.iterator();
        int count = 0;
        while (iterator.hasNext()){
            if (iterator.next().getTitle().equals(titleOfSong)){
                return songs.get(count);
            }
            count++;
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        trackNumber--;
        if ((trackNumber < 0) || (trackNumber >= songs.size())) {
            System.out.println("There is no track with number " + trackNumber);
            return false;
        } else {
            System.out.println("New song added to playlist" + songs.get(trackNumber) + " from " + name);
            playlist.add(songs.get(trackNumber));
            return true;
        }
    }
    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist){
        Song songInAlbum = findSong(titleOfSong);
        if (songInAlbum == null) {
            System.out.println("Song not found in album " + name);
            return false;
        } else {
            playlist.add(songInAlbum);
            System.out.println("New song added to playlist " + titleOfSong  + " from " + name);
            return true;
        }
    }
}
