package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 Reporter.log("method excuated",true);
  }
}
