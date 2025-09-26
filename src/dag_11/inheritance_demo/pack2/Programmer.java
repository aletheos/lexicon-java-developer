package dag_11.inheritance_demo.pack2;

import java.util.ArrayList;

public class Programmer extends Employee {
	private ArrayList<String> languages;

	public ArrayList<String> getLanguages() { return this.languages; }
	public void setLanguages(ArrayList<String> languages) { this.languages = languages; }
}
