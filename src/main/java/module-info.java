module com.example.simulatingoperationsofarentacarcompany_final.simulatingoperationsofarentacarcompany_final {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.simulatingoperationsofarentacarcompany_final.Naima to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final;

    opens com.example.simulatingoperationsofarentacarcompany_final.Sajedul to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

<<<<<<< HEAD
=======
    exports com.example.simulatingoperationsofarentacarcompany_final.Naima;
>>>>>>> ed7cc384f9a40cc08016b2807ea3d53d9bb48f75

    opens com.example.simulatingoperationsofarentacarcompany_final.zedni to javafx.fxml;
    exports com.example.simulatingoperationsofarentacarcompany_final.zedni;
}