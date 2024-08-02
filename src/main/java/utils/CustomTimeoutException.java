package utils;

import org.openqa.selenium.TimeoutException;

public class CustomTimeoutException extends TimeoutException {

	public CustomTimeoutException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
