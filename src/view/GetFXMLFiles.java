package view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class GetFXMLFiles {
    
    public Parent getFXML() throws IOException{
        return FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
    }
}
