package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testAdd() {
		 void testAdd() {

			 Addition ob=new Addition();

			 int res=ob.add(10, 20);

			 assertEquals(30, res);

			 }
	}

}
