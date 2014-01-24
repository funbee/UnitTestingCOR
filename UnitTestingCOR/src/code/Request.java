/**
 * 
 */
package code;

/**
 * @author oded
 *
 */
public class Request {
	

	/**
	 * @return the resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

	private String resource;
	private String command;

	public Request(String requestResource, String requestCommand) {
		this.resource =  requestResource;
		this.command = requestCommand;
	}

}
