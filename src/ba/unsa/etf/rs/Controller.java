package ba.unsa.etf.rs;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Locale;

public class Controller {
    public Button Button;
    public TextField Input;
    public TextArea Text;


    public void ispisi() {
        String userInput = Input.getText();

        String[] rijec = userInput.split(" ");
        String najduzaRijec = "";
        for (int i = 0; i < rijec.length; i++) {
            if (rijec[i].length() >= najduzaRijec.length()) {
                najduzaRijec = rijec[i];
            }
        }
        najduzaRijec = najduzaRijec.toUpperCase();

        for (int i = 0; i < rijec.length; i++) {

            if(rijec[i].length() == najduzaRijec.length() ){
                Text.appendText(najduzaRijec + " ");
            } else Text.appendText(rijec[i] + " ");

        }

    }
}
