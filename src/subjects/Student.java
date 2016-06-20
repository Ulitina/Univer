package subjects;
import datecore.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Comparator;
import java.util.UUID;

/**
 * Created by user on 19.05.2016.
 */
public class Student extends AbstractSubject
{
  private Faculty faculty;
  private Course course;
  private Group group;
 private long id;
  public Student(FIO fioDate, LocalDate dateBirth, Contacts contacts, Faculty faculty, Group group, Course course)
  {
    super(fioDate, dateBirth, contacts);
    this.faculty = faculty;
    this.group = group;
    this.course = course;
    UUID uuid = UUID.randomUUID();//.fromString(
      //  this.getFioDate().getFirstName()//+
//        this.getFioDate().getLastName()+
//        this.getFioDate().getMiddleName()+
//        dateBirth
 //   );
    this.id = uuid.getLeastSignificantBits();
  }

  public long getId()
  {
    return id;
  }

  public Faculty getFaculty()
  {
    return faculty;
  }

  public Group getGroup()
  {
    return group;
  }

  public Course getCourse()
  {
    return course;
  }

  @Override
  public String toString()
  {
    return "Student{" + super.toString() + "\n" +
        "faculty=" + faculty +
        ", course=" + course +
        ", group=" + group +
        '}';
  }

  public static Comparator BY_GROUP = new Comparator()
  {
    @Override
    public int compare(Object o1, Object o2)
    {
      Student student1 = (Student) o1;
      Student student2 = (Student) o2;
      return student1.getGroup().compareTo(student2.getGroup());
    }
  };
  public static Comparator BY_FACILTY = new Comparator()
  {
    @Override
    public int compare(Object o1, Object o2)
    {
      Student  student1 = (Student)o1;
      Student  student2 = (Student)o2;
      return  student1.getFaculty().compareTo(student2.getFaculty());
    }
  };

  public static Comparator BY_COURSE= new Comparator()
  {
    @Override
    public int compare(Object o1, Object o2)
    {
      Student  student1 = (Student)o1;
      Student  student2 = (Student)o2;
      return  student1.getCourse().compareTo(student2.getCourse());
    }
  };
}
