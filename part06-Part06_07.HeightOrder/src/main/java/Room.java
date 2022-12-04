/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public String toString() {
        for(Person person: persons) {
            return person.getName() + " (" + person.getHeight() + " cm)";
        } 
        return null;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        int shortestHeight = 999;
        Person shortestperson = new Person("", 0);
        for(Person person: persons) {
            if (person.getHeight() < shortestHeight) {
                shortestHeight = person.getHeight();
                shortestperson = person;
            }
        }
        return shortestperson;
    }
    
    public Person take() {
        if(persons.isEmpty()) {
            return null;
        }
        int shortestHeight = 999;
        Person shortestperson = new Person("", 0);
        int index = 0;
        for(Person person: persons) {
            if (person.getHeight() < shortestHeight) {
                shortestHeight = person.getHeight();
                shortestperson = person;
                index = persons.indexOf(person);
            }
        }
        persons.remove(persons.get(index));
        return shortestperson;
    }
}
