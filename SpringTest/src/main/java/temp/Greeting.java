package temp;

import java.util.List;

public class Greeting implements Greeter {

	List<String> names;
	
	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getGreeting() {
		return "Hello World from "+names.get(0);
	}

}
