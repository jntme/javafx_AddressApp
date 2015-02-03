package ch.makery.address;

import ch.makery.address.model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * by j.meier
 * on 05.01.2015
 * All rights reserved.
 */
public class MainApp extends Application {

    private Stage stage;
    private BorderPane rootLayout;

    private ObservableList<Person> personData = FXCollections.observableArrayList();

    public MainApp()
    {
        personData.add(new Person("Hans", "Muster"));
        personData.add(new Person("Ruth", "Meier"));
        personData.add(new Person("Peter", "Müller"));
        personData.add(new Person("Christoph", "Walter"));
        personData.add(new Person("Joni", "Meier"));
        personData.add(new Person("Peino", "VomDienst"));
        personData.add(new Person("Jacqueline", "Zuber"));
        personData.add(new Person("Jenny", "VanGogh"));
    }

    public ObservableList<Person> getPersonData()
    {
        return personData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        this.stage = primaryStage;
        this.stage.setTitle("AddressApp");

        initRootLayout();

        showPersonOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout()
    {
        try
        {
            //load root layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            //show the scene containing the root layout
            Scene scene = new Scene(rootLayout);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**layout
     * Shows the person overview inside the root .
     */
    public void showPersonOverview()
    {
        try
        {
            //load person overview
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            //set person overview into the center of root layout
            rootLayout.setCenter(personOverview);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     */
    public Stage getPrimaryStage() {
        return stage;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}