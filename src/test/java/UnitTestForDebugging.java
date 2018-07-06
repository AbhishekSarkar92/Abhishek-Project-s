import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

import org.testng.annotations.Test;

import com.excel.Xls_Reader;
import com.google.common.io.Resources;

public class UnitTestForDebugging {
	
	@SuppressWarnings("unused")
	@Test
	public void testExcel() throws URISyntaxException
	{
		//Monday, July 2, 2018
		 Calendar now = Calendar.getInstance();
		 int Value1 =now.get(Calendar.DATE) ; //3
		 String Month = now.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );
		 String Day = now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH );
		 int Value2 =  now.get(Calendar.MONTH);
		 int Value3 = now.get(Calendar.YEAR);
		
		Xls_Reader xlsReader = null;
		xlsReader = new Xls_Reader(Paths.get(Resources.getResource("testdata" + File.separator + "BluestrataTestData.xlsx").toURI()).toFile().getAbsolutePath());
		HashMap<String, String> testData = xlsReader.GetValue("emarPortal", "QA136");
	}

}
