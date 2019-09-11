/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class ReturnBookProvider {
private Scanner scanner = new Scanner(System.in);
    public  List<History> returnBook(List<History> listHistories) {
        System.out.println("Список выданных книг:");
        for(int i=0;i<listHistories.size();i++){
            if((listHistories.get(i).getTakeBook()!=null)
                    && (listHistories.get(i).getReturnBook()==null)){
                System.out.printf("%d. %s %s читает %s%n",
                        i+1,
                        listHistories.get(i).getReader().getName(),
                        listHistories.get(i).getReader().getSurname(),
                        listHistories.get(i).getBook().getName()
                );
            }
        }
        System.out.println("Выберите номер возвращаемой книги:");
        String numberHistory = scanner.nextLine();
        History history = listHistories.get(new Integer(numberHistory)-1);
        Calendar c = new GregorianCalendar();
        history.setReturnBook(c.getTime());
        listHistories.remove(new Integer(numberHistory)-1);
        listHistories.add(history);
        return listHistories;
    }
    
}
