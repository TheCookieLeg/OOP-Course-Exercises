package Lecture7.Document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        document.addDocumentElement(new Header("This is a header"));
        document.addDocumentElement(new Paragraph("This is super boring text"));
        document.addDocumentElement(new Image("/images/Lukas.png"));

        document.printDocumentElements();
    }

}
