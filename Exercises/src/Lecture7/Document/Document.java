package Lecture7.Document;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentElement> documentElements;

    public Document() {
        documentElements = new ArrayList<DocumentElement>();
    }

    public void addDocumentElement(DocumentElement element) {
        documentElements.add(element);
    }

    public void printDocumentElements() {
        for (var element : documentElements) {
            System.out.println(element.toString());
        }
    }

    public void printDoucmentHTML() {
        for (var element : documentElements) {
            element.writeHTML();
        }
    }

}
