package HomeWork2.Task1;

public class Address {
    private String street;
    private String city;
    private String suite;
    private String zipcode;
    private Geo geo;

    //Constructors
    //allArg
    public Address(String street, String city, String suite, String zipcode, Geo geo) {
        this.street = street;
        this.city = city;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public Address(String street, String city, String suite, String zipcode, double lat, double lng) {
        this.street = street;
        this.city = city;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = new Geo(lat, lng);
    }

    //noArg
    public Address() {
    }

    //Getters &Setters
    //street
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    //city
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //suite
    public String getSuite() {
        return this.suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    //zipcode
    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    //geo
    public Geo getGeo() {
        return this.geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", suite='" + suite + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}

