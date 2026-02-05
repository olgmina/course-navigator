package org.example.coursenavigator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public TreeItem rootItem;
    @FXML
    private WebView contentWebView;

    @FXML
    private TreeView<String> courseTree;
    @FXML
    private Label statusLabel;

    // Маппинг: TreeItem → MD файл
    private Map<String, String> labToFileMap = Map.of(
            "Лаб 1.", "course-materials/labs/lab1.md",
            "Лаб 2.", "course-materials/labs/lab2.md",
            "Лаб 3.", "course-materials/labs/lab3.md",
            "Лаб 4.", "course-materials/labs/lab4.md",
            "Лаб 5.", "course-materials/labs/lab5.md",
            "Лаб 6.", "course-materials/labs/lab6.md",
            "Лаб 7. Эхо-сервер", "course-materials/labs/lab7.md",
            "Лаб 8. Многопоточный сервер", "course-materials/labs/lab8.md",
            "Лаб 9. Погодная станция", "course-materials/labs/lab9.md"
    );

    @FXML
    private void handleTreeItemClick(MouseEvent event) {
        TreeItem<String> item = courseTree.getSelectionModel().getSelectedItem();

        if (item != null && labToFileMap.containsKey(item.getValue())) {
            String mdFile = labToFileMap.get(item.getValue());

            loadAndDisplayMarkdown(mdFile);
        }
    }

    private void loadAndDisplayMarkdown(String mdFilePath) {
        statusLabel.setText("Загрузка " + mdFilePath + "...");

        // Загружаем MD с GitHub
        String mdContent = null;

        try {
            mdContent = loadFromLocalFile(mdFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Конвертируем в HTML
        String htmlContent = MarkdownRenderer.toHtml(mdContent);
        String fullHtml = MarkdownRenderer.wrapWithHtmlTemplate(htmlContent);
        // Отображаем в WebView
        contentWebView.getEngine().loadContent(fullHtml);

        statusLabel.setText("Загружено: " + mdFilePath);
    }

    private String loadFromLocalFile(String filePath) throws IOException {
        // Предполагаем, что файлы лежат в папке resources/markdown/
        Path path = Paths.get("", filePath);
        return Files.readString(path, StandardCharsets.UTF_8);

    }

    @FXML
    private void handleRefresh() {
        // Обновить все MD файлы из GitHub
        //CacheManager.refreshAll();
    }

    public void toggleOfflineMode(ActionEvent actionEvent) {
    //офлайн режим
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         for(String str:labToFileMap.keySet()){
             TreeItem<String> child1 = new TreeItem<>(str);
             rootItem.getChildren().add(child1);
         }
        courseTree.setRoot(rootItem);

    }
}