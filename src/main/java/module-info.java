module progetto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires opencsv;
    requires java.sql; // Required by OpenCSV

    opens progetto.server to javafx.fxml, javafx.graphics, javafx.base;

    opens progetto.client.home to javafx.fxml;
    opens progetto.client.login to javafx.fxml;
    opens progetto.client.write to javafx.fxml;

    opens progetto.common.mail to javafx.fxml;
    opens progetto.common.request to javafx.fxml;

    exports progetto.server;
    exports progetto.client.home;
    exports progetto.client.login;
    exports progetto.client.write;
    exports progetto.common.mail;
    exports progetto.common.request;


}