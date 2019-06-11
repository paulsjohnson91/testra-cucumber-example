package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {"tech.testra.jvm.plugin.cucumberv2.Testra"},
        monochrome = true,
        tags = "@testytest",
        features = "src/test/resources",
        glue = {""})
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
