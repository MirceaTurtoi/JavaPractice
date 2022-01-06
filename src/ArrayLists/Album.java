package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
//    private ArrayList<Song> songs;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//        songs = new ArrayList<>();
        this.songs = new SongList();
    }

    public static class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if (this.songs.contains(song)) {
                System.out.println("Song already in playlist");
                return false;
            } else{
                this.songs.add(song);
                System.out.println("Added " + song);
                return true;
            }
        }

        private Song findSong(String title){
            for (int i=0; i< songs.size(); i++){
                if (songs.get(i).getTitle() == title){
                    System.out.println("Found the title.");
                    return songs.get(i);
                }
            }
            System.out.println("Didn't find the title");
            return null;
        }

        private Song findSong(int trackSong){
            trackSong--;
            if (trackSong >= 0 && trackSong <= songs.size()){
                System.out.println("Found the song");
                return songs.get(trackSong);
            } else {
                System.out.println("Didn't find the song");
                return null;
            }
        }

    }

    public boolean addSong(String titleOfSong, double durationOfSong){
        return this.songs.add(new Song(titleOfSong, durationOfSong));
//        if (findSong(titleOfSong) == null) {
//            songs.add(song);
//            System.out.println("Song added " + titleOfSong + " in album " + name);
//            return true;
//        } else {
//            System.out.println("Song already in playlist");
//            return false;
//        }
    }
//    private Song findSong(String titleOfSong){
//        Song checkedSong = this.songList.findSong(titleOfSong);
//        if (checkedSong != null) return checkedSong;
//        else return null;
//        }
//        Iterator<Song> iterator = songs.iterator();
//        int count = 0;
//        while (iterator.hasNext()){
//            if (iterator.next().getTitle().equals(titleOfSong)){
//                return songs.get(count);
//            }
//            count++;
//        }
//        return null;
//    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        } else {
            return false;
//        trackNumber--;
        }
//        if ((trackNumber < 0) || (trackNumber >= songs.size())) {
//            System.out.println("There is no track with number " + trackNumber);
//            return false;
//        } else {
//            System.out.println("New song added to playlist" + songs.get(trackNumber) + " from " + name);
//            playlist.add(songs.get(trackNumber));
//            return true;
//        }
    }
    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist){
        Song songInAlbum = songs.findSong(titleOfSong);
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
