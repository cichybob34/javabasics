
package pl.wsb.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductInitialization() {
        Category category = new Category("Electronics");
        Product product = new Product("Smartphone", 1999.99, category);

        assertEquals("Smartphone", product.getName());
        assertEquals(1999.99, product.getPrice());
        assertEquals(category, product.getCategory());
    }

    @Test
    public void testProductPriceChange() {
        Category category = new Category("Books");
        Product product = new Product("Java Basics", 59.99, category);

        product.setPrice(49.99);
        assertEquals(49.99, product.getPrice());
    }
}
