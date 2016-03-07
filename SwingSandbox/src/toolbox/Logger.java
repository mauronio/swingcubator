package toolbox;

public class Logger {

	static String PROPS_LOGGER_IMPLEMENTATION = "toolbox.logger";
	static String PROPS_DEBUG_MODE = "toolbox.debug";
	static String DEBUG_MODE_VALUE = "true";
	static String DEFAULT_LOGGER_IMPLEMENTATION = "default";
	static String LOG4J_LOGGER_IMPLEMENTATION = "log4j";

	static String LOGGER_IMPLEMENTATION = (System.getProperty(PROPS_LOGGER_IMPLEMENTATION)!=null ? System.getProperty(PROPS_LOGGER_IMPLEMENTATION) : DEFAULT_LOGGER_IMPLEMENTATION);
	static boolean DEBUG_MODE = (System.getProperty(PROPS_DEBUG_MODE)!=null ? System.getProperty(PROPS_DEBUG_MODE).equals(DEBUG_MODE_VALUE) : false);

	public static void logMessage(String text) {
		switch (LOGGER_IMPLEMENTATION) {
			default: defaultLogMessage(text);
				break;
		
		}
	}
	
	public static void debugMessage(String text) {
		if (DEBUG_MODE) {
			switch (LOGGER_IMPLEMENTATION) {
				default: defaultDebugMessage(text);
					break;
			
			}
		}
	}
	
	private static void defaultLogMessage(String text) {
		System.out.println(text);
	}
	
	private static void defaultDebugMessage(String text) {
		System.out.println(text);
	}
	
}
