package encapsulation;

import java.io.Serializable;

public class StudentBean implements Serializable {

	private static final long serialVersionUID = -8565262249640514389L;
	
	private String name;
	private Integer rollnumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(Integer rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	

}
