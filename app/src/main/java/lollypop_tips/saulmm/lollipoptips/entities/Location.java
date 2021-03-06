
package lollypop_tips.saulmm.lollipoptips.entities;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Location implements Serializable {

    @Expose
    private String street;
    @Expose
    private String city;
    @Expose
    private String state;
    @Expose
    private String zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
