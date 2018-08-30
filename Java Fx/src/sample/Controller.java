package sample;

import Lists.List;
import Lists.Objects;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;



public class Controller {

    @FXML
    TableView<List> listTable;

    @FXML
    TableColumn ArticleCol;

    @FXML
    TableColumn QuantityCol;

    @FXML
    TableColumn UnityCol;

    @FXML
    TableColumn TotalCol;

    @FXML
    TableColumn StatusCol;

    @FXML
    public void initialize() {


}}