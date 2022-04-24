package jUnitTestingPackage;
//Dhruv Lawaniya
//E20CSE021
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Dhruv", "Lawaniya");
		assertEquals("DhruvLawaniya", result);
	}

}
