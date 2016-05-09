/**
 * Created by Bilal on 08/05/2016.
 */
public class Stops {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public int getPlatform() {
        return platform;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public int getStation_name() {
        return station_name;
    }

    public void setStation_name(int station_name) {
        this.station_name = station_name;
    }

    public int getStation1() {
        return station1;
    }

    public void setStation1(int station1) {
        this.station1 = station1;
    }

    public int getStation2() {
        return station2;
    }

    public void setStation2(int station2) {
        this.station2 = station2;
    }

    public int getStation3() {
        return station3;
    }

    public void setStation3(int station3) {
        this.station3 = station3;
    }

    public int getStation4() {
        return station4;
    }

    public void setStation4(int station4) {
        this.station4 = station4;
    }

    public Stops(int id, String code, String name, int desc, double latitude, double longitude, int elevation, int zone, String url, int location, int station, int platform, int station_name, int station1, int station2, int station3, int station4) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.zone = zone;
        this.url = url;
        this.location = location;
        this.station = station;
        this.platform = platform;
        this.station_name = station_name;
        this.station1 = station1;
        this.station2 = station2;
        this.station3 = station3;
        this.station4 = station4;
    }

    public Stops() {
    }

    int id;
    String code;
    String name;
    int desc;
    double latitude;
    double longitude;
    int elevation;
    int zone;
    String url;
    int location;
    int station;
    int platform;
    int station_name;
    int station1;
    int station2;
    int station3;
    int station4;


}
