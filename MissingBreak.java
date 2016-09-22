//Switch, the break statements
class MissingBreak {
   public static void main(String[] args){
     for(int i = 0; i < 12; i++)
        switch(i) {
          case 0:
              System.out.println(" first line");
          case 1:
              System.out.println(" second line");
              break;
          case 2:
          case 3:
          case 4:
            System.out.println("i is less than 5");
            break;
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
             System.out.println("i is less than 10");
             break;
          default:
             System.out.println("i is 10 or more");
         }
    }
}

