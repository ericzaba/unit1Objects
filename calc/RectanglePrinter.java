import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      /* Your code goes here */
      System.out.println(r1);
      /* and here */
      
      Rectangle r2=r1;
      String rectanglestring = r2.toString();
      System.out.println(r2); 
      System.out.println(rectanglestring);
    }
  
}