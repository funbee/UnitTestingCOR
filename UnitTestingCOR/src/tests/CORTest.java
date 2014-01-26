package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.DriveAHandler;
import code.DriveBHandler;
import code.Handler;
import code.Request;

public class CORTest {

	@Test
	public void test() {
        Request request = new Request("Drive A","Format");
        
        Handler headDriveAHandler = new DriveAHandler("Fail");
        Handler driveBHandler = new DriveBHandler("Active"); 
       
        headDriveAHandler.setHandler(driveBHandler);
        
        Boolean actualOutput = headDriveAHandler.handleRequest(request);
        
        assertTrue("Handler failed to grab",actualOutput);
	}

}
