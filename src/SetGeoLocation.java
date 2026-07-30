import java.util.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.latest.emulation.Emulation;
import java.util.HashMap;
import java.util.Map;
public class SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ChromeDriver driver = new ChromeDriver();
			DevTools devTools = driver.getDevTools();
			devTools.createSession();
			
			Map<String, Object>coordinates = new HashMap<String,Object>();
			
			coordinates.put("latitude", 17);
			coordinates.put("longitude",79);
			coordinates.put("accuracy",1);//Meter
			
			driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("nextflix",Keys.ENTER);
			driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
			String title =driver.findElement(By.cssSelector(".default-ltr-iqcdef-cache-19ckm4q e1cwop5t0")).getText();
			System.out.println(title);
			
	}

}
