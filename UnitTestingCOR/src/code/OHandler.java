/**
 * 
 */
package code;

/**
 * @author Oded
 *
 */
public class OHandler extends Handler {

	/* (non-Javadoc)
	 * @see code.Handler#handleRequest(code.Request)
	 */
	@Override
	public Boolean handleRequest(Request request) {
		String resource = "Oded";

		if (resource.equals(request.getResource())){
			String command = request.getCommand();
			System.out.println(resource + " " + command + " " );
			return true;
		} else {
			if(handler != null){
				return this.handler.handleRequest(request);
			}
		}
		return false;
	}

}
