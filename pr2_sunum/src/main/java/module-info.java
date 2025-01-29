module org.example.pr2_sunum {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pr2_sunum to javafx.fxml;
    exports org.example.pr2_sunum;
}