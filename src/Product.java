import java.util.Comparator;

public class Product implements Comparable<Product> {

    private int productId;
    private String productName;
    private int price;

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int compareTo(Product product) {
        return Integer.compare(this.productId, product.productId);
    }

    @Override
    public String toString() {
        return "ID: " + productId +", Price: " + price + ", productName: " + productName;
    }
}
