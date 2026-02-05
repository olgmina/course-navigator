module org.example.coursenavigator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;

    // для конвертации из markdown в html
    requires flexmark;
    requires flexmark.util;
    requires flexmark.util.data;
    requires flexmark.ext.emoji;
    requires flexmark.ext.tables;
    requires flexmark.ext.wikilink;
    requires flexmark.util.misc;

    opens org.example.coursenavigator to javafx.fxml;
    exports org.example.coursenavigator;


}