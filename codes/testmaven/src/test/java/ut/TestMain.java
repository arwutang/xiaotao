package ut;

import com.xiaotao.maven.MyClass;
import org.junit.Assert;
import org.junit.Test;

public class TestMain {

    @Test
    public void testSum() {
        int num1 = 1;
        int num2 = 2;
        Assert.assertEquals(3, MyClass.sum(num1, num2));
    }
}
