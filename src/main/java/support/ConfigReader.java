package support;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnviornmentType;

public class ConfigReader {
	private Properties properties;
	private static ConfigReader configReader;

	private ConfigReader() {
		BufferedReader reader;
		String propertyFilePath = "src/test/resources/configurations.properties";
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public static ConfigReader getInstance() {
		if (configReader == null) {
			configReader = new ConfigReader();
		}
		return configReader;
	}

	public String getBaseUrl() {
		String baseUrl = properties.getProperty("baseUrl");
		if (baseUrl != null)
			return baseUrl;
		else
			throw new RuntimeException("baseUrl not specified in the Configuration.properties file.");
	}

	public String getUserDirectory() {
		String directory = properties.getProperty("directoryPath");
		if (directory != null)
			return directory;
		else
			throw new RuntimeException("directoryPath not specified in the Configuration.properties file.");
	}

	public String getUserName() {
		String UserName = properties.getProperty("userName");
		if (UserName != null)
			return UserName;
		else
			throw new RuntimeException("UserName not specified in the Configuration.properties file.");
	}

	public String getPassword() {
		String Password = properties.getProperty("password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("password not specified in the Configuration.properties file.");
	}

	public String getDriverPath() {
		String Password = properties.getProperty("driverPath");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public String getFireFoxDriverPath() {
		String driverPath = properties.getProperty("fireFoxdriverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException(
					"Driver Path not specified in the Configuration.properties file for the Key:driverPath");
	}

	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public EnviornmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnviornmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnviornmentType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}

}
