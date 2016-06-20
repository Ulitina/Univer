import datecore.Course;
import datecore.FIO;
import datecore.Faculty;
import datecore.Group;
import subjects.Student;

import java.io.File;
import java.util.*;

/**
 * Created by user on 19.05.2016.
 */
public class University
{

  private HashMap<FIO,Student> students;

  public University()
  {
    this.students = new HashMap();
  }


  public void add(Student student)
  {
    this.students.put(student.getFioDate(),student);
  }
  public void delete(FIO fio)
  {
    this.students.remove(fio);

  }
  public  void delete(Student student)
  {
    this.students.remove(student.getFioDate());
  }

  public Student findByID(long id)
  {
    for (Map.Entry<FIO,Student> item: students.entrySet())
    {
      if (item.getValue().getId() == id)
        return item.getValue();
    }
    return null;
  }
  public Student findByFIO(FIO fio)
  {
    return this.students.get(fio);
  }

  public void displayAllStudents ()
  {
    for (Map.Entry<FIO,Student> item: students.entrySet())
    {
      System.out.println(item.getValue());
      System.out.println("============================================");
    }
  }
  public void displayFaculty(Faculty faculty){
    for (Map.Entry<FIO,Student> item: students.entrySet()) {
      if (item.getValue().getFaculty().equals(faculty)) {
        System.out.println(item.getValue());
        System.out.println("============================================");
      }
    }
  }
  public void displayFacultyAndCourse (Faculty faculty, Course course){
    for (Map.Entry<FIO,Student> item: students.entrySet()) {
      if (item.getValue().getFaculty().equals(faculty)&&item.getValue().getCourse().equals(course)) {
        System.out.println(item.getValue());
        System.out.println("============================================");
      }
    }
  }
  public void displayGroup(Group group){
    for (Map.Entry<FIO,Student> item: students.entrySet()) {
      if (item.getValue().getFaculty().equals(group)) {
        System.out.println(item.getValue());
        System.out.println("============================================");
      }
    }
  }
  public void allBirthdayAfter(int year) {
    for (Map.Entry<FIO, Student> item : students.entrySet()) {
      if (item.getValue().getDateBirth().getYear() > year)
        System.out.println(item.getValue());
      System.out.println("============================================");
    }
  }
  public void sort(Comparator param) {
      List<Student> list = new ArrayList(students.values());
      Collections.sort(list, param);
  }
//    public void sort() {
//        List<Student> list = new ArrayList(students.values());
//        Collections.sort(list);
//    }
}


