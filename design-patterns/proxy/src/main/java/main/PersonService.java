package main;

public class PersonService {
    private PersonProxy personProxy;

    public PersonService(PersonProxy personProxy) {
        this.personProxy = personProxy;
    }

    public void save(Person person) {
        this.personProxy.save(person);
    }

    public Person findById(Long id) {
        return this.personProxy.findById(id);
    }
}
