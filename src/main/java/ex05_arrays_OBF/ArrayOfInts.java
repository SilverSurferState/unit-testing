package ex05_arrays_OBF;

import java.util.Arrays;

public class ArrayOfInts {
    int getal = 0;
    public int sumOfInts(int[] a) {
        if (a != null) {
            for (int i : a) getal += i;
        }
        return getal;
    }

    public int sumOfEvenInts(int[] nr) {
        return nr == null ? getal : Arrays.stream(nr).filter(i -> i%2 == 0).sum();
    }

}
