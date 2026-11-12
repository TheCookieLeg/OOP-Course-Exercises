package Lecture7.Document;

public class Image extends DocumentElement {
    private String imagePath;

    public Image(String imagePath) { this.imagePath = imagePath; }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String toString() {
        return String.format("Image: %s", imagePath);
    }

    public void writeHTML() {
        System.out.println(String.format("<a src='%s'/>", imagePath));
    }
}
