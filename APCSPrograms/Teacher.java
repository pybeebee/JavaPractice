/* Assignment 3: School Classes
 * Teacher Class
 * February 28, 2015 (created)
 * Gabrielle Kaili-May Liu
 */

public class Teacher extends Person
{
  private String firstName;
  private String lastName;
  private String subject;
 
  public Teacher(String fName, String lName, String sbjct)
    /* The first and last names hsould be set by calling the constructor of the parent class.*/
  {
    super(fName, lName);
    subject = sbjct;
  }
  public String toString()
    /* Returns a two line String with Teacher info formatted as follows:
     * Dovi, Rebecca
     *    Subject: Computer Science
     * Note: there are three spaces before "Subject: ...".
     */
  {
    String TeacherInfoString = "";
    String name = super.toString();
    TeacherInfoString += name;
    TeacherInfoString += "\n   Subject: ";
    TeacherInfoString += subject;
    return TeacherInfoString;
  }
}