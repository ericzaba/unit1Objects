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
        
        Turtle turtler = new Turtle(turtleWorld);
        turtler.setPenColor(Color.RED);
        turtler.penDown();
        turtler.setPenWidth(1);
        
        Turtle turtlem = new Turtle(turtleWorld);
        turtlem.setPenColor(Color.MAGENTA);
        turtlem.penDown();
        turtlem.setPenWidth(1);
        
        for ( int x=10; x<200; x++ ){
            
            turtle.forward(x);
           
            turtle.turn(120);
            
        }
        for ( int y=10; y<200; y++ ){
            
            turtler.forward(y);
            turtler.turn(-90);
       }
       for ( int z=10; z<200; z++ ){
           turtlem.forward(z);
           turtlem.turn(-120);
           
          
        
        }
       
       
    }     
}