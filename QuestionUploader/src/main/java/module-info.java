module com.mycompany.questionuploader {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.mycompany.questionuploader to javafx.fxml;
    exports com.mycompany.questionuploader;
}
