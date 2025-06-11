
package pl.wsb.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TenPercentPromotionTest {

    @Test
    public void testTenPercentDiscount() {
        Category category = new Category("Tech");
        Product product = new Product("Laptop", 2000.0, category);
        CartItem item = new CartItem(product, 1);
        Promotion promo = new TenPercentPromotion();

        double discountedPrice = promo.applyDiscount(item);
        assertEquals(1800.0, discountedPrice, 0.01);
    }
}
