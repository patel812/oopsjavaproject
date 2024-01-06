import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> Songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.Songs = new ArrayList<Song>();
    }

    public Album(){

    }

    public Song findSong(String title){

        for (Song checkedSong : Songs){
            if (checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }



    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            Songs.add(new Song(title, duration));
            System.out.println(title + "Successfully added to the list");
            return true;
        }else {
            System.out.println("Song with the name "+title+"already exist in the list");
            return false;
        }
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber -1;
        if(index > 0 && index <= this.Songs.size()){
            PlayList.add(this.Songs.get(index));
            return true;
        }
        System.out.println("This album does not have song with tracknumber "+trackNumber);
        return false;
    }



    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song checkedSong : this.Songs){
            if(checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
        System.out.println(title + "there is no such song in album");
        return false;
    }

}
