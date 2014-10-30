import com.thoughtworks.iamcoach.pos.module.CartItem;
import com.thoughtworks.iamcoach.pos.service.CartService;

import java.util.ArrayList;

public class Printer {
    public ArrayList<CartItem> divideCartItems(int categoryId) {
        ArrayList<CartItem> dividedCartItems = new ArrayList<CartItem>();

        CartService cartService = new CartService();
        ArrayList<CartItem> cartItems = cartService.getCartInfo();

        for(int i=0; i<cartItems.size(); i++){
            if(cartItems.get(i).getCategoryId() == categoryId){
                dividedCartItems.add(cartItems.get(i));
            }
        }
        return dividedCartItems;
    }
}
