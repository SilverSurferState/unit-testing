package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOfIntsSumOfEvenTest{

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyflow() {
        int result = arrayOfInts.sumOfEven(new int[]{1,2,3,4,5,6,7,8,9});
        assertEquals(20 , result);
    }

    @Test
    void noEvenNumbers() {
        int result = arrayOfInts.sumOfEven(new int[]{1,3,5,7,9});
        assertEquals(0, result);
    }

    @Test
    void emptyArray(){
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void onlyEvenNumbers(){
        int result = arrayOfInts.sumOfEven(new int[]{2,2,2,2,2,2,2});
        assertEquals(result, 14);
    }
}