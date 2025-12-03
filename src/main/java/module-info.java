module org.provapoo {
    requires javafx.controls;
    requires javafx.fxml;
    //requires org.hibernate.orm.core;
    //requires jakarta.persistence;
    requires java.sql;


    opens org.provapoo.controller to javafx.fxml;
    opens org.provapoo.model to javafx.base;
    opens org.provapoo.dao to javafx.fxml;
    opens org.provapoo to javafx.fxml;
    exports org.provapoo;
    exports org.provapoo.dao to javafx.fxml;
    exports org.provapoo.controller to javafx.fxml;
}
