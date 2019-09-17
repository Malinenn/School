/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import Entity.Groups;
import Entity.Person;
import Entity.Teachers;
import interfaces.Saveble;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class StorageBase implements Saveble{
    private EntityManager em;
    private EntityTransaction tx;
    public StorageBase(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaProject1PU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    public void saveBooks(List<Groups> listBooks) {
        int n = listBooks.size();
        this.tx.begin();
            for(int i=0; i<n; i++){
                if(listBooks.get(i).getId() == null){
                    em.persist(listBooks.get(i));
                }else{
                    em.merge(listBooks.get(i));
                }
            }
        this.tx.commit();
    }

    @Override
    public void saveGroups(List<Groups> listBooks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Groups> loadGroupsFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> loadPersonFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void savePerson(List<Person> listPerson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Teachers> loadTeachersFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveTeachers(List<Teachers> listTeachers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
