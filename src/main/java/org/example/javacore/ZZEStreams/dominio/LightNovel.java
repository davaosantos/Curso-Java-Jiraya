package org.example.javacore.ZZEStreams.dominio;

public class LightNovel {

    private String title;
    private double price;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel() {
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
