module com.example.photoalbumapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.photoalbumapp to javafx.fxml;
    exports com.example.photoalbumapp;
}