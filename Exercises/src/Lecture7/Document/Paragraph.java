package Lecture7.Document;

public class Paragraph extends DocumentElement {
    private String paragraphText;

    public Paragraph(String paragraphText) { this.paragraphText = paragraphText; }

    public String getParagraphText() {
        return paragraphText;
    }

    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    public String toString() {
        return String.format("Paragraph: %s", paragraphText);
    }

    public void writeHTML() {
        System.out.println(String.format("<p> %s </p>", paragraphText));
    }
}
