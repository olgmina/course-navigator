package org.example.coursenavigator;


import com.vladsch.flexmark.ext.emoji.EmojiExtension;
import com.vladsch.flexmark.ext.emoji.EmojiImageType;
import com.vladsch.flexmark.ext.emoji.EmojiShortcutType;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.MutableDataSet;


import java.util.Arrays;

public class MarkdownRenderer {

    public static String toHtml(String markdown) {
        // Настройки с расширениями
        MutableDataSet options = new MutableDataSet();

        // Добавляем поддержку таблиц
       options.set(Parser.EXTENSIONS, Arrays.asList(
                TablesExtension.create(),
              EmojiExtension.create()
        ));

        // Настройка Emoji (можно использовать разные стили)
        options.set(EmojiExtension.USE_SHORTCUT_TYPE, EmojiShortcutType.ANY_GITHUB_PREFERRED);
        options.set(EmojiExtension.USE_IMAGE_TYPE, EmojiImageType.UNICODE_FALLBACK_TO_IMAGE);

        // Настройка таблиц (опционально)
        options.set(TablesExtension.CLASS_NAME, "markdown-table");
        options.set(TablesExtension.WITH_CAPTION, false);

        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        var document = parser.parse(markdown);
        return renderer.render(document);
    }

    // Добавляем стили для красивого отображения
    public static String wrapWithHtmlTemplate(String content) {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <style>
                    body { 
                        font-family: 'Segoe UI', 'Helvetica Neue', Arial, sans-serif; 
                        padding: 20px; 
                        line-height: 1.6;
                        color: #333;
                    }
                    h1 { 
                        color: #2c3e50; 
                        border-bottom: 2px solid #3498db;
                        padding-bottom: 10px;
                    }
                    h2 { color: #34495e; }
                    h3 { color: #7f8c8d; }
                    a { 
                        color: #2980b9; 
                        text-decoration: none; 
                    }
                    a:hover { 
                        text-decoration: underline; 
                    }
                    code { 
                        background: #f8f9fa; 
                        padding: 2px 6px; 
                        border-radius: 4px;
                        font-family: 'Consolas', 'Monaco', monospace;
                        font-size: 0.9em;
                    }
                    pre code {
                        display: block;
                        padding: 15px;
                        overflow-x: auto;
                        background: #2d2d2d;
                        color: #f8f8f2;
                        border-radius: 6px;
                    }
                    
                    /* Стили для таблиц */
                    .markdown-table {
                        width: 100%%;
                        border-collapse: collapse;
                        margin: 20px 0;
                        box-shadow: 0 2px 3px rgba(0,0,0,0.1);
                    }
                    .markdown-table th {
                        background-color: #3498db;
                        color: white;
                        font-weight: bold;
                        text-align: left;
                        padding: 12px 15px;
                    }
                    .markdown-table td {
                        padding: 10px 15px;
                        border-bottom: 1px solid #ddd;
                    }
                    .markdown-table tr:nth-child(even) {
                        background-color: #f9f9f9;
                    }
                    .markdown-table tr:hover {
                        background-color: #f5f5f5;
                    }
                    .markdown-table th, 
                    .markdown-table td {
                        border: 1px solid #ddd;
                    }
                    
                    /* Стили для списков */
                    ul, ol {
                        padding-left: 20px;
                        margin: 10px 0;
                    }
                    li {
                        margin: 5px 0;
                    }
                    
                    /* Стили для блоков цитат */
                    blockquote {
                        border-left: 4px solid #3498db;
                        padding-left: 15px;
                        margin: 15px 0;
                        color: #555;
                        font-style: italic;
                        background-color: #f9f9f9;
                        padding: 10px 15px;
                    }
                    
                    /* Emoji стили */
                    .emoji {
                        font-size: 1.2em;
                        vertical-align: middle;
                    }
                </style>
            </head>
            <body>
            %s
            </body>
            </html>
            """.formatted(content);
    }
}
