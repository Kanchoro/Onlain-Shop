package OnlainShop.Models;

import OnlainShop.Enum.Category;
import OnlainShop.Enum.Size;

import java.util.Arrays;

public class Products {
    private long id;
    private Category category;
    private String name;
    private int price;
    private Size[] sizes;
    private String color;
    private String imageUrl;
    private int quantity;

    private static long generateId = 0;

    public Products() {
        this.id = generateId++;
    }

    public Products(Category category, String name, int price, Size[] sizes, String color, String imageUrl, int quantity) {
        this.id = generateId++;
        this.category = category;
        this.name = name;
        this.price = price;
        this.sizes = sizes;
        this.color = color;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Size[] getSizes() {
        return sizes;
    }

    public void setSizes(Size[] sizes) {
        this.sizes = sizes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products!" +
                "\nid= " + id +
                "\ncategory= " + category +
                "\nname= " + name +
                "\nprice= " + price +
                "\nsizes= " + Arrays.toString(sizes) +
                "\ncolor= " + color +
                "\nimageUrl= " + imageUrl +
                "\nquantity= " + quantity
                ;
    }
}
