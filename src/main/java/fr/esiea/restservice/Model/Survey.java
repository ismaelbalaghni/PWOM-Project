package fr.esiea.restservice.Model;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer surveyId;

    private Integer meetPlaceId;

    private String meetPlaceName;

    private Date meetDate;

    private Integer userId;

    private Integer votes;

    public Survey(String meetPlaceName, String meetDate) throws ParseException {
        this.meetPlaceName = meetPlaceName;
        this.meetDate = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE).parse(meetDate);
        this.votes = 0;
    }

    public Survey() {
    }

    public Integer getMeetPlaceId() {
        return meetPlaceId;
    }

    public Date getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(Date meetDate) {
        this.meetDate = meetDate;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyID) {
        this.surveyId = surveyID;
    }

    public void setMeetPlaceId(Integer meetPlaceID) {
        this.meetPlaceId = meetPlaceID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVotes() {
        return votes;
    }

    public boolean addVote(){
        this.votes += 1;
        return true;
    }

    public String getMeetPlaceName() {
        return meetPlaceName;
    }

    public void setMeetPlaceName(String meetPlaceName) {
        this.meetPlaceName = meetPlaceName;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}