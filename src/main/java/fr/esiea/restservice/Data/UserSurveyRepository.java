package fr.esiea.restservice.Data;

import fr.esiea.restservice.Model.Survey;
import fr.esiea.restservice.Model.UserSurvey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserSurveyRepository extends CrudRepository<UserSurvey, Integer> {
    UserSurvey findUserSurveyBySurveyIdAndUserId(Integer surveyId, Integer userId);
    Iterable<UserSurvey> findAllByUserId(Integer userId);
}
