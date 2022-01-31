package utils;

public final class ArrayHelper {
    public static String print(int[] a) {
        if (a == null) {
            return "null";
        }
        int iMax = a.length - 1;
        if (iMax == -1) {
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.format("%3d", a[i]));
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }
}
