module com.example.oophw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oophw to javafx.fxml;
    exports com.example.oophw;
}