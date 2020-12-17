package fr.esiea.restservice.Data;

import fr.esiea.restservice.Model.MeetPlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MeetingPlacesRepository extends CrudRepository<MeetPlace, Integer> {

}
