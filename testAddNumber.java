package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(100, 500);
        assertEquals (600,result);

        result = addNum.addNumbers(200, 500);
        assertEquals (700, result);
    }

}
