/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import Entity.Groups;
import Entity.Person;
import Entity.Teachers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
       savable = new StorageInBase();
       //savable = new StorageInFile();
        try {
            listGroup = savable.loadBookFromStorage();
        } catch (Exception e) {
            System.out.println("Нет данных");
        }
       
        try {
            listPerson = savable.loadReaderFromStorage();
        } catch (Exception e) {
            System.out.println("Нет данных");
        }
        try {
            listTeachers = savable.loadHistoriesFromStorage();
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
                    BookProvider bookProvider = new BookProvider();
                    listGroup.add(bookProvider.createBook());
                    savable.saveBooks(listGroup);
                    for(int i=0; i < listGroup.size();i++){
                       System.out.println("Список книг1: " 
                            + listGroup.get(i).getName()
                        ); 
                    }
                    break;
                case 2:
                    ReaderProvider readerProvider = new ReaderProvider();
                    listPerson.add(readerProvider.createReader());
                    savable.saveReaders(listPerson);
                    for(int i=0; i < listPerson.size();i++){
                       System.out.println(
                            "Список читателей2: " 
                            + listPerson.get(i).getName()
                        ); 
                    }
                    break;
                case 3:
                    TakeBookProvider takeBookProvider = new TakeBookProvider();
                    listTeachers.add(takeBookProvider.takeBook(listGroup,
                            listPerson
                    ));
                    savable.saveHistories(listTeachers);
                    break;
                case 4:
                    ReturnBookProvider returnBookProvider = new ReturnBookProvider();
                    listTeachers = returnBookProvider.returnBook(listTeachers);
                    savable.saveHistories(listTeachers);
                    break;
                case 5:
                    System.out.println("Список книг5: ");
                    for(int i=0;i<listGroup.size();i++){
                        System.out.println(listGroup.get(i));
                    }
                    break; 
                case 6:
                    System.out.println("Список читателей6: ");
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
    
}
