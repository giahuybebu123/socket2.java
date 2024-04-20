module com.giahuy.socketjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.giahuy.socketjava to javafx.fxml;
    exports com.giahuy.socketjava;
}