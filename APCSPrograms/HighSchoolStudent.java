/* Assignment 3: School Classes
 * HighSchoolStudent Class
 * February 28, 2015 (created)
 * Gabrielle Kaili-May Liu
 */

public class HighSchoolStudent extends Student
{
  private double GPA;
  
  public HighSchoolStudent(String fName, String lName, int gLevel, double gpa)
  /* The first and last names and the level should be set by calling the constructor of the 
   * parent class. The GPA should be between 0 and 5 inclusive, otherwise set to 0.
   */
  {
    super(fName, lName, gLevel);
    if (gpa>=0 && gpa<= 5){
      GPA = gpa; 
    }
    else{
      GPA = 0;
    }
  }
  public double getGPA()
  {
    return GPA;
  }
  public String toString()
  /* Returns a four line String with HighSchoolStudent info formatted as follows:
   * Lee, Sarah
   *    Grade Level: 9
   *    ID #: 2
   *    GPA: 3.7 
   * Note: there are three spaces before "Grade Level: ...", "ID #: ..." and "GPA: ...".
   */
  {
    String HSSInfoString = "";
    String studentinfo = super.toString();
    HSSInfoString += studentinfo;
    HSSInfoString += "\n   GPA: ";
    HSSInfoString += GPA;
    return HSSInfoString;
  }
}
