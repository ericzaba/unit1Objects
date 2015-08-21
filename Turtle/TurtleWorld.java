import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.CYAN);
        turtle.penDown();
        turtle.setPenWidth(5);
        turtle.forward(20);
        double x=1;
        turtle.move(x, Math.pow(2));
        
        
    }
}
