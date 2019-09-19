/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Entity.Groups;
import Entity.Person;
import Entity.Teachers;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Saveble {
    void saveGroups(List<Groups> listBooks);
    List<Groups> loadGroupsFromFile();
    List<Person> loadPersonFromFile();
    void savePerson(List<Person> listPerson);
    List<Teachers> loadTeachersFromFile();
    void saveTeachers(List<Teachers> listTeachers);
    
}
