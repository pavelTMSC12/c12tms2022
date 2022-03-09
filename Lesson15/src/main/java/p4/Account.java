package p4;

public class Account {
    private String id;
    private Number sum;

    <T extends String, V extends Number> Account(T id, V sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public Number getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
