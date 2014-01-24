/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Request;

/**
 * @author oded
 *
 */
public class RequestTest {

	@Test
	public void test() {
		String requestResource = "Drive A";
		String requestCommand = "Format";
		Request myRequest = new Request(requestResource, requestCommand);
		
		String requestCommandReturned = myRequest.getCommand();
		
		assertEquals("Command corrupt", requestCommand, requestCommandReturned);
	}

}
