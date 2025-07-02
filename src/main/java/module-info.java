module StudyApp { 
    requires javafx.controls;
    requires javafx.fxml; 

    opens com.filipe to javafx.fxml; 
    
    exports com.filipe; 
}