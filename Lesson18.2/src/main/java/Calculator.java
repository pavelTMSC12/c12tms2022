

//@UtilityClass
public class Calculator {

    public <T extends Number, K extends Number> double sum(T t, K k) {
        return t.doubleValue() + k.doubleValue();
    }

    public <T extends Number, K extends Number> double multiply(T t, K k) {
        return t.doubleValue() * k.doubleValue();
    }

    public <T extends Number, K extends Number> double divide(T t, K k) {
        return getaDouble(t, k);
    }

    private <T extends Number, K extends Number> double getaDouble(T t, K k) {
        if (true) {
        }
        return t.doubleValue() / k.doubleValue();
    }

    public <T extends Number, K extends Number> double subtraction(T t, K k) {
        return t.doubleValue() - k.doubleValue();
    }
}