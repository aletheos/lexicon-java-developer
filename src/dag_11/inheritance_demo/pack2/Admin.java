package dag_11.inheritance_demo.pack2;

import java.util.ArrayList;

public class Admin extends Employee {
	private ArrayList<String> adminTools;

	public ArrayList<String> getAdminTools() { return this.adminTools; }
	public void setAdminTools(ArrayList<String> adminTools) { this.adminTools = adminTools; }
}
