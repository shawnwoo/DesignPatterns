package compositePattern;

public class MainTest {

	public static void main(String[] args) {
		

		ComputerCluster A = new ComputerCluster();
		ComputerCluster B = new ComputerCluster();
		WorkStation ws1 = new WorkStation();
		WorkStation ws2 = new WorkStation();
		Printer pt1 = new Printer();
		Printer pt2=new Printer();
		
		ws1.setCostOfMaintain(1000);
		ws2.setCostOfMaintain(2000);
		pt1.setCostOfMaintain(3000);
		pt2.setCostOfMaintain(4000);
		
		ws1.setModelyear(2000);
		ws2.setModelyear(2001);
		pt1.setModelyear(2002);
		pt2.setModelyear(2003);
		
		ws1.setResourceId("ws1");
		ws2.setResourceId("ws2");
		pt1.setResourceId("pt1");
		pt2.setResourceId("pt2");
		
		ws1.setSupervisor("Supervisor-ws1");
		ws2.setSupervisor("Supervisor-ws2");
		pt1.setSupervisor("Supervisor-pt1");
		pt2.setSupervisor("Supervisor-pt2");
		
		
		A.setResourceId("A");
		B.setResourceId("B");
		A.setSupervisor("Supervisor-A");
		B.setSupervisor("Supervisor-B");
		
		
		
		A.add(ws1);
		A.add(ws2);
		A.add(pt1);
		
		B.add(A);
		B.add(pt2);
		
		
		B.showOlderModels(2001);
		
		
		B.showResourceDetails();
		
		System.out.println("Total maintain cost of "+B.getResourceId()+" is: "+B.costOfmaintenance());
		
		
		A.remove(ws1);
		B.showResourceDetails();
		System.out.println("Total maintain cost of "+B.getResourceId()+" is: "+B.costOfmaintenance());

	}

}
