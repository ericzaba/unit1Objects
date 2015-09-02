import java.util.Random;
public class DieSimulator{
    
    public static void main( String[] args ){
        
            //option a
    Random random1 = new Random();
    int dieValue = random1.nextInt( 6 ); // returns 0,1,2,3,4,5
    dieValue+=1;
    System.out.println(dieValue);
    
    double dieValue2 = Math.random(); // returns 0 or 1;
    System.out.println("Option 2"); 
    dieValue2 *=6;// returns 0 through 6
    
    dieValue2 += 1;//reutrns 1 , 7; 
    System.out.println( (int) dieValue2);
    
    }
}