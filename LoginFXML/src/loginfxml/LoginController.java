package loginfxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 *
 * @author Xandron
 */
public class LoginController {

    @FXML
    private Text actionText;
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        actionText.setText("You clicked me!");
    }
}
