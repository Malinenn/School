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
public class BookProvider {
    private Scanner scanner = new Scanner(System.in);
    public Person createPerson() {
        Person person = new Person();
        System.out.println("-------Создание книги--------");
        String inputNumber = "";
        Long id = null;
        boolean flag = true;
        do{
           System.out.print("Идентификатор книги: ");
           inputNumber = scanner.nextLine();
           try {
              id=new Long(inputNumber);
              flag = false;
           }catch (Exception e){
               System.out.println("Ошибка ввода!");
           }
        }while(flag);
        person.setId(id);
        System.out.print("Название книги: ");
        person.setName(scanner.nextLine());
        System.out.print("Автор книги: ");
        person.setLastname(scanner.nextLine());
        System.out.print("ISBN книги: ");
        person.setStatus(scanner.nextLine());
        int year=0;
        flag=true;
        do{
           System.out.print("Год издания книги: ");
           inputNumber = scanner.nextLine();
           try {
              year=new Integer(inputNumber);
              flag = false;
           }catch (Exception e){
               System.out.println("Ошибка ввода!");
           }
        }while(flag);
        person.se(flag);
        return person;
    }
    
}
