import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCat {

    @Test
    public void testCat1() {
        String name = "Tiffany";
        String breed = "Maine Coon";
        Cat cat = new Cat(name, breed);
        cat.purr();
        cat.sound();
        assertEquals(cat.name, "Tiffany");
    }

    @Test
    public void testCat2() {
        Cat cat = new Cat("Truffle", "Maine Coon");
        cat.printCat();
        cat.sleep();
        assertEquals(cat.breed, "Maine Coon");
    }

    @Test
    public void testEatFish() {
        String name = "Tishka";
        String breed = "Maine Coon";
        Cat cat = new Cat(name, breed);
        cat.setFood(new String[]{"Fish", "Meat"});
        assertTrue(cat.eat("Meat"));
    }

    @Test
    public void testEatTomato() {
        Cat cat = new Cat("Tishka", "Maine Coon", new String[]{"Fish", "Meat"});
        assertFalse(cat.eat("Tomato"));
    }
}
