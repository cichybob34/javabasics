
package pl.wsb.ecommerce;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    public void testAddProduct() {
        Category category = new Category("Books");
        Product product = new Product("Clean Code", 99.99, category);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product, 2);

        assertEquals(1, cart.getItems().size());
        CartItem item = cart.getItems().get(0);
        assertEquals(product, item.getProduct());
        assertEquals(2, item.getQuantity());
    }

    @Test
    public void testGetTotalWithoutPromotion() {
        Category category = new Category("Music");
        Product product1 = new Product("Guitar", 1000, category);
        Product product2 = new Product("Picks", 10, category);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 3);

        assertEquals(1030, cart.getTotalPrice());
    }
}
