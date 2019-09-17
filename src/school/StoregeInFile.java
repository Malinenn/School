/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import Entity.Groups;
import Entity.Person;
import Entity.Teachers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.Saveble;

/**
 *
 * @author Melnikov
 */
public class StoregeInFile implements Saveble{
    @Override
    public void saveGroups(List<Groups> listGroups) {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Groups.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listGroups);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
       
    }
    
    @Override
    public List<Groups> loadGroupsFromFile() {
            List<Groups> groups = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("groups.txt");
            oin = new ObjectInputStream(fis);
            groups = (List<Groups>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return groups;
    }

 
    @Override
    public List<Person> loadPersonFromFile() {
        List<Person> person = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Persons.txt");
            oin = new ObjectInputStream(fis);
            person = (List<Person>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return person;
    }


    @Override
    public void savePerson(List<Person> listPerson) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listPerson);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }

    @Override
    public List<Teachers> loadTeachersFromFile() {
        List<Teachers> teacehrs = new ArrayList<>();
            FileInputStream fis = null;
            ObjectInputStream oin = null;
         try {   
            fis = new FileInputStream("Teachers.txt");
            oin = new ObjectInputStream(fis);
            teacehrs = (List<Teachers>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Не могу читать из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
                .log(Level.SEVERE, "Нет такого класса", ex);
        }
        return teacehrs;
    }

    @Override
    public void saveTeachers(List<Teachers> listTeachers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Teachers.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(listTeachers);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(StoregeInFile.class.getName())
               .log(Level.SEVERE, "Не могу записать", ex);
        }
    }

    
}
