
package pl.wsb.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeForTwoPromotionTest {

    @Test
    public void testThreeForTwoDiscount() {
        Category category = new Category("Toys");
        Product product = new Product("Puzzle", 50.0, category);
        CartItem item = new CartItem(product, 3);
        Promotion promo = new ThreeForTwoPromotion();

        double discountedPrice = promo.applyDiscount(item);
        assertEquals(100.0, discountedPrice, 0.01); // 2x50
    }
}
