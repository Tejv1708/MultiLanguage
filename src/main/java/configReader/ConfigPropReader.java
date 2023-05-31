package configReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip;

	public Properties initLangProp(String language) throws FileNotFoundException {
		System.out.println("Language is  = " + language);
		try {
			switch (language.toLowerCase()) {
			case "english":
				ip = new FileInputStream("./src/main/resources/lang.english.property");
				break;

			case "french":
				ip = new FileInputStream("./src/main/resources/lang.english.property");
				break;

			case "russian":
				ip = new FileInputStream("./src/main/resources/lang.russian.property");
				break;

			case "Arabin":
				ip = new FileInputStream("./src/main/resources/lang.english.property");
				break;
			default:
				System.out.println("Language is not found = " + language);
				break;
			}
			prop.load(ip);
		} catch (Exception e) {
			System.out.print("Error Language ");
		}
		return prop;
	}
}
