/**
 * Created by Bilal on 08/05/2016.
 */
public class Feed_info {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getVerion() {
        return verion;
    }

    public void setVerion(String verion) {
        this.verion = verion;
    }

    public Feed_info(String name, String url, String language, String startdate, String enddate, String verion) {
        this.name = name;
        this.url = url;
        this.language = language;
        this.startdate = startdate;
        this.enddate = enddate;
        this.verion = verion;
    }

    public Feed_info() {
    }

    String name;
    String url;
    String language;
    String startdate;
    String enddate;
    String verion;


}
