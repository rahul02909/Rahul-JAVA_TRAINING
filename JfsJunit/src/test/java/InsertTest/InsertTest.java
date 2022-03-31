package InsertTest;

import java.sql.SQLException;
import JdbcCon.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class InsertTest {
	
	static InsertDataByMethods con=null;
	@BeforeAll
	static void setup() throws SQLException 
	{
		con=new InsertDataByMethods();
	}

	@Test
	void test()throws SQLException 
	{
		//fail("Not yet implemented");

		con.insert();
		//assertEquals(1,con.insert());
	}

}
