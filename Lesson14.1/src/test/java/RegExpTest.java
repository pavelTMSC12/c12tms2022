import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegExpTest {

    @Test
    void validate() {
        Assertions.assertEquals(false, RegExp.validate("12"));
        Assertions.assertEquals(true, RegExp.validate("1asasas15"));
        Assertions.assertEquals(true, RegExp.validate("asss1mmm1m55"));
        Assertions.assertEquals(true, RegExp.validate("hhhhh1gg"));
        Assertions.assertEquals(false, RegExp.validate("hhhhhgggsdfsdfsdfsdfsdfsdfsdfsdf"));
        Assertions.assertEquals(true, RegExp.validate("qwertqwertqwertqwert"));
        Assertions.assertEquals(true, RegExp.validate("qwer"));
        Assertions.assertEquals(false, RegExp.validate("a"));
        Assertions.assertEquals(false, RegExp.validate(""));
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    RegExp.validate(null);
                }, "str can not be null");
        Assertions.assertEquals("str can not be null", thrown.getMessage());
//        Assertions.assertEquals("some message", exception.getMessage());
//        Assertions.assertThrows(IllegalArgumentException.class, RegExp.validate(null));
    }
}