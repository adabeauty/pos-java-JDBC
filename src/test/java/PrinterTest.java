//import com.thoughtworks.iamcoach.pos.Dao.*;
//import com.thoughtworks.iamcoach.pos.module.*;
//import org.junit.Test;
//
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
//import static org.fest.assertions.api.Assertions.assertThat;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class PrinterTest {
//    @Test
//    public void can_divide_cartItems(){
//        Printer printer = new Printer();
//        int categoryId = 3;
//        assertThat(printer.divideCartItems(categoryId).size()).isEqualTo(2);
//    }
//
//    @Test
//    public void can_print_List(){
//        Printer printer = new Printer();
//
//        Item item = new Item(null, 3, "ITEM000001", "apple", "kg", 8.0);
//        double num = 5;
//        PromotionDao promotionImple = mock_PromotionImple();
//
//        CartItem cartItem = new CartItem(item, num, promotionImple.getPromotions());
//        CategoryDao categoryImple = mock_CategoryImple();
//        String printText = "        ********Let's Go 购物清单*********" + "\n"
//                + "----------------------------------------------------------" + "\n"
//                + printDate() + "\n"
//                + "************************************************" + "\n"
//                + "分类：" + categoryImple.getCategoryById(cartItem.getCategoryId()).getName() + "\n"
//                + "名称：" + cartItem.getName() + "   数量：" + cartItem.getNum()
//                + "   单价：" + cartItem.getPrice() + "元" + "   单位：" + cartItem.getUnit()
//                + "   小计：" + cartItem.getSubtotal() + "元" + "\n"
//                + "************************************************" + "\n"
//                + "优惠前：" + 40.0 + "元" + "   优惠金额：" + 10.0 + "元" + "   总计：" + 30.0 + "元" + "\n"
//                + "----------------------------------------------------------";
//
//        assertThat(printer.printList()).isEqualTo(printText);
//    }
//
//    private CategoryDao mock_CategoryImple(){
//        CategoryDao categoryImple = mock(CategoryImple.class);
//        int id = 3;
//        Category category = new Category(null, "fruit");
//        when(categoryImple.getCategoryById(id)).thenReturn(category);
//        return categoryImple;
//    }
//
//    private PromotionDao mock_PromotionImple(){
//
//        ArrayList<Promotion> promotions = new ArrayList<Promotion>();
//        promotions.add(new SeconHalfPromotion(2, 2, "second_half_half", 1.0));
//        promotions.add(new BuyTwoOneFreePromotion(1, 1, "buy_two_one_free", 1.0));
//        promotions.add(new DiscountPromotion(3, 3, "discount", 0.75));
//
//        PromotionDao promotionImple = mock(PromotionImple.class);
//        when(promotionImple.getPromotions()).thenReturn(promotions);
//
//        return promotionImple;
//    }
//
//    private String printDate(){
//        Date dateAndTime = new Date();
//
//        java.text.DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
//        String date = format1.format(dateAndTime);
//        String time = String.format("%tr", dateAndTime);
//
//        return "          " + date + "    " + time;
//    }
//}