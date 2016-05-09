/**
 * Created by Bilal on 08/05/2016.
 */
public class Frequencies {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeadway() {
        return headway;
    }

    public void setHeadway(int headway) {
        this.headway = headway;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }


    public Frequencies(int id, int headway, String starttime, String endtime) {
        this.id = id;
        this.headway = headway;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public Frequencies() {
    }

    int id;
    int headway;
    String starttime;
    String endtime;
}
