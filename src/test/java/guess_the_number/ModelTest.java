package guess_the_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    Model model = new Model();

    @Test
    public void testGenerateNumber_between0And10() {
        for (int i = 0; i < 200; i++) {
            model.generateNumber(10);
            assertTrue(model.getGeneratedNumber() > 0 && model.getGeneratedNumber() < 10);
        }
    }

    @Test
    public void testGenerateNumber_between0And100() {
        for (int i = 0; i < 2000; i++) {
            model.generateNumber(100);
            assertTrue(model.getGeneratedNumber() > 0 && model.getGeneratedNumber() < 100);
        }
    }

}