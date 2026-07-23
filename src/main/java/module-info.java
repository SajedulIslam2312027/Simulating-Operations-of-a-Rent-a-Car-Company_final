module com.example.simulatingoperationsofarentacarcompany_final {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofarentacarcompany_final to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final;
}