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
        while (1<2){
            int x = 1;
            int y = 1;
            turtle.moveTo(x, y);
            turtle.moveTo(x-1, y-1);
            
        }
    }
}