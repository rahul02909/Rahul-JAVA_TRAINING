import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Jfs.Junit;

class JunitTestCase {
	@Test
	void test() {
		//fail("Not yet implemented");
		Junit unit=new Junit();
		int exp_result=unit.mul(2, 5);
		assertEquals(10,exp_result);
		
	}
	@Test
	void test1() {
		//fail("Not yet implemented");
		Junit unit=new Junit();
		
		int exp_result1=unit.add(2, 5);
		assertEquals(7,exp_result1);
		
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
		Junit unit=new Junit();
		
		String exp_result2=unit.concat("Hi..."," buddy");
		assertEquals("Hi... buddy",exp_result2);
	}

}
