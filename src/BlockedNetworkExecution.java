import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v147.network.Network;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import org.openqa.selenium.devtools.v147.network.model.BlockPattern;


public class BlockedNetworkExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ChromeDriver driver = new ChromeDriver();
			DevTools devTools = driver.getDevTools();
			devTools.createSession();
			devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
//			//devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.css")));
//			//devTools.send(Network.setBlockedURLs(List.of("*.jpg", "*.css")));
//			List<BlockPattern> patterns = Netwrok
//				    new BlockPattern(Optional.of("*.jpg"), Optional.empty(), Optional.empty()),
//				    new BlockPattern(Optional.of("*.css"), Optional.empty(), Optional.empty())
//				);
//
//				devTools.send(Network.setBlockedURLs(Optional.of(patterns), Optional.empty()));
			//devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.css")));	
			
				List<BlockPattern> patterns = List.of(
					    new BlockPattern(Optional.of("*.jpg"), Optional.empty(), Optional.empty()),
					    new BlockPattern(Optional.of("*.css"), Optional.empty(), Optional.empty())
					);

				devTools.send(
				    Network.setBlockedURLs(
				        Optional.of(patterns),
				        Optional.empty()
				    )
				);
			long startTime =System.currentTimeMillis();
			driver.get("https://rahulshettyacademy.com/angularAppdemo/");
			driver.findElement(By.linkText("Browse Products")).click();
			driver.findElement(By.linkText("Selenium")).click();	
			driver.findElement(By.cssSelector("add-to-cart")).click();
			driver.findElement(By.cssSelector("p")).getText();
			long endTime =System.currentTimeMillis();
			System.out.println(endTime-startTime);
		}

}
