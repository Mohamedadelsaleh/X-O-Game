package helper;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Alert.AlertType;
public class AskDialog {
    public AskDialog() {
    }

    ;
    boolean check = false;

    public Boolean alert(String s) {
        ButtonType Yes = new ButtonType("Yes");
        ButtonType No = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert a = new Alert(AlertType.NONE);
        a.setTitle("Alert ASk");
        a.getDialogPane().getButtonTypes().addAll(Yes, No);
        a.setHeaderText(s);

        //a.setContentText(s);
        DialogPane dialogPane = a.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("/style/GameStyle.css").toExternalForm());
        dialogPane.getStyleClass().add("infoDialog");

        a.showAndWait();

        if (a.getResult() == Yes) {
            //  Preferences pfrefs= Preferences.userNodeForPackage(MainController.class);
            //  AccessFile.createFile();
            check = true;


            System.out.println("alertyes");


//               System.out.println("alertOk");
            //  AccessFile.writeFile(pfrefs.get("username","not found")+".");
        } else if (a.getResult() == No) {
            check = false;
            // AccessFile.isFileExit();
            System.out.println("alertNo");
        }
        return check;
    }

    /**
     * serverIssueAlert
     * to to player if there is issue in server happened
     *
     * @param message
     * @return
     */
    public void serverIssueAlert(String message) {
        ButtonType yes = new ButtonType("Yes");
        Alert a = new Alert(Alert.AlertType.NONE);
        a.setTitle("Alert Issue");
        a.getDialogPane().getButtonTypes().add(yes);
        a.setHeaderText(message);

        //a.setContentText(s);
        DialogPane dialogPane = a.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/style/GameStyle.css").toExternalForm());
        dialogPane.getStyleClass().add("infoDialog");

        a.showAndWait();
    }


    /**
     * alert
     * to to player if there is issue in server happened
     *
     * @param message
     * @return
     */
    public boolean alert(String message, String title) {

        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert a = new Alert(Alert.AlertType.NONE);
        a.setTitle(title);
        a.getDialogPane().getButtonTypes().addAll(yes, no);
        a.setHeaderText(message);
        DialogPane dialogPane = a.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/style/GameStyle.css").toExternalForm());
        dialogPane.getStyleClass().add("infoDialog");

        a.showAndWait();

        if (a.getResult() == yes) {
            return true;
        }
        return false;
    }

    public boolean askPlayAgain(String s) {

        ButtonType Yes = new ButtonType("Play Again");
        ButtonType No = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);
        Alert a = new Alert(Alert.AlertType.NONE);
        a.setTitle("Alert ASk");
        a.getDialogPane().getButtonTypes().addAll(Yes, No);
        a.setHeaderText(s);
        DialogPane dialogPaneDialogPane = a.getDialogPane();
        dialogPaneDialogPane.getStylesheets().add(
                getClass().getResource("/style/GameStyle.css").toExternalForm());
        dialogPaneDialogPane.getStyleClass().add("infoDialog");
        a.showAndWait();
        if (a.getResult() == Yes) {
            return true;
        } else {
            return false;
        }
    }

    public void inValidIp(String s) {
        ButtonType Ok = new ButtonType("Ok");
        Alert a = new Alert(Alert.AlertType.NONE);
        a.setTitle("Alert ASk");
        a.getDialogPane().getButtonTypes().addAll(Ok);
        a.setHeaderText(s);

        //a.setContentText(s);
        DialogPane dialogPane = a.getDialogPane();
        dialogPane.getStylesheets().add(
                getClass().getResource("/style/GameStyle.css").toExternalForm());
        dialogPane.getStyleClass().add("infoDialog");
        a.showAndWait();

    }
}