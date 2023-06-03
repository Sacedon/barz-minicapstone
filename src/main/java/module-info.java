module com.example.barzminicapstone {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.barzminicapstone to javafx.fxml;
    exports com.example.barzminicapstone;
}