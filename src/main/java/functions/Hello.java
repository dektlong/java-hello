package functions;

import java.util.function.Function;

public class Hello implements Function<String, String> {

	public String apply(String name) {
		String retval = "I am saying " + name;
		System.out.println(retval);
		return retval;
	}
}
