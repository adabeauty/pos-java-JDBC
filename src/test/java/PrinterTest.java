import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PrinterTest {
    @Test
    public void can_divide_cartItems(){
        Printer printer = new Printer();
        int categoryId = 3;
        assertThat(printer.divideCartItems(categoryId).size()).isEqualTo(2);
    }
}