import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(45);
        turtle.turn(-45);
        turtle.forward(50);
        turtle.turn(-45);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(45);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(45);
        turtle.forward(50);
        turtle.turn(150);
        turtle.forward(20);
    }
}
