import datecore.*;
import subjects.Student;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * Created by user on 19.05.2016.
 */
public class Main
{
  public static void main(String[] args)
  {
    Student student1 = new Student
        (
            new FIO("Одо","де Шатильон","де Лажери"),
            LocalDate.of( 1096,1,1),
            new Contacts("Rome","+49 024 23 17"),
            Faculty.PhysMath, Group.PrmG, Course.One
        );


    Student student2 = new Student
        (
            new FIO("Одо","де Шатильон","де Лажери"),
            LocalDate.of( 1096,1,1),
            new Contacts("Rome","+49 024 23 17"),
            Faculty.PhysMath, Group.PrmG, Course.One
        );

    Student student3 = new Student
        (
            new FIO("Вильгельм","де Ревиль","де Кери"),
            LocalDate.of( 1101,2,2),
            new Contacts("Rome","+49 023 52 87"),
            Faculty.NaturalSciences, Group.bioG, Course.One
        );


    Student student4 = new Student
        (
            new FIO("Вася","Пупкин","Никифорович"),
            LocalDate.of( 1195,3,3),
            new Contacts("Rome","+49 023 52 87"),
            Faculty.NaturalSciences, Group.bioG, Course.Three
        );
    Student student5 = new Student
        (
            new FIO("Кот","Пушистый","Чеширский"),
            LocalDate.of( 1917,4,4),
            new Contacts("Rome","+49 111 22 33"),
            Faculty.NaturalSciences, Group.bioG, Course.Three
        );
    Student student6 = new Student
        (
            new FIO("Пес","Серый","Волкович"),
            LocalDate.of( 1927,5,5),
            new Contacts("Rome","+49 111 22 33"),
            Faculty.PhysMath, Group.PrmG, Course.Five
        );
    University university = new University();

    university.add(student1);
    university.add(student2);
    university.add(student3);
    university.add(student4);
    university.add(student5);
    university.add(student6);

    System.out.println("= = =  Diplay all students after initialisation  = = =\n");
    university.displayAllStudents();

    System.out.println("");

    System.out.println("= = =  Diplay all students after deleted student2  = = =\n");
    university.delete(student2.getFioDate());
    university.displayAllStudents();

    System.out.println("");

    System.out.println("= = =  Diplay stuent " + student1.getFioDate()+"  = = = \n\n" +university.findByFIO(student1.getFioDate()));
  }
}
