package main;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {
    private Map<Long, Person> items = new HashMap<>();

    private static Long countId = 1L;

    public void save(Person person) {
        items.put(countId++, person);
    }

    public Person findById(Long id) {
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return items.get(id);
    }
}
