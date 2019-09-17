/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import Entity.Groups;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class GroupProvider {
    private Scanner scanner = new Scanner(System.in);
    public Groups createGroups() {
        Groups groups = new Groups();
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
        groups.setId(id);
        System.out.print("Название книги: ");
        groups.setName(scanner.nextLine());
        System.out.print("Автор книги: ");
        groups.setProfessiya(scanner.nextLine());
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
        groups.setName(flag);
        return groups;
    }
    
}
