import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCat {

        @Test
        public void testCat1() {
            String testName = "Truffle";
            String testBreed = "Maine Coon";

            Cat catOne = new Cat(testName, testBreed);

            catOne.purr();
            catOne.meow();

            assertEquals(catOne.name, "Truffle");

        }

    @Test
        public void testCat2() {
            String testName = "Tiffany";
            String testBreed = "Maine Coon";

            Cat cat = new Cat(testName, testBreed);

            cat.purr();

            assertEquals(cat.breed, "Maine Coon");
        }

    /**
     * Tests canEat method in Cat class
     * Example of Positive test case
     */
    @Test
    public void testEatFish() {
        String testName = "Tishka";
        String testBreed = "Maine Coon";

        Cat cat = new Cat(testName, testBreed);
        cat.setFood(new String[]{"Fish", "Meat"});

        assertTrue(cat.canEat("Fish"));
    }

    /**
     * Tests canEat method in Cat class
     * Example of Negative test case
     */
    @Test
    public void testEatTomato() {

        Cat cat = new Cat("Tishka", "Maine Coon", new String[]{"Fish", "Meat"});

        assertFalse(cat.canEat("Tomato"));
    }
}
