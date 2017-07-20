/**
 * The class contains information about person.
 */
public class Person {
  private int year;
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName, int year) {
    this.year = year;
    this.firstName = firstName;
    this.lastName = lastName;
    verification(firstName, lastName, year); 
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }

  public int getYear() {
    return year;
  }
  
  /**
   * The method verify the entered data.
   * @param firstName - entered person firstname.
   * @param lastName - entered person lastname.
   * @param year - entered person year of birth.
   */
  
  public void verification(String firstName, String lastName, int year) {
    if (year < 0) {
      throw new IllegalArgumentException("Negative year. Please enter year again: ");
    } else if (firstName.length() == 0 && lastName.length() == 0) {
      throw new IllegalArgumentException("Did not enter the firstname and lastname of the person. Please enter firstname and lastname again: ");
    }
  }
}
