package lld_Problems.documentEditor.problem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {

    private List<String> elements = new ArrayList<>();
    private String renderDocument = "";

    void addText(String text) {
        elements.add(text);
    }

    void addImage(String path) {
        elements.add(path);
    }

    //  Render the document and update `renderDocument`
    String renderDocuments() {
        if (renderDocument.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (String element : elements) {
                if (element.endsWith(".jpg") || element.endsWith(".png")) {
                    result.append("[Image: ").append(element).append("]").append("\n");
                } else {
                    result.append(element).append("\n");
                }
            }
            renderDocument = result.toString();
        }
        return renderDocument;
    }

    void saveToFile() {
        BufferedWriter file = null;
        try {
            file = new BufferedWriter(new FileWriter("document.txt"));
            String content = renderDocuments();
            file.write(content);
            System.out.println("Document saved to document.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file...");
        } finally {
            try {
                if (file != null) file.close();
            } catch (IOException e) {
                System.out.println("Having some issue closing the file");
            }
        }
    }

    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        editor.addText("Hello Rohit");
        editor.addImage("photo.jpg");
        editor.addText("This is Rohit's document");

        System.out.println(editor.renderDocuments());
        editor.saveToFile();
    }
}
