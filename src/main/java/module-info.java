module br.michelstech.financeiro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens br.michelstech.financeiro.aplication to javafx.fxml;
    exports br.michelstech.financeiro.aplication;

}