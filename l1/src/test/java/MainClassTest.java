import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("getLocalNumber not eq 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber<45", getClassNumber() > 45);
    }
}
