package main;

public interface PersonProxy {
    abstract void save(Person person);

    abstract Person findById(Long id);
}
