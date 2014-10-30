import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-30.
 */
public class PrinterTest {
    @Test
    public void can_divide_cartItems(){
        Printer printer = new Printer();
        int categoryId = 3;
        assertThat(printer.divideCartItems(categoryId).size()).isEqualTo(2);
    }
}