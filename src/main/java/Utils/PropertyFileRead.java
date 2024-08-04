package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {
	
	static String filpath = "C:\\Users\\kumar\\eclipse-workspace\\BesantPorurSeleniumJuly2024\\Input\\env.properties";
	
	public static Properties ReadEnvData() throws IOException
	{
		File F = new File(filpath);
		FileInputStream Fs = new FileInputStream(F);
		Properties P = new Properties();
		P.load(Fs);
		return P;
	}

}
