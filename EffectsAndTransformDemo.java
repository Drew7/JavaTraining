import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;

public class EffectsAndTransformDemo extends Application {
    
    
    double angle = 0.0;
    double angleTranslate = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;
    double glowFactor = 0.1;
    
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);
    Glow glow = new Glow(0.1);
    Translate translate = new Translate();
    
    Button btnRotate = new Button("Rotate");
    Button btnBlur = new Button("Blur off");
    Button btnScale = new Button("Scale");
    Button btnGlow = new Button("Glow");
    Button btnTranslate = new Button("Translate");
    
    Label reflect = new Label("Reflection Adds Visual Sparcle");
    
    public static void main(String args[]) {
        launch(args);
    }
    
    public void start(Stage myStage) {
        myStage.setTitle("Effects and Transforms Demo");
        FlowPane rootNode = new FlowPane(20, 20);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 300, 120);
        
        myStage.setScene(myScene);
        
        btnRotate.getTransforms().add(rotate);
        btnTranslate.getTransforms().add(translate);
        btnScale.getTransforms().add(scale);
        btnGlow.setEffect(glow);
        
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);
        
        btnRotate.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                angle += 15.0;
                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth()/2);
                rotate.setPivotY(btnRotate.getHeight()/2);
            }            
        });
        
        btnTranslate.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                angleTranslate += 15.0;
                if(angleTranslate > 150) angleTranslate = 0.4;
                translate.setX(angleTranslate);
                translate.setY(angleTranslate);
                translate.setZ(angleTranslate);
            }            
        });
        
        btnScale.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                scaleFactor += 0.1;
                if(scaleFactor > 2.0) scaleFactor = 0.4;
                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
                
            }            
        });
        
        btnGlow.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                glowFactor += 0.1;
                if(glowFactor > 1.0) glowFactor = 0.1;
                glow.setLevel(glowFactor);
            }            
        });
        
        btnBlur.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                
                if(blurVal == 10.0) {
                    blurVal = 1.0;
                    btnBlur.setEffect(null);
                    btnBlur.setText("Blur off");
                } else {
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnBlur.setText("Blur on");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }            
        });
        
        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, btnGlow, btnTranslate, reflect);
        
        myStage.show();
    }
    
}