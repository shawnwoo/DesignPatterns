package compositePattern;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

import static org.junit.Assert.*;


public class ComputerClusterTest {
	
	@Test
	public void test_costOfmaintenance(){
		ComputerCluster cc=new ComputerCluster();
		WorkStation ws=new WorkStation();
		Printer pt=new Printer();
		ws.setCostOfMaintain(1000);
		pt.setCostOfMaintain(500);
		
		cc.add(ws);
		cc.add(pt);
		
		assertEquals(cc.costOfmaintenance(),1500,0.01);
		
	}
	
	@Test
	public void test_add(){
		ComputerCluster cc=new ComputerCluster();
		WorkStation ws=new WorkStation();
		ws.setResourceId("test");
		cc.add(ws);
		assertEquals(((WorkStation)cc.components().nextElement()).getResourceId(),"test");
	}
	
	@Test
	public void test_remove(){
		ComputerCluster cc=new ComputerCluster();
		WorkStation ws=new WorkStation();
		cc.add(ws);
		assertTrue(cc.components().hasMoreElements());
		cc.remove(ws);
		assertTrue(!((WorkStation)cc.components().nextElement()).isStatus());	
	}
	
	private final ByteArrayOutputStream outContent= new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStream(){
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStream(){
		System.setOut(null);
	}
	
	
	@Test
	public void test_showOlderModels(){
		ComputerCluster cc=new ComputerCluster();
		WorkStation ws1=new WorkStation();
		WorkStation ws2=new WorkStation();
		Printer pt=new Printer();
		ws1.setResourceId("ws1");
		ws1.setModelyear(2000);
		ws2.setResourceId("ws2");
		ws2.setModelyear(2005);
		pt.setResourceId("pt");
		pt.setModelyear(2001);
		
		cc.add(ws1);
		cc.add(ws2);
		cc.add(pt);
		
		cc.showOlderModels(2004);
		
		assertTrue(outContent.toString().contains("ws1"));
		assertTrue(outContent.toString().contains("pt"));
		assertTrue(!(outContent.toString().contains("ws2")));
		
	}
	
	@Test
	public void test_setInactive(){
		ComputerCluster cc=new ComputerCluster();
		WorkStation ws=new WorkStation();
		ws.setStatus(true);
		ws.setResourceId("test");
		cc.add(ws);
		cc.setInactive("test");
		assertTrue(!ws.isStatus());
		
		
	}

}
