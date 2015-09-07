/* Assignment 3: School Classes
 * School Class
 * February 28, 2015 (finalized)
 * Gabrielle Kaili-May Liu
 */

public class Student extends Person
{

  private int studentId;
  private int level;
  private static int IDnum = 1;
  
  public Student(String fName, String lName, int gLevel)
  /* Constructor that accepts the first and last names and the student level.
   * Student level should be assigned 0 if gLevel is not between 0 and 12, inclusive.
   * The first and last names should be set by calling the constructor of the parent class.
   * The Student constructor also sets the studentId to the next available positive integer.
   * The first Student created should have a studentId of 1, the second will have an ID of 
   * 2, third of 3, etc.
   */
  {
    super(fName, lName);
    if (gLevel>=0 && gLevel<=12){
      level = gLevel;
    }
    else{
      gLevel = 0;
    }
    studentId = IDnum;
    IDnum++;
  }
  public int getLevel()
  {
    return level;
  }
  public String toString()
  /* Returns a three line String with Student info formatted as follows:
   * Smith, Mary
   *    Grade Level: 2
   *    ID #: 1
   * Note: there are three spaces before "Grade Level: ..." and "ID #: ..."
   */
  {
    String StudentInfoString = "";
    StudentInfoString += super.toString();
    StudentInfoString += "\n   Grade Level: ";
    StudentInfoString += level;
    StudentInfoString += "\n   ID #: ";
    StudentInfoString += studentId;
    return StudentInfoString;
  } 
}