module com.example.simulatingoperationsofarentacarcompany_final.simulatingoperationsofarentacarcompany_final {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.simulatingoperationsofarentacarcompany_final.Naima to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final;

    opens com.example.simulatingoperationsofarentacarcompany_final.Sajedul to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

    exports com.example.simulatingoperationsofarentacarcompany_final.Naima;

    opens com.example.simulatingoperationsofarentacarcompany_final.zedni to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final.zedni;
}