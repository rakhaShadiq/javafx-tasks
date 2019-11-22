/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxtaskwindow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Too
 */
public class TaskItemController implements Initializable {

    @FXML
    private ImageView iconSelect;
    @FXML
    private Label lblTaskName;
    @FXML
    private Button btnInfo;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setTask(TasksModel model) {
        ContextMenu menu = new ContextMenu();
        System.out.println(model.toString());
        lblTaskName.setText(model.getTitle());

        if (model.getCompleted()) {
            btnInfo.setText("Complete");
            iconSelect.setImage(new Image(getClass().getResourceAsStream("/icons/icons8_checked_filled_24px.png")));
            menu.getItems().add(new MenuItem("Set Task InComplete"));
        } else {
            btnInfo.setText("InComplete");
            System.out.println(getClass().getResourceAsStream("/icons/icons8_checked_filled_24px.png"));
            iconSelect.setImage(new Image(getClass().getResourceAsStream("/icons/icons8_checked_filled_24px_1.png")));
            menu.getItems().add(new MenuItem("Set Task Complete"));
        }
        
        lblTaskName.setContextMenu(menu);
    }

}
