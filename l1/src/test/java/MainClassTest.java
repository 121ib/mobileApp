import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("getLocalNumber not eq 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber<45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertThat("containsString without hello", getClassString(), containsString("hello"));
        Assert.assertThat("containsString without Hello", getClassString(), containsString("Hello"));
    }
}
