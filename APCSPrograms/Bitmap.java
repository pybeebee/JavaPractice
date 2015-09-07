/* Assignment 7- Bitmap
 * Bitmap Class
 * April 11, 2015 (created, completed)
 * Gabrielle Kaili-May Liu
 */
public class Bitmap
{
// initiate variables
  String image[][] = new String[10][10];
  
// initiate methods in Bitmap
  public Bitmap(int a[])
  /* initializes all images to "-"
   * sets coordinates from parameter array to "*"
   */
  {
    boolean b = true;
    for (int r = 0; r < image.length; r++)
    {
      for (int c = 0; c < image[0].length; c++)
      {
        image[r][c] = "-";
      }
    }
    if (a.length%2 != 0)
    {
      b = false;     
    }    
    else{
      for (int i = 0; i<a.length; i++)
      {
        if (a[i]<0 || a[i]>9)
        {
          b = false;
        }
      }
    }
    if (b==true)
    {
      for (int i=0; i<a.length; i+=2)
      {
        image[a[i]][a[i+1]] = "*";
      }
    }
  }
  public void flipHorizontal()
  /* "*" symobls flip horizontally left to right */
  {
    String copy[][] = new String[10][10];
    for (int r = 0; r < 10; r++){
      for (int c = 0; c < 10; c++){
        copy[r][c] = image[r][c];}}
    for (int r = 0; r < 10; r++)
    {
      for (int c = 0; c < 10; c++)
      {
        image[r][c] = copy[r][9-c];
      }
    }
  }
  public void flipVertical()
  /* "*" symbols flip vertically top to bottom */
  {
    String copy[][] = new String[10][10];
    for (int r = 0; r < 10; r++){
      for (int c = 0; c < 10; c++){
        copy[r][c] = image[r][c];}}
    for (int c = 0; c < image[0].length; c++)
    {
      for (int r = 0; r < image.length; r++)
      {
        image[r][c] = copy[9-r][c];
      }
    }
  }
  public void reverse()
  /* flips "-" symbols and "*" symbols */
  {
    for (int r = 0; r < image.length; r++)
    {
      for (int c = 0; c < image[0].length; c++)
      {
        if (image[r][c] == "-")
          image[r][c] = "*";
        else if (image[r][c] == "*")
          image[r][c] = "-";
      }
    }
  }
  public String toString()
  /* returns multi-line String representation of image */
  {
    String is = "";
    for (int r = 0; r < image.length; r++)
    {
      for (int c = 0; c < image[0].length; c++)
      {
        is += image[r][c];
      }
      is += "\n";
    }
    return is;
  }
}