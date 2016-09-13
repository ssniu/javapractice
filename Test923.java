// pass by reference for object
public class Test923 {
   public static void main(String[] args){
     Count myCount = new Count();
     int times = 0;
    
     for(int i = 0; i < 100; i++)
     increment(myCount, times);
    
     System.out.println("count is " + mycount.count);
     System.out.println("times is " + times);
   }
   
  public static void increment(Count c, int times){
    c.count++;
   times++;
  }
}

