package p2;

/**
 * Собственный класс, который работает с  объектом T (String, Long, и любые другие классы) типа.
 *
 * @param <T> - объект неизвестного класса
 */
public class Generic<T> {
    private T value;// можем объявить как глобальную переменную

    public Generic() {
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
