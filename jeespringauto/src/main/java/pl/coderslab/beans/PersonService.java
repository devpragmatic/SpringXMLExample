package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private final PersonRepository personRepo;

    public PersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public PersonRepository getPersonRepo() {
        return personRepo;
    }
}
