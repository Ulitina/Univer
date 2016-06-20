package subjects;

import datecore.Contacts;
import datecore.FIO;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Comparator;

/**
 * Created by user on 19.05.2016.
 */
public abstract class AbstractSubject

{

  private final FIO fioDate;
  private final LocalDate DateBirth;
private  Contacts contacts;

  public AbstractSubject(FIO fioDate, LocalDate dateBirth, Contacts contacts)
  {
    this.fioDate = fioDate;
    DateBirth = dateBirth;
    this.contacts = contacts;
  }

  public FIO getFioDate()
  {
    return fioDate;
  }
  public Contacts getContacts()
  {
    return contacts;
  }
  public LocalDate getDateBirth()
  {
    return DateBirth;
  }

  @Override
  public String toString()
  {
    return "fioDate=" + fioDate +"\n"+
        "DateBirth='" + DateBirth + '\'' +"\n"+
        "contacts=" + contacts +
        '}';
  }

  public static Comparator BY_FIRST_NAME = new Comparator()
  {
    @Override
    public int compare(Object o1, Object o2)
    {
      AbstractSubject ASO1 = (AbstractSubject)o1;
      AbstractSubject ASO2 = (AbstractSubject)o2;
      return  ASO1.getFioDate().getFirstName().compareTo(ASO2.fioDate.getFirstName());
    }
  };
  public static Comparator BY_LAST_NAME = new Comparator()
  {
    @Override
    public int compare(Object o1, Object o2)
    {
      AbstractSubject ASO1 = (AbstractSubject)o1;
      AbstractSubject ASO2 = (AbstractSubject)o2;
      return  ASO1.getFioDate().getLastName().compareTo(ASO2.fioDate.getLastName());
    }
  };
  public static Comparator BY_FIO = new Comparator()
  {
    @Override
    public int compare(Object o1, Object o2)
    {
      AbstractSubject ASO1 = (AbstractSubject)o1;
      AbstractSubject ASO2 = (AbstractSubject)o2;
      return  ASO1.getFioDate().compareTo(ASO2.getFioDate());
    }
  };


}
