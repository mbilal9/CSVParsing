/**
 * Created by Bilal on 08/05/2016.
 */
public class Calender_dates {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Calender_dates(int id, String date, String type) {
        this.id = id;
        this.date = date;
        this.type = type;
    }

    public Calender_dates() {
    }

    int id;
    String date;
    String type;




}
