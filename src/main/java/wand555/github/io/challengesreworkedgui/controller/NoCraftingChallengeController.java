package wand555.github.io.challengesreworkedgui.controller;

import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.bukkit.Material;
import org.controlsfx.control.ListSelectionView;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoCraftingChallengeController extends ChallengeController {
    @FXML
    private ToggleButton activateButton;
    @FXML
    private ListView<String> craftableItemsList;
    @FXML
    private TitledPane noCraftingTitledPane;
    @FXML
    private Button addCraftableItemButton;
    @FXML
    private Button addForbiddenUIButton;
    @FXML
    private ListView forbiddenUIList;
    @FXML
    private Button addPunishmentButton;
    @FXML
    private ListView punishmentList;

    private final BooleanProperty active = new SimpleBooleanProperty(false);

    @FXML
    protected void initialize() {
        super.initialize();
        System.out.println(activateButton);
        craftableItemsList.setItems(FXCollections.observableArrayList("Keine Bisher"));
        addCraftableItemButton.setOnAction(event -> {
            Stage stage = new Stage();
            StackPane root = new StackPane();
            ListSelectionView<Material> listSelectionView = new ListSelectionView<>();
            List<Material> obtainableItems = Stream.of(Material.values()).filter(Material::isItem).toList();
            listSelectionView.setSourceItems(FXCollections.observableArrayList(obtainableItems));
            root.getChildren().add(listSelectionView);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });
    }
}
