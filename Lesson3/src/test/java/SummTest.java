import static org.junit.jupiter.api.Assertions.assertEquals;

class SummTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(30, Summ.sum(10, 20));

//        sum(-1, 20);
//        sum(20, -1);
//        sum(-1, -1);
//        sum(0, -1);
//        sum(-1, 0);
        assertEquals(-1, Summ.sum(Integer.MAX_VALUE, 3));
    }
}