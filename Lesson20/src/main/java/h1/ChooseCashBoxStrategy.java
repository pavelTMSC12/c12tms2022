package h1;

public interface ChooseCashBoxStrategy {
    CashBox chooseCashBox(String customerName, CashBox[] cashBoxes);
}
