
package vctrainer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.GetFXMLFiles;

 


public class VCTrainer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        GetFXMLFiles fxml = new GetFXMLFiles();
        Parent root = fxml.getFXML();
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Vokabeltrainer 2018");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
