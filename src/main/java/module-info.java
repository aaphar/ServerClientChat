module com.example.chattingclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chattingclient to javafx.fxml;
    exports com.example.chattingclient;
}