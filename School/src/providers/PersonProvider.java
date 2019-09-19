/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;
import Entity.Person;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class PersonProvider {
    private Scanner scanner = new Scanner(System.in);
    public Person createPerson() {
        Person person = new Person();
        System.out.println("-------Создание читателя--------");
        String inputNumber = "";
        Long id = null;
        boolean flag = true;
        do{
           System.out.print("Идентификатор читателя: ");
           inputNumber = scanner.nextLine();
           try {
              id=new Long(inputNumber);
              flag = false;
           }catch (Exception e){
               System.out.println("Ошибка ввода!");
           }
        }while(flag);
        person.setId(id);
        System.out.print("Имя читателя: ");
        person.setName(scanner.nextLine());
        System.out.print("Фамилия читателя: ");
        person.setLastname(scanner.nextLine());
        System.out.print("Телефон читателя: ");
        person.setStatus(scanner.nextLine());
        
        return person;
    }
    
}
