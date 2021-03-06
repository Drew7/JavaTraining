import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    
    Label response;
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public void start(Stage myStage) {
        
        myStage.setTitle("ListView Demo");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 200, 120);
        
        myStage.setScene(myScene);
        
        response = new Label("Select Computer Type");
        
        ObservableList<String> computerTypes = FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", "Desktop");
        
        ListView<String> lvComputers = new ListView<String>(computerTypes);
        
        lvComputers.setPrefSize(100, 70);
        
        MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();
        
        lvSelModel.selectedItemProperty().addListener((ch, ov, nw) -> response.setText("Computer selected is " + nw + ". Old value is " + ov));
        
        rootNode.getChildren().addAll(lvComputers, response);
        
        myStage.show();
    }
}