import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void l1() {
        Assert.assertTrue("getLocalNumber not eq 14", getLocalNumber() == 14);
    }
}
