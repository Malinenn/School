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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import providers.GroupProvider;
import providers.PersonProvider;
import providers.TeachersProvider;

/**
 *
 * @author pupil
 */
public class App {
    private List<Groups> listGroup = new ArrayList<>();
    private List<Person> listPerson = new ArrayList<>();
    private List<Teachers> listTeachers = new ArrayList<>();
    
    private Saveble savable;
    public App() {
       savable = new StoregeInFile();
       //savable = new StorageInFile();
        try {
            listGroup = savable.loadGroupsFromFile();
        } catch (Exception e) {
            System.out.println("Нет данных");
        }
       
        try {
            listPerson = savable.loadPersonFromFile();
        } catch (Exception e) {
            System.out.println("Нет данных");
        }
        try {
            listTeachers = savable.loadTeachersFromFile();
        } catch (Exception e) {
            System.out.println("Нет данных");
        }
    }
    
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Школа ----");
        String repeat = "r";
        int operation;
        do{
            System.out.println("Выберите действие:");
            System.out.println("1. Новый персонаж");
            System.out.println("2. Информация о учителе");
            System.out.println("3. Информация о ученике");
            System.out.println("4. Информация о группе");
            System.out.println("5. Вывести список учащихся");
            System.out.println("6. Вывести список учителей");
            operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {
                case 1:
                    GroupProvider groupProvider = new GroupProvider();
                    listGroup.add(groupProvider.createGroups());
                    savable.saveGroups(listGroup);
                    for(int i=0; i < listGroup.size();i++){
                       System.out.println("Список групп: " 
                            + listGroup.get(i).getName()
                        ); 
                    }
                    break;
                case 2:
                    PersonProvider personProvider = new PersonProvider();
                    listPerson.add(personProvider.createPerson());
                    savable.savePerson(listPerson);
                    for(int i=0; i < listPerson.size();i++){
                       System.out.println(
                            "Список учеников: " 
                            + listPerson.get(i).getName()
                        ); 
                    }
                    break;
                case 3:
                    TeachersProvider teachersProvider = new TeachersProvider();
                    //listTeachers = teachersProvider.Dolzhnost(listTeachers);
                    savable.saveTeachers(listTeachers);
                    break;
                case 4:
                    System.out.println("Список книг4: ");
                    for(int i=0;i<listGroup.size();i++){
                        System.out.println(listGroup.get(i));
                    }
                    break; 
                case 5:
                    System.out.println("Список читателей5: ");
                    for(int i=0;i<listPerson.size();i++){
                        System.out.println(listPerson.get(i));
                    }
                    break;
                
                default:
                    System.out.println("Такое действие неподдерживается");
                    continue;
            }
            System.out.println("Для продолжения программы");
            System.out.println("введите \"r\"");
            System.out.println("Для окончания \"q\"");
            repeat = scanner.nextLine();
        }while("r".equals(repeat));
        System.out.println("Программа закрывается");
    }
    
}
    