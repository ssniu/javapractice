public class CircleWithException {
   private double radius;
   
   private static int numberOfObjects = 0;
  
   //construct a circle with radius 1 
   public CircleWithException() {
    this(1.0);
  }
  
  // Construct a circle with a specified radius
  public CircleWithException(double newRadius) {
    setRadius(newRadius);
    numberOfObjects++;
   }
  //Getter
   public double getRadius(){
    return radius;
   }
  // Mutator
  public void setRadius(double newRadius)
     throws IllegalArgumentException {
       if(newRadius >= 0)
         radius = newRadius;
       else
         throw new IllegalArgumentException(" Radius cannot be negative");
      }
  // Return numberOfObjects
  public static int getNumberOfObjects() {
   return numberOfObjects;
  }
  
  // Return the area of this circle
  public double findArea() {
    return radius * radius * 3.14159;
   }
  public static void main(String[] args){
    try {
    CircleWithException c1 = new CircleWithException(5);
    CircleWithException c2 = new CircleWithException(-5);
    }
    catch (IllegalArgumentException ex) {
     System.out.println(ex);
    }
    System.out.println("Number of objects created: " + 
      CircleWithException.getNumberOfObjects());
    }
  
 }

  
  
