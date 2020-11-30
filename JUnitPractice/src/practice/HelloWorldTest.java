package practice;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void testGetMessage() throws Throwable {
		HelloWorld hw = new HelloWorld();
		assertEquals("Hello, World!", hw.getMessage());
	}
	
	@Test
	public void testGetMessage2() throws Throwable {
		HelloWorld hw = new HelloWorld();
		assertEquals("Hello, Jason!", hw.getMessage("Jason"));
	}
	
}
