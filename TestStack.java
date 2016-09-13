//This class defines an integer stack that can hold 10 values

class Stack{
  int stck[] = new int[10];
  int tos;// Index of top-of-stack

  //Constructor to initialize the top-of-stack
  Stack(){
    tos = -1; // Empty stack
  }
  
   
  //Push an item onto the stack
  void push(int item){
    if(tos == 9) 
       System.out.println("The stack is full.");
    else 
       stck[++tos] = item;
 }

 // Pop an item from the stack
  int pop(){
    if(tos < 0) { 
       System.out.println("Stack underflow.");
       return 0;
     }
     else 
       return stck[tos--];
   }
}

 // Test stack class
 class TestStack {
   public static void main(String[] args) {
    Stack mystack1 = new Stack();
    Stack mystack2 = new Stack();
   
  // Push some numbers onto the stack
   for(int i = 0; i < 10; i++) mystack1.push(i);
   for(int i = 10; i < 20; i++) mystack2.push(i);
   
   //Pop those numbers off the stack
   System.out.println("Stack in mystack1:");
   for(int i = 0; i < 10; i++)
      System.out.println(mystack1.pop());
   for(int i = 0; i < 10; i++)
      System.out.println(mystack2.pop());
  }
}


