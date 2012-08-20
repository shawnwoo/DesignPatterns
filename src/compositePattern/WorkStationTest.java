package compositePattern;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;
import static org.junit.Assert.*;

public class WorkStationTest {

	@Test
	public void test_costOfmaintenance() {
		WorkStation ws = new WorkStation();
		ws.setCostOfMaintain(1200.21);
		assertEquals(1200.21, ws.costOfmaintenance(), 0.01);
	}

	@Test
	public void test_oldModel() {
		WorkStation ws = new WorkStation();
		ws.setModelyear(1999);
		assertTrue(ws.oldMode(2000));
	}

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStream() {
		System.setOut(null);
	}

	@Test
	public void test_showResourceDetails() {
		WorkStation ws = new WorkStation();
		ws.setResourceId("111");
		ws.setCostOfMaintain(1000);
		ws.setModelyear(2000);
		ws.setSupervisor("abc");
		ws.showResourceDetails();

		assertTrue(outContent.toString().contains("111"));
		assertTrue(outContent.toString().contains("abc"));

	}
	
	@Test 
	public void test_setInactive(){
		WorkStation ws=new WorkStation();
		ws.setStatus(true);
		ws.setInactive();
		assertTrue(!ws.isStatus());
		
	}

}
