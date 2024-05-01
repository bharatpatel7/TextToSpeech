module com.example.texttospeech {
    requires javafx.controls;
    requires javafx.fxml;
    requires freetts;
    requires java.desktop;

    opens com.example.texttospeech to javafx.fxml;
    exports com.example.texttospeech;
}