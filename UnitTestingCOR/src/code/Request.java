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
	 * @set the resource
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @return the answer
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

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
	private String answer;

	public Request(String requestResource, String requestCommand) {
		this.resource = requestResource;
		this.command = requestCommand;
	}


}
