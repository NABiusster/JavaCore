package HomeWork2.Task1;

public class Geo {
    private double lat;
    private double lng;

    //constructors
    //allArg
    public Geo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    //noArg
    public Geo() {
    }

    //Getters & Setters
    //lat
    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    //lng
    public double getLng() {
        return this.lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
