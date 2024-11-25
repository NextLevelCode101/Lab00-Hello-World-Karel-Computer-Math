/*Farhan Khan Block 1*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;


public class HelloRobot
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/first.map");
      Display.setSize(8,8);
      Display.setSpeed(8);
      WorldFrame.getCurrent().setLocation(0,0);
      
      Robot karel = new Robot();
      
      karel.move();
      karel.pickBeeper();
      karel.move();
      karel.turnLeft();
      karel.move();
      karel.putBeeper();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
  
      }
}