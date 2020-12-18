package fr.esiea.restservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserSurvey {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userSurveyId;

    private Integer userId;

    private Integer surveyId;

    public UserSurvey(Integer userId, Integer surveyId) {
        this.userId = userId;
        this.surveyId = surveyId;
    }

    public UserSurvey() {
    }

    public Integer getUserSurveyId() {
        return userSurveyId;
    }

    public void setUserSurveyId(Integer userSurveyId) {
        this.userSurveyId = userSurveyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }
}
