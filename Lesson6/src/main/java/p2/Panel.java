package p2;

public final class Panel {
    private int count;

    public Panel(int count) {
        this.count = count;
    }

    public void check() {
        System.out.println("check Engine " + count);
    }
}
