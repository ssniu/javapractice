/* This class declares an object of type Box.*/
class BoxDemo{
   public static void main(String[] args){
     Box mybox = new Box();
     double vol;

     //assign values to mybox's instance variables
     mybox.width = 10;
     mybox.height = 20;
     mybox.depth = 15;
    
     vol = mybox.width * mybox.height * mybox.depth;
     
     System.out.println("Volumn is " + vol);
  }
}

