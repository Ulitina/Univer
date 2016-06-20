package datecore;

import subjects.AbstractSubject;
import sun.security.x509.AVA;

import java.io.File;

/**
 * Created by user on 19.05.2016.
 */
public class FIO implements Comparable
{
 private     String firstName;
 private final   String lastName;
 private final String middleName;

  public FIO(String firstName, String lastName, String middleName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getLastName()
  {
    return lastName;
  }
  // if the wedding :DDDD
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  @Override
  public String toString()
  {
    return "FIO{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", middleName='" + middleName + '\'' +
        '}';
  }

  @Override
  public int compareTo(Object o)
  {
    FIO fio = (FIO) o;
    int res = this.firstName.compareTo(fio.getFirstName());
    res += this.lastName.compareTo(fio.getLastName());
    res+= this.middleName.compareTo(fio.middleName);
    return res;
  }
}
