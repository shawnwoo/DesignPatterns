package compositePattern;

import java.util.Enumeration;
import java.util.Vector;

public class ComputerCluster implements LabResources {

	private Vector<LabResources> LabResourceVector = new java.util.Vector<LabResources>();

	private String resourceId;
	private String supervisor;
	private boolean status = true;

	@Override
	public double costOfmaintenance() {
		// TODO Auto-generated method stub
		Enumeration<LabResources> enumeration = components();

		double totalCost = 0;

		while (enumeration.hasMoreElements()) {
			LabResources element = enumeration.nextElement();

			totalCost = totalCost + element.costOfmaintenance();
		}
		;
		return totalCost;
	}

	public Enumeration<LabResources> components() {
		// TODO Auto-generated method stub
		return LabResourceVector.elements();
	}

	
	public LabResources getChild() {
		
		return this;
	}

	public void add(LabResources component) {
		LabResourceVector.addElement(component);
		Enumeration<LabResources> enu = components();
		while (enu.hasMoreElements()) {
			LabResources element = enu.nextElement();
			element.setSupervisor(supervisor);

		}
	}

	public void remove(LabResources component) {
		component.setInactive();

	}

	public void showOlderModels(int year) {
		Enumeration<LabResources> enu = components();
		while (enu.hasMoreElements()) {

			LabResources element = enu.nextElement();

			if (element instanceof IndividualResource) {
				if (((IndividualResource) element).isStatus())

					if (((IndividualResource) element).oldMode(year))
						System.out.println(((IndividualResource) element)
								.getResourceId() + " is older than " + year);
			} else {
				((ComputerCluster) element).showOlderModels(year);
			}
		}

	}

	public void setInactive(String resourceId) {
		Enumeration<LabResources> enu = components();
		while (enu.hasMoreElements()) {
			LabResources element = enu.nextElement();
			if (((IndividualResource) element).getResourceId()
					.equalsIgnoreCase(resourceId))
				((IndividualResource) element).setInactive();

			//
		}

	}

	public void showResourceDetails() {
		System.out.println("The information of Computer Cluster: ");
		System.out.println("Resource Id: " + this.getResourceId());
		System.out.println("Supervisor: " + this.getSupervisor());

		Enumeration<LabResources> enu = components();
		while (enu.hasMoreElements()) {
			LabResources element = enu.nextElement();
			element.showResourceDetails();

		}
	}

	/**
	 * @return the resourceId
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * @param resourceId
	 *            the resourceId to set
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * @return the supervisor
	 */
	public String getSupervisor() {
		return supervisor;
	}

	/**
	 * @param supervisor
	 *            the supervisor to set
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;

	}

	@Override
	public void setInactive() {
		this.status = false;

	}
}
