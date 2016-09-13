  /*Generate -1 or - randomly */
import java.util.Random;
public class RamdonTwo{
  public static void main(String[] args){
     Random grandom = new Random();
     
     boolean randomBool = grandom.nextBoolean();
     
     System.out.println("The result is: " + returnRandom(randomBool));}
     
     public static int returnRandom(boolean boolrandom)
     {
     if(boolrandom) return 1;

     else return -1;
    }
}
 
