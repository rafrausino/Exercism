import org.junit.Ignore;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LuhnValidatorTest {
    private LuhnValidator luhnValidator;

    @Before
    public void setUp() {
        luhnValidator = new LuhnValidator();
    }

    @Test
    public void testSingleDigitStringInvalid() {
        assertFalse(luhnValidator.isValid("1"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testSingleZeroIsInvalid() {
        assertFalse(luhnValidator.isValid("0"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testSimpleValidSINReversedRemainsValid() {
        assertTrue(luhnValidator.isValid("059"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testSimpleValidSINReversedBecomesInvalid() {
        assertTrue(luhnValidator.isValid("59"));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testValidCanadianSINValid() {
        assertTrue(luhnValidator.isValid("055 444 285"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testInvalidCanadianSINInvalid() {
        assertFalse(luhnValidator.isValid("055 444 286"));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testInvalidCreditCardInvalid() {
        assertFalse(luhnValidator.isValid("8273 1232 7352 0569"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testStringsContainingNonDigitInvalid() {
        assertFalse(luhnValidator.isValid("055a 444 285"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testStringContainingPunctuationInvalid() {
        assertFalse(luhnValidator.isValid("055-444-285"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testStringContainingSymbolsInvalid() {
        assertFalse(luhnValidator.isValid("055£ 444$ 285"));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testSingleSpaceWithZeroInvalid() {
        assertFalse(luhnValidator.isValid(" 0"));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testMoreThanSingleZeroValid() {
        assertTrue(luhnValidator.isValid("0000 0"));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testDigitNineConvertedToOutputNine() {
        assertTrue(luhnValidator.isValid("091"));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testStringsWithNonDigitsInvalid() {
        assertFalse(luhnValidator.isValid(":9"));
    }

    @Test
    public void testRemovalOfSpaces() {
        assertEquals("123", luhnValidator.removeSpaces("12 3"));
    }

    @Test
    public void testCreateArrayOfString() {
        String[] arrayOfString = new String[3];
        arrayOfString[0] = "1";
        arrayOfString[1] = "2";
        arrayOfString[2] = "3";
        assertEquals(arrayOfString, luhnValidator.createArrayIfString("123"));
    }

    @Test
    public void testReverseArray() {
        String[] arrayNotReverted = new String[3];
        arrayNotReverted[0] = "1";
        arrayNotReverted[1] = "2";
        arrayNotReverted[2] = "3";

        String[] arrayReverted = new String[3];
        arrayReverted[0] = "3";
        arrayReverted[1] = "2";
        arrayReverted[2] = "1";

        assertEquals(arrayReverted, luhnValidator.revertArrayOfStrings(arrayNotReverted));
    }

    @Test
    public void testReverseList() {
        List<Integer> listNotReverted = new ArrayList<>();
        listNotReverted.add(1);
        listNotReverted.add(2);
        listNotReverted.add(3);

        List<Integer> listReverted = new ArrayList<>();
        listReverted.add(3);
        listReverted.add(2);
        listReverted.add(1);

        assertEquals(listReverted, luhnValidator.revertListOfInteger(listNotReverted));
    }

    @Test
    public void testDoubleEverySecondNumber() {
        String[] arrayWithoutDoubling = new String[3];
        arrayWithoutDoubling[0] = "1";
        arrayWithoutDoubling[1] = "2";
        arrayWithoutDoubling[2] = "3";

        List<Integer> arrayDoubled = new ArrayList<>();
        arrayDoubled.add(1);
        arrayDoubled.add(4);
        arrayDoubled.add(3);

        assertEquals(arrayDoubled, luhnValidator.doubleEverySecondDigitFromRightToLeft(arrayWithoutDoubling));
    }

    @Test
    public void testDoubleEverySecondNumberMinus9IfBiggerThan9() {
        String[] arrayWithoutDoubling = new String[3];
        arrayWithoutDoubling[0] = "1";
        arrayWithoutDoubling[1] = "8";
        arrayWithoutDoubling[2] = "2";

        List<Integer> arrayDoubled = Arrays.asList(1, 7, 2);

        assertEquals(arrayDoubled, luhnValidator.doubleEverySecondDigitFromRightToLeft(arrayWithoutDoubling));
    }

    @Test
    public void testSumOfAllList() {
        List<Integer> listToSum = Arrays.asList(2, 2, 7);
        Integer sum = 11;

        assertEquals(sum, luhnValidator.sumAllList(listToSum));
    }

    @Test
    public void testNumberEvenlyDivisibleBy10() {
        assertTrue(luhnValidator.isEvenlyDivisibleBy10(80));
        assertFalse(luhnValidator.isEvenlyDivisibleBy10(79));
    }

    @Test
    public void testOddEvenNumber() {
        assertFalse(luhnValidator.isOdd(2));
        assertTrue(luhnValidator.isOdd(1));
    }

    @Test
    public void testRemoveAllCharacteres() {
        String removecharacters = ":123";
        assertEquals("123", luhnValidator.removeCharacters(removecharacters));

    }

//    @Test
//    public void testCanNotEmptyWithZero() {
//        assertEquals("123",luhnValidator.removeSpacesEmpty(" 0"));
//    }

    /* The following test diverges from the canonical test data. This is because the corresponding canonical test does
     * not account for Java specific functions (such as Character.getNumericValue()), which can be part of incorrect yet
     * passing implementations. For more detail, check out issue #972 here:
     * (https://github.com/exercism/java/issues/972).
     */
    //@Ignore("Remove to run test")


}
