package whammy.fx;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import whammy.fx.model.WhammyCommand;
import whammy.fx.view.WhammyController;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

 // ... AFTER THE OTHER VARIABLES ...

    /**
     * The data as an observable list of WhammyCommands.
     */
    private ObservableList<WhammyCommand> whammyData = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public MainApp() {
        // Add some sample data
        whammyData.add(new WhammyCommand(1, 127));
        whammyData.add(new WhammyCommand(2, 127));
        whammyData.add(new WhammyCommand(3, 127));
        whammyData.add(new WhammyCommand(4, 127));
        whammyData.add(new WhammyCommand(5, 127));
        whammyData.add(new WhammyCommand(7, 127));
        whammyData.add(new WhammyCommand(8, 127));
        whammyData.add(new WhammyCommand(9, 127));
        whammyData.add(new WhammyCommand(10, 127));
        whammyData.add(new WhammyCommand(11, 127));
    }

    /**
     * Returns the data as an observable list of WhammyCommands. 
     * @return
     */
    public ObservableList<WhammyCommand> getWhammyCommandData() {
        return whammyData;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("WhammyApp");

        initRootLayout();

        showWhammyOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showWhammyOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/WhammyOverview.fxml"));
            AnchorPane whammyOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(whammyOverview);

//            // Give the controller access to the main app.
            WhammyController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}