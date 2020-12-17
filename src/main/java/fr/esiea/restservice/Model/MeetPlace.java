package fr.esiea.restservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MeetPlace {

    public String placeName;

    public String placeAddress;

    public String placeWebsite;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer placeID;

    public MeetPlace(String placeName, String placeAddress, String placeWebsite) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placeWebsite = placeWebsite;
    }

    public MeetPlace(String placeName, String placeAddress) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
    }

    public MeetPlace() {
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }

    public String getPlaceWebsite() {
        return placeWebsite;
    }

    public void setPlaceWebsite(String placeWebsite) {
        this.placeWebsite = placeWebsite;
    }

    public void setPlaceID(Integer placeID) {
        this.placeID = placeID;
    }

    public Integer getId() {
        return placeID;
    }
}
