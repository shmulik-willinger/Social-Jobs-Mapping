package core.repositories;

import core.model.Person;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends GraphRepository<Person> {}
