public class Song {
    String title;
    double duration;

    //Constructor-------------------------------------------------
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song(){

    }

    //Getter------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }


    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }


}
