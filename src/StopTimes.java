/**
 * Created by Bilal on 08/05/2016.
 */
public class StopTimes {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDeptime() {
        return deptime;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getHeadsign() {
        return headsign;
    }

    public void setHeadsign(int headsign) {
        this.headsign = headsign;
    }

    public int getPickup() {
        return pickup;
    }

    public void setPickup(int pickup) {
        this.pickup = pickup;
    }

    public int getDropoff() {
        return dropoff;
    }

    public void setDropoff(int dropoff) {
        this.dropoff = dropoff;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAttributes() {
        return attributes;
    }

    public void setAttributes(int attributes) {
        this.attributes = attributes;
    }

    public StopTimes(int id, String arrivaltime, String deptime, int stop, int sequence, int headsign, int pickup, int dropoff, int distance, int attributes) {
        this.id = id;
        this.arrivaltime = arrivaltime;
        this.deptime = deptime;
        this.stop = stop;
        this.sequence = sequence;
        this.headsign = headsign;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.distance = distance;
        this.attributes = attributes;
    }

    public StopTimes() {
    }

    int id;
    String arrivaltime;
    String deptime;
    int stop;
    int sequence;
    int headsign;
    int pickup;
    int dropoff;
    int distance;
    int attributes;

}
