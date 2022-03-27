import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitsExplosionTest {

    @Test
    void should_return_null_given_0() {
        String number = "0";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("",result);
    }

    @Test
    void should_return_1_given_1() {
        String number = "1";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("1",result);
    }

    @Test
    void should_return_22_given_2() {
        String number = "2";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("22",result);
    }

    @Test
    void should_return_333_given_3() {
        String number = "3";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("333",result);
    }

    @Test
    void should_return_4444_given_4() {
        String number = "4";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("4444",result);
    }


    @Test
    void should_return_11_given_11() {
        String number = "11";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("11",result);
    }

    @Test
    void should_return_111_given_111() {
        String number = "111";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("111",result);
    }

    @Test
    void should_return_1111_given_1111() {
        String number = "1111";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("1111",result);
    }

    @Test
    void should_return_1_given_10() {
        String number = "10";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("1",result);
    }

    @Test
    void should_return_1_given_100() {
        String number = "100";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("1",result);
    }

    @Test
    void should_return_1_given_1000() {
        String number = "1000";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("1",result);
    }

    @Test
    void should_return_122_given_12() {
        String number = "12";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("122",result);
    }
    @Test
    void should_return_1333_given_13() {
        String number = "13";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("1333",result);
    }

    @Test
    void should_return_14444_given_14() {
        String number = "14";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("14444",result);
    }

    @Test
    void should_return_12222666666999999999_given_102269() {
        String number = "102269";
        DigitsExplosion digitsExplosion = new DigitsExplosion();

        String result =  digitsExplosion.explode(number);

        Assertions.assertEquals("12222666666999999999",result);
    }
}
