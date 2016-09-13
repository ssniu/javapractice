import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
  @Override // Override the start method in the Application class
  
   public void start(Stage primaryStage){
      // Create a scene and place a button in the scene
     Button btOK = new Button("OK");
    // create a button and set the size
     Scene scene = new Scene(btOK, 200, 250);
     // sett the stage title
     primaryStage.setTitle("MyJavaFx");
    //place the scene in the stage
     primaryStage.setScene(scene);
    // Display the stage
     primaryStage.show();
    
    // Create a new stage
    Stage stage = new Stage();
    // set the stage title
    stage.setTitle("Second stage"); 
    // Set a scene with a button in the stage
   stage.setScene(new Scene(new Button("new stage"), 100, 100));
   // Display the stage
   stage.show();
  
   }
  
   public static void main(String[] args) {
    Application.launch(args);
   }
}

