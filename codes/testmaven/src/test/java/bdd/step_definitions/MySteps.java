package bdd.step_definitions;

import com.xiaotao.maven.MyClass;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class MySteps {
    private int num1;
    private int num2;

    @Given("^Input the first number (\\d+)")
    public void setNum1(int num) {
        this.num1 = num;
    }
    @When("^Input the second number (\\d+)")
    public void setNum2(int num) {
        this.num2 = num;
    }
    @Then("^check the result of sum is (\\d+)")
    public void testSum(int result) {
        Assert.assertEquals(MyClass.sum(num1, num2), result);
    }
}
