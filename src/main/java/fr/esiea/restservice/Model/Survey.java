package fr.esiea.restservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer surveyID;

    private Integer meetPlaceID;

    private Date meetDate;

    public Survey(Integer meetPlaceID, Date meetDate) {
        this.meetPlaceID = meetPlaceID;
        this.meetDate = meetDate;
    }

    public Survey() {
    }

    public Integer getMeetPlaceID() {
        return meetPlaceID;
    }

    public Date getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(Date meetDate) {
        this.meetDate = meetDate;
    }

    public Integer getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Integer surveyID) {
        this.surveyID = surveyID;
    }

    public void setMeetPlaceID(Integer meetPlaceID) {
        this.meetPlaceID = meetPlaceID;
    }
}
