package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOfIntsSumOf3SmallestIntsTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();


    @Test
    void happyflow() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1,2,3,100,200});
        assertEquals(result, 6);
    }

    @Test
    void negativeInts() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{-10, 10, 1, 100, 50});
        assertEquals(result, 1);
    }

    @Test
    void emptyArray(){
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(result, 0);
    }
}