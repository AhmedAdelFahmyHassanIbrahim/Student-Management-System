package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public TextField tName;
    public TextField tId;
    public TextField tMarks;
    public TextField tContacts;


    public TextArea TextArea;

    public void buttonclicked() {
        TextArea.appendText(tName.getText() + "\t"
                + tId.getText()
                +"\t"
                + tMarks.getText()
                + "\t"
                + tContacts.getText() + "\n");

    }

}
