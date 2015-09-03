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
        
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setPenColor(Color.RED);
        
        turtle1.penDown();
        turtle1.setPenWidth(1);
        
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.MAGENTA);
        turtle2.penDown();
        turtle2.setPenWidth(1);
        
        for (int x=10; x<200; x++){
            
            turtle.forward(x);
           
            turtle.turn(45);
            
        }
        for (int y=10; y<200; y++){
            
            turtle1.forward(y);
            turtle1.turn(-90);
       }
       for (int z=10; z<200; z++){
           turtle2.forward(z);
           turtle2.turn(45);
           
          
        
        }
        
       
    }     
}