package reusableComponents;

import java.io.FileInputStream;
import java.util.Properties;

import io.opentelemetry.api.internal.StringUtils;

public class PropertyOperations {

	static Properties prop = new Properties();

	public static String getPropertyByKeys(String key) throws Exception {
		
		//1. Load data from properties file
		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		FileInputStream fis= new FileInputStream(propertyFilePath);
		prop.load(fis);
		
		//2. read data
		String value=prop.get(key).toString();
		//String value1=prop.get(key1).toString();
		if(StringUtils.isNullOrEmpty(value))
		{
			throw new Exception("Value is not specified for key: "+key);
		}
		
		return value;

	}

}
