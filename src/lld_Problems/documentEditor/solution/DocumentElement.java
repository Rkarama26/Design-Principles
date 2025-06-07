package lld_Problems.documentEditor.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// DocumentElement abstract interface
public interface DocumentElement {

    public String render();
}

// concreate implementation of DocumentElement
class TextElement implements DocumentElement {

    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}

// concreate implementation of DocumentElement
class ImageElement implements DocumentElement {

    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        return "[Image: " + imagePath + " ]";
    }
}

// concreate implementation of DocumentElement
class NewLineElement implements DocumentElement {

    @Override
    public String render() {
        return "\n";
    }
}

// concreate implementation of DocumentElement
class TabSpaceElement implements DocumentElement {

    @Override
    public String render() {
        return "\t";
    }
}

// Document class responsible for holding a collection of elements.
class Document {
    private List<DocumentElement> documentElements = new ArrayList<>();

    public void addElement(DocumentElement el) {
        documentElements.add(el);
    }

    // Renders the document by concatenating the redner output of all elements
    String render() {
        String result = "";
        for (var element : documentElements) {
            result += element.render();
        }

        return result;
    }
}

//Persistence Interface
interface Persistence {
    void save(String data);
}

// concrete implementation of Persistence
class FileStorage implements Persistence {

    @Override
    public void save(String data) {

        try (FileWriter writer = new FileWriter("document.txt")) {
            writer.write(data);
            System.out.println("Document saved to docuement.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
            e.printStackTrace();
        }

    }
}

// concrete implementation of Persistence
class DBStorage implements Persistence{

    @Override
    public void save(String data) {
        // save to DB
    }
}


// DocumentEditor class managing client interaction
class DocumentEditor{
    private Document document;
    private Persistence storage;
    private String rednerDocument;

    public DocumentEditor(Persistence storage, Document document) {
        this.storage = storage;
        this.document = document;
    }

    void  addText(String text){
        document.addElement(new TextElement(text));
    }

    void addImage(String ImagePath){
        document.addElement(new ImageElement(ImagePath));
    }

    void addNewLine(){
        document.addElement(new NewLineElement());
    }

    void addTabSpace(){
        document.addElement(new TabSpaceElement());
    }

    String renderDocument(){
        if(rednerDocument == null || rednerDocument.isEmpty()){
            rednerDocument = document.render();
        }
        return rednerDocument;
    }

    void saveDocument(){
        storage.save(renderDocument());
    }

    public static void main(String[] args) {
        Document document = new Document();
        Persistence persistence = new FileStorage();

        DocumentEditor editor = new DocumentEditor(persistence, document);

        // simulate a client
        editor.addText("Hello this is rohit");
        editor.addNewLine();
        editor.addImage("src/downloads/img.jpg");
        editor.addNewLine();
        editor.addTabSpace();
        editor.addText("Image saved");

        //Render and display the final document.
        System.out.println(editor.renderDocument());

        editor.saveDocument();
    }

}





















