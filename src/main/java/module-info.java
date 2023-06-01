module com.example.rishtontumani {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rishtontumani to javafx.fxml;
    exports com.example.rishtontumani;
}