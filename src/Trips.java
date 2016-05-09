/**
 * Created by Bilal on 08/05/2016.
 */
public class Trips {
    public double getRoute_id() {
        return route_id;
    }

    public void setRoute_id(double route_id) {
        this.route_id = route_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public int getShortname() {
        return shortname;
    }

    public void setShortname(int shortname) {
        this.shortname = shortname;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public int getBikes() {
        return bikes;
    }

    public void setBikes(int bikes) {
        this.bikes = bikes;
    }

    public int getAttributes() {
        return attributes;
    }

    public void setAttributes(int attributes) {
        this.attributes = attributes;
    }

    public Trips(double route_id, int service_id, int trip_id, String headsign, int shortname, int direction, int block, int shape, int bikes, int attributes) {
        this.route_id = route_id;
        this.service_id = service_id;
        this.trip_id = trip_id;
        this.headsign = headsign;
        this.shortname = shortname;
        this.direction = direction;
        this.block = block;
        this.shape = shape;
        this.bikes = bikes;
        this.attributes = attributes;
    }

    public Trips() {
    }

    double route_id;
    int service_id;
    int trip_id;
    String headsign;
    int shortname;
    int direction;
    int block;
    int shape;
    int bikes;
    int attributes;
}
