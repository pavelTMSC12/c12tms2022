import lombok.Getter;

import java.util.Arrays;

@Getter
public class MinMax<T extends Number & Comparable<? super T>> {

    private final T[] arrayOfNumbers;

    public MinMax(T[] array) throws Exception {
        if (array == null || array.length == 0) {
            throw new Exception();
        }
        this.arrayOfNumbers = array;
    }

    private void sort() {
        Arrays.sort(arrayOfNumbers);
    }

    public T getMax() {
//        sort();
//        if (arrayOfNumbers == null && arrayOfNumbers.length > 0) {
        T max = arrayOfNumbers[0];
        for (T arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.compareTo(max) > 0) {
                max = arrayOfNumber;
            }
        }
        return max;
//        }
//        return null;
//        return arrayOfNumbers[arrayOfNumbers.length - 1];
    }

    public T getMin() {
//        T min = arrayOfNumbers[0];
//        for (T arrayOfNumber : arrayOfNumbers) {
//            if (arrayOfNumber.compareTo(min) < 0) {
//                min = arrayOfNumber;
//            }
//        }
//        return min;
        sort();
        return arrayOfNumbers[0];
    }
}