 // Compute distance light travels using long variable
class ComputeLightSpeed {
    public static void main(String[] args){
       int lightspeed;
       long days;
       long seconds;
       long distance;
   
       // Speed of light in miles per second
      lightspeed = 186000;
      
      days = 1000;
       
      seconds = days * 24 * 60 * 60; // Convert to seconds
   
      distance = lightspeed * seconds; // Compute the distance
     
      System.out.print("In " + days);
      System.out.println(" days light will travel about ");
      System.out.println(distance + " miles");
     }
}

