package tests;

import org.junit.jupiter.api.Test;

public class FirstClassTest extends TestBase{
    @Test
    public void testCase()  {
        driver.get("http://opencart.abstracta.us/");
    }
}
