package ex02_product_description;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void firstTest(){
        Product product = new Product("beer", 33, 6.3);
        assertEquals("• 33CL 6.3%", product.productDescription());
    }

    @Test
    void secondTestWithSingleDigitPercentage(){
        Product product = new Product("whisky", 25, 5);
        assertEquals("• 25CL 5%", product.productDescription());
    }

}
