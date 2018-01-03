package fi.make.kauppa;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PersonController {

    List<Person> persons = null;

    @RequestMapping("/persons")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Person> getAllPersons() {
        this.createPersons();
        return this.persons;
    }

    private void createPersons() {
        persons = new ArrayList<Person>();
        persons.add(new Person("CBR250R", "Honda"));
        persons.add(new Person("Ninja250R", "Kaswasaki"));
        persons.add(new Person("R1", "Yamaha"));
        persons.add(new Person("FatBoy", "Harley Davidson"));
    }

}