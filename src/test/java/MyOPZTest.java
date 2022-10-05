import MyOPZ.MyOPZ;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyOPZTest {
    @Test
    public void testMyOPZfirst() {
        System.out.println("Test: \"825*+132*+4-/\"  (result: 6)");
        MyOPZ testOPZ = new MyOPZ("825*+132*+4-/");
        Assertions.assertAll(
                () -> Assertions.assertTrue(testOPZ.getCorrectNotation()),
                () -> Assertions.assertTrue(testOPZ.getBooleanStackIsEmpty()),
                () -> Assertions.assertTrue(testOPZ.getResult() == 6)
        );
    }

    @Test
    public void testMyOPZsecond() {
        System.out.println("Test: \"8a\"  (incorrect string)");
        MyOPZ testOPZ = new MyOPZ("8a");
        Assertions.assertAll(
                () -> Assertions.assertFalse(testOPZ.getCorrectNotation()),
                () -> Assertions.assertTrue(!testOPZ.getBooleanStackIsEmpty())
        );
    }

    @Test
    public void testMyOPZthird() {
        System.out.println("Test: \"532++73\" (incorrect string)");
        MyOPZ testOPZ = new MyOPZ("532++73");
        Assertions.assertAll(
                () -> Assertions.assertFalse(testOPZ.getCorrectNotation()),
                () -> Assertions.assertTrue(!testOPZ.getBooleanStackIsEmpty())
        );
    }

    @Test
    public void testMyOPZfourth() {
        System.out.println("Test: \"\" (incorrect string)");
        MyOPZ testOPZ = new MyOPZ("");
        Assertions.assertAll(
                () -> Assertions.assertFalse(testOPZ.getCorrectNotation()),
                () -> Assertions.assertTrue(testOPZ.getBooleanStackIsEmpty())
        );
    }
    @Test
    public void testMyOPZfifth() {
        System.out.println("Test: \"90/\" (incorrect string)");
        MyOPZ testOPZ = new MyOPZ("90/");
        Assertions.assertAll(
                () -> Assertions.assertFalse(testOPZ.getCorrectNotation()),
                () -> Assertions.assertFalse(testOPZ.getBooleanStackIsEmpty())
        );
    }
    @Test
    public void testMyOPZsixth() {
        System.out.println("Test: \"90/\" (incorrect string)");
        MyOPZ testOPZ = new MyOPZ("+++++++++");
        Assertions.assertAll(
                () -> Assertions.assertFalse(testOPZ.getCorrectNotation()),
                () -> Assertions.assertTrue(testOPZ.getBooleanStackIsEmpty())
        );
    }
}