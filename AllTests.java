package jUnitTestingPackage;
//Dhruv Lawaniya
//E20CSE021
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testAddNumbers.class, testAddStrings.class })
public class AllTests {

}
