package ex02_product_description;

public class Product {
    final private int size;
    final private double percentage;

    public Product(String name, int size, double percentage) {
        this.size = size;
        this.percentage = percentage;
    }

    public String productDescription(){
        return "• " + size + "CL " + ((percentage % 1 == 0) ? String.valueOf((int)percentage) : percentage) +"%";
    }
}
