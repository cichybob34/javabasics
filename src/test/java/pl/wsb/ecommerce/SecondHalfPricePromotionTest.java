
package pl.wsb.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondHalfPricePromotionTest {

    @Test
    public void testSecondHalfDiscount() {
        Category category = new Category("Clothing");
        Product product = new Product("T-Shirt", 100.0, category);
        CartItem item = new CartItem(product, 2);
        Promotion promo = new SecondHalfPricePromotion();

        double discountedPrice = promo.applyDiscount(item);
        assertEquals(150.0, discountedPrice, 0.01); // 1x100 + 1x50
    }
}
