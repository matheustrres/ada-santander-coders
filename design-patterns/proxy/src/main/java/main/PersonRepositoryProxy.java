package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PersonRepositoryProxy extends PersonRepository implements PersonProxy {
    private static Logger logger = Logger.getLogger(PersonRepositoryProxy.class.getName());

    private Map<Long, Person> cache = new HashMap<>();

    @Override
    public void save(Person person) {
        logger.info("Saving person: " + person);

        super.save(person);

        logger.info("Person successfully saved");
    }

    @Override
    public Person findById(Long id) {
        logger.info("Finding person by id: " + id);
        long startedAt = System.currentTimeMillis();

        Person person = null;

        if (Objects.nonNull(cache.get(id))) {
            logger.info("Getting person by id from cache...");
            person = cache.get(id);
            logger.info("Retrieved person from cache: " + person);
            return person;
        } else {
            person = super.findById(id);
            cache.put(id, person);

            logger.info("Found person by id: " + person);
        }

        long execTime = System.currentTimeMillis() - startedAt;

        logger.info("Execution time : " + execTime);

        return person;
    }
}
