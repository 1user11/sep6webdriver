import org.testng.annotations.Test;

public class FirstExample {

    @Test
    public void testSum() {
        int num1 = 5;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println(sum);
    }

    @Test
    public void testName() {
        System.out.println("Hello Portnov School");
    }

    @Test
    public void testShouldPrintHello() {
        System.out.println("Goodbye, World!");
    }

    @Test
    public void testNumbers() {
        int numberOfClicks = 5;
        int anotherNumber;
        anotherNumber = 6 + numberOfClicks;

        System.out.println(anotherNumber);
    }

    @Test
    public void testMoreNumbers() {
        int numberOfClicks = 5;
        int anotherNumber = 5;

        System.out.println(5 + 6 + anotherNumber + numberOfClicks);
    }


    @Test
    public void testString() {
        String leftPartMessage = "Who who who who!";
        String rightPartMessage = "Who let the dogs out?";

        System.out.println(rightPartMessage + " " + leftPartMessage);
    }

    @Test
    public void testNumberOfSomething() {
        int numberOfClicks = 5;
        String message = "I clicked " + numberOfClicks + " times";

        System.out.println(message);
    }

    public void printClickMessage(int firstNumber, int secondNumber){
        String messagePrefix = "firstNumber value is:";
        String messagePostfix = "secondNumber value is:";
        System.out.println(messagePrefix + firstNumber + "\n" + messagePostfix + secondNumber);
    }

    @Test
    public void testIfStatement() {
        boolean isElementVisible = false;

        if(isElementVisible){
            System.out.println("Click on the Element");
        } else {
            System.out.println("Wait until it will be visible!");
        }
    }

    @Test
    public void testBoolian() {
        boolean b = true;
        boolean toBe = false;

        b = toBe || !toBe;

        if (toBe || !toBe) {
            System.out.println(toBe);
        }

    }

    @Test
    public void testMyMethod() {
        printClickMessage(5, 6);
    }

    @Test
    public void testMyMethod002() {
        printClickMessage(523, 6234);
    }

    @Test
    public void testLoginTest() {
        loginStep("tomsmith", "supersecretpassword");
    }

    public void loginStep(String loginValue, String passwordValue){
        System.out.println("I typed login:" + loginValue);
        System.out.println("I typed password:" + passwordValue);
        System.out.println("I clicked login button");
    }

    @Test
    public void testArrays() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        arrayOfInts[2] = 4;

        System.out.println(arrayOfInts[2]);
    }

    @Test
    public void testForLoop() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        for(int i = 1; i < arrayOfInts.length - 1; i++){
            int currentValue = arrayOfInts[i];
            System.out.println(currentValue);
        }
    }

    public void concatString (String s1, String s2){

        System.out.println(s1.concat(s2));
    }

    @Test
    public void testConcatString() {
        concatString("Nice ", "weather");
    }
}

