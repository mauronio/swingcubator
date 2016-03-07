package toolbox;

import java.util.Properties;

public abstract class Tool {

	private Properties properties;
	private String toolPropertyPrefix = null;
	
	protected String getToolPropertyValue(String key) {
		
		toolPropertyPrefix = this.getClass().getSimpleName();
		return Factory.getToolPropertyValue(toolPropertyPrefix + "." + key);

	}

	protected void setToolPropertyValue(String key, String value) {
		
		toolPropertyPrefix = this.getClass().getSimpleName();
		Factory.setToolPropertyValue(toolPropertyPrefix + "." + key, value);

	}

}
