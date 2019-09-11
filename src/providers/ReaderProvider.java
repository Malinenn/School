/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import entity.Book;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class ReaderProvider {
    private Scanner scanner = new Scanner(System.in);
    public Reader createReader() {
        Reader reader = new Reader();
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
        reader.setId(id);
        System.out.print("Имя читателя: ");
        reader.setName(scanner.nextLine());
        System.out.print("Фамилия читателя: ");
        reader.setSurname(scanner.nextLine());
        System.out.print("Телефон читателя: ");
        reader.setPhone(scanner.nextLine());
        
        return reader;
    }
    
}
