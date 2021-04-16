package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {

        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("AKS","HIT");
        assertEquals("AKSHIT",result);

        result = addString.addStrings("KHAND","ELWAL");
        assertEquals("KHANDELWAL",result);
    }

}
