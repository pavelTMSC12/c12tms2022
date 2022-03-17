import java.util.Set;

public class GenericClass<T extends Comparable<String>, V extends Set<? extends String>, K extends Number> {

    private final T t;
    private final V v;
    private final K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}