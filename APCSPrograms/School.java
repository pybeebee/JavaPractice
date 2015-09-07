/* Assignment 3: School Classes
 * School Class
 * February 28, 2015 (created)
 * Gabrielle Kaili-May Liu
 */

import java.util.ArrayList;
public class School
{
  ArrayList<Student> students = new ArrayList<Student>();
  ArrayList<Teacher> teachers = new ArrayList<Teacher>();
  
  public School(ArrayList<Student> studentlist, ArrayList<Teacher> teacherlist)
  /* A constructor that specifies teachers and students at a school.*/
  {
    for (Student s: studentlist)
    {
      students.add(s); 
    }
    for (Teacher t: teacherlist)
    {
      teachers.add(t);
    }
  }
  public String getGradeLevel(int level)
  /* Returns a String listing all the school's students that are at the specified grade level.
   * Returns an empty String if the school has no students at the specified level.
   */
  {
    String lStudents = "";
    for (Student s: students)
    {
      int grade = s.getLevel();
      if (grade == level){
        String info = s.toString();
        lStudents += "\n";
        lStudents += info;
      }
      else{}
    }
    return lStudents;
  }
  public String toString()
  {
    String ss = "";
    ss += "Faculty:";
    for (Teacher t: teachers)
    {
      String info = t.toString();
      ss += "\n";
      ss += info;
    }
    ss += "\n \n";
    ss += "Student Body:";
    for (Student s: students)
    {
      String info = s.toString();
      ss += "\n";
      ss += info;
    }  
    return ss;
  } 
}