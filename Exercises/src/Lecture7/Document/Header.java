package Lecture7.Document;

public class Header extends DocumentElement {
    private String headerText;

    public Header(String headerText) { this.headerText = headerText; }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String toString() {
        return String.format("Header: %s", headerText);
    }

    public void writeHTML() {
        System.out.println(String.format("<h1> %s </h1>", headerText));
    }
}
