module org.provapoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.provapoo to javafx.fxml;
    exports org.provapoo;
}