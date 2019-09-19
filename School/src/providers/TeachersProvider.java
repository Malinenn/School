/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package providers;

import Entity.Teachers;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class TeachersProvider {
private Scanner scanner = new Scanner(System.in);
    public  List<Teachers> Dolzhnost (List<Teachers> listTeachers) {
        System.out.println("Список выданных книг:");
        for(int i=0;i<listTeachers.size();i++){
            if((listTeachers.get(i).getStazh()!=null)
                    && (listTeachers.get(i).getStazh()==null)){
                System.out.printf("%d. %s %s читает %s%n",
                        i+1,
                        listTeachers.get(i).getDolzhnost(),
                        listTeachers.get(i).getName(),
                        listTeachers.get(i).getStazh()
                );
            }
        }
        System.out.println("Выберите номер возвращаемой книги:");
        String numberTeach = scanner.nextLine();
        Teachers teachers = listTeachers.get(new Integer(numberTeach)-1);
        Calendar c = new GregorianCalendar();
        teachers.setStazh(c.getTime());
        listTeachers.remove(new Integer(numberTeach)-1);
        listTeachers.add(teachers);
        return listTeachers;
    }
    
}
