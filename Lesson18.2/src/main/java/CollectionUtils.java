import lombok.experimental.UtilityClass;

@UtilityClass
public class CollectionUtils {
    public static <T> boolean isEmpty(T[] arrays) {
        return arrays == null || arrays.length == 0;
    }

    public static <T> boolean isNotEmpty(T[] arrays) {
        return !isEmpty(arrays);
    }
}
