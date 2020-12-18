package fr.esiea.restservice.Data;

import fr.esiea.restservice.Model.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface SurveyRepository extends CrudRepository<Survey, Integer> {
    Survey findSurveyBySurveyId(Integer surveyId);
}
