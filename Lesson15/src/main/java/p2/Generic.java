package p2;

/**
 * Собственный класс, который работает с  объектом T (String, Long, и любые другие классы) типа.
 *
 * @param <T> - объект неизвестного класса
 */
public class Generic<T, V> {
    private T value;// можем объявить как глобальную переменную
    private V v;

    public <T extends Number, V extends Number> Generic(T t, V v1) {
//        this.v = v1;
    }

    public Generic(T value) { //конструктор
        this.value = value;
    }

    public T getValue(Object obj) {
        return (T) obj;
    }

    public void print(T value) { //параметр метода
        System.out.println(value.toString());
    }

    public void print() {
        System.out.println(value.toString());
    }
}
