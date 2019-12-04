package isl.ayaz.activities;

public class Home {


    private int id;
    private String title;
    private String shortdesc;

    public Home(int id, String title, String shortdesc) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

}