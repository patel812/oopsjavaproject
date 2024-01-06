import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album1", "AC/DC");

        album.addSong("TNT", 4.5);
        album.addSong("Highway to hell", 3.5);
        album.addSong("ThunderStruck", 5.0);
        albums.add(album);

        album = new Album("Album2", "Eminem");

        album.addSong("Rap god", 4.5);
        album.addSong("Not Afraid", 3.5);
        album.addSong("Lose yourself", 4.5);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("TNT", playList_1);
        albums.get(0).addToPlayList("Highway to hell", playList_1);
        albums.get(1).addToPlayList("Rap god", playList_1);
        albums.get(1).addToPlayList("Lose yourSelf", playList_1);

        play(playList_1);
    }

    private static void play(LinkedList<Song> playList){

    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - List of all song\n"+
                "5 - Print all available options\n"+
                "6 - Delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterable<Song> iterable = (Iterable<Song>) playList.iterator();
        System.out.println("------------------------------------");




    }

}