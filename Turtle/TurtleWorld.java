import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        
        turtle.setPenColor(Color.CYAN);
        
        turtle.penDown();
        
        turtle.setPenWidth(1);
        
        
        
        for (int x = 0; x < 200; x++) {
            System.out.println( x + Math.pow(x, 1.3)-100 );
            if ( x<200 ){
                turtle.moveTo( x, (int)Math.pow(x, 1.3 )-100  );
            }
            if ( x>30 ){
                turtle.moveTo( x, (int)Math.pow( x, -1 ));
            }
         }
    }
    
                
}