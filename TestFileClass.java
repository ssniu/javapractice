public class TestFileClass {
  public static void main(String[] args){
    java.io.File file = new java.io.File("TestCircleWithCustomException.java");
    System.out.println("Does it exist?" + file.exists());
    System.out.println("The file has " + file.length() + "bytes" );
    }
}
