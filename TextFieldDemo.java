import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class TextFieldDemo extends Application {
    
    TextField tf;
    TextArea ta;
    PasswordField pf;
    
    Label response;
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public void start(Stage myStage) {
        
        myStage.setTitle("Demonstrate a TextField");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 230, 140);
        
        myStage.setScene(myScene);
        
        response = new Label("Enter Name: ");
        
        Button btnGetText = new Button("Get Name");
        
        tf = new TextField();
        ta = new TextArea();
        pf = new PasswordField();
                
        tf.setPromptText("Enter a name.");
        
        tf.setPrefColumnCount(15);
        ta.setPrefColumnCount(15);
        
        tf.setOnAction((ae) -> response.setText("Enter pressed. Name is: " + tf.getText()));
        
        pf.setOnAction((ae) -> response.setText("Enter pressed. Password is: " + pf.getText()));
        
        btnGetText.setOnAction((ae) -> response.setText("Button pressed. Name is: " + tf.getText()));
        
        Separator separator = new Separator();
        separator.setPrefWidth(180);
        rootNode.getChildren().addAll(tf, btnGetText, separator, ta, pf, response);
        
        myStage.show();
    }
    
}