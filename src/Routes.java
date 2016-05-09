/**
 * Created by Bilal on 08/05/2016.
 */
public class Routes {

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getShortname() {
        return shortname;
    }

    public void setShortname(int shortname) {
        this.shortname = shortname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTextcolor() {
        return textcolor;
    }

    public void setTextcolor(int textcolor) {
        this.textcolor = textcolor;
    }

    public Routes(double id, int agency, String longname, int shortname, int desc, int type, int url, int color, int textcolor) {
        this.id = id;
        this.agency = agency;
        this.longname = longname;
        this.shortname = shortname;
        this.desc = desc;
        this.type = type;
        this.url = url;
        this.color = color;
        this.textcolor = textcolor;
    }

    public Routes() {
    }

    double id;
    int agency;
    int shortname;
    String longname;
    int desc;
    int type;
    int url;
    int color;
    int textcolor;


}
