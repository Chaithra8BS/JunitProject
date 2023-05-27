package testsuits;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

@SelectPackages({"junits"})
@IncludeTags({"Sanity"})
//@IncludeTags({"Sanity","Regression"})
//tags sanity added in calculator test
//tags Regression added in assertion test

public class RunnerClass {
	
	

}
