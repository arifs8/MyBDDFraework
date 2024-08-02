package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.StaleElementReferenceException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.InvalidCookieDomainException;
import org.openqa.selenium.UnableToSetCookieException;

public class SeleniumExceptionUtil {

	private static final Logger logger = Logger.getLogger(SeleniumExceptionUtil.class.getName());

	public static void handleException(Exception e) {
		if (e instanceof NoSuchElementException) {
			handleNoSuchElementException((NoSuchElementException) e);
		} else if (e instanceof TimeoutException) {
			handleTimeoutException((TimeoutException) e);
		} else if (e instanceof StaleElementReferenceException) {
			handleStaleElementReferenceException((StaleElementReferenceException) e);
		} else if (e instanceof ElementNotInteractableException) {
			handleElementNotInteractableException((ElementNotInteractableException) e);
		} else if (e instanceof NoSuchFrameException) {
			handleNoSuchFrameException((NoSuchFrameException) e);
		} else if (e instanceof NoSuchWindowException) {
			handleNoSuchWindowException((NoSuchWindowException) e);
		} else if (e instanceof NoAlertPresentException) {
			handleNoAlertPresentException((NoAlertPresentException) e);
		} else if (e instanceof InvalidSelectorException) {
			handleInvalidSelectorException((InvalidSelectorException) e);
		} else if (e instanceof InvalidArgumentException) {
			handleInvalidArgumentException((InvalidArgumentException) e);
		} else if (e instanceof WebDriverException) {
			handleWebDriverException((WebDriverException) e);
		} else if (e instanceof JavascriptException) {
			handleJavascriptException((JavascriptException) e);
		} else if (e instanceof SessionNotCreatedException) {
			handleSessionNotCreatedException((SessionNotCreatedException) e);
		} else if (e instanceof MoveTargetOutOfBoundsException) {
			handleMoveTargetOutOfBoundsException((MoveTargetOutOfBoundsException) e);
		} else if (e instanceof UnhandledAlertException) {
			handleUnhandledAlertException((UnhandledAlertException) e);
		} else if (e instanceof NotFoundException) {
			handleNotFoundException((NotFoundException) e);
		} else if (e instanceof ScriptTimeoutException) {
			handleScriptTimeoutException((ScriptTimeoutException) e);
		} else if (e instanceof InvalidCookieDomainException) {
			handleInvalidCookieDomainException((InvalidCookieDomainException) e);
		} else if (e instanceof UnableToSetCookieException) {
			handleUnableToSetCookieException((UnableToSetCookieException) e);
		} else {
			handleGenericException(e);
		}
	}

	private static void handleNoSuchElementException(NoSuchElementException e) {
		logger.log(Level.SEVERE, "No such element: {0}", e.getMessage());
		// Additional handling code, such as recovery actions
	}

	private static void handleTimeoutException(TimeoutException e) {
		String message = "Timeout occurred Arif: " + e.getMessage();
        logger.log(Level.SEVERE, message);
       
	}

	private static void handleStaleElementReferenceException(StaleElementReferenceException e) {
		logger.log(Level.SEVERE, "Stale element reference: {0}", e.getMessage());
		// Additional handling code
	}



	private static void handleElementNotInteractableException(ElementNotInteractableException e) {
		logger.log(Level.SEVERE, "Element not interactable: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleNoSuchFrameException(NoSuchFrameException e) {
		logger.log(Level.SEVERE, "No such frame: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleNoSuchWindowException(NoSuchWindowException e) {
		logger.log(Level.SEVERE, "No such window: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleNoAlertPresentException(NoAlertPresentException e) {
		logger.log(Level.SEVERE, "No alert present: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleInvalidSelectorException(InvalidSelectorException e) {
		logger.log(Level.SEVERE, "Invalid selector: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleInvalidArgumentException(InvalidArgumentException e) {
		logger.log(Level.SEVERE, "Invalid argument: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleWebDriverException(WebDriverException e) {
		logger.log(Level.SEVERE, "WebDriver exception: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleJavascriptException(JavascriptException e) {
		logger.log(Level.SEVERE, "JavaScript exception: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleSessionNotCreatedException(SessionNotCreatedException e) {
		logger.log(Level.SEVERE, "Session not created: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleMoveTargetOutOfBoundsException(MoveTargetOutOfBoundsException e) {
		logger.log(Level.SEVERE, "Move target out of bounds: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleUnhandledAlertException(UnhandledAlertException e) {
		logger.log(Level.SEVERE, "Unhandled alert: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleNotFoundException(NotFoundException e) {
		logger.log(Level.SEVERE, "Not found: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleScriptTimeoutException(ScriptTimeoutException e) {
		logger.log(Level.SEVERE, "Script timeout: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleInvalidCookieDomainException(InvalidCookieDomainException e) {
		logger.log(Level.SEVERE, "Invalid cookie domain: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleUnableToSetCookieException(UnableToSetCookieException e) {
		logger.log(Level.SEVERE, "Unable to set cookie: {0}", e.getMessage());
		// Additional handling code
	}

	private static void handleGenericException(Exception e) {
		logger.log(Level.SEVERE, "An exception occurred: {0}", e.getMessage());
		// Additional handling code
	}
}
