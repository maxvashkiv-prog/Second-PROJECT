package example;

import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char nowSymb = 'x';

    private char gameField [][] = new char[3][3];

    private boolean IsGame = true;
    @FXML
    void btnClick(ActionEvent event) {
        if(!IsGame) return;
        Button btn = (Button)event.getSource();

        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        gameField [rowIndex] [columnIndex] = nowSymb;

        if (gameField[0][0] == gameField[0][1] && gameField[0][0] == gameField[0][2] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            IsGame = false;
        }
        else if (gameField[1][0] == gameField[1][1] && gameField[1][0] == gameField[1][2] && (gameField[1][0] == 'x' || gameField[1][0] == 'o')) {
            IsGame = false;
        }
        else if (gameField[2][0] == gameField[2][1] && gameField[2][0] == gameField[2][2] && (gameField[2][0] == 'x' || gameField[2][0] == 'o')) {
            IsGame = false;
        }
        else if (gameField[0][0] == gameField[1][0] && gameField[0][0] == gameField[2][0] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            IsGame = false;
        }
        else if (gameField[0][1] == gameField[1][1] && gameField[0][1] == gameField[2][1] && (gameField[0][1] == 'x' || gameField[0][1] == 'o')) {
            IsGame = false;
        }
        else if (gameField[0][2] == gameField[1][2] && gameField[0][2] == gameField[2][2] && (gameField[0][2] == 'x' || gameField[0][2] == 'o')) {
            IsGame = false;
        }
        else if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')) {
            IsGame = false;
        }
        else if (gameField[0][2] == gameField[1][1] && gameField[0][2] == gameField[2][0] && (gameField[0][2] == 'x' || gameField[0][2] == 'o')) {
            IsGame = false;
        }


        btn.setText(String.valueOf(nowSymb));
        nowSymb = nowSymb == 'x' ? 'o' : 'x';
    }

    @FXML
    void initialize() {

    }

}
