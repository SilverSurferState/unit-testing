package ex02_product_description;

public class Product {
    final private int size;
    final private double percentage;

    public Product(String name, int size, double percentage) {
        this.size = size;
        this.percentage = percentage;
    }


    public String productDescription(){
        return "• " + printSizeString(size) + printPercentString(percentage);
    }

    private String printPercentString(double percentage) {
        if(percentage < 0) return "";
        return ((percentage % 1 == 0) ? String.valueOf((int) percentage) : String.format("%.1f", percentage)) + "%";
    }

    private String printSizeString(int size) {
        if(size < 0) return "";
        return size + "CL ";
    }
}
