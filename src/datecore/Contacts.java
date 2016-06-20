package datecore;

/**
 * Created by user on 19.05.2016.
 */
public class Contacts
{
  private String address;
  private String phoneNumber;

  public Contacts(String address, String phoneNumber)
  {
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString()
  {
    return "Contacts{" +
        "address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
