/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Handler;
import code.DriveAHandler;
import code.Request;

/**
 * @author Oded
 *
 */
public class DriveAHandlerTest {

	@Test
	public void test() {
		Handler classUnderTest = new DriveAHandler("Fail");
		Request request = new Request("Drive A","Format");

		Boolean actualOutput = classUnderTest.handleRequest(request);

		assertTrue("Handler failed to grab",actualOutput);
	}

}
