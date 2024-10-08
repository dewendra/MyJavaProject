package encapsulation;

public class Test {

	public static void main(String[] args) {
		StudentBean studentBean=new StudentBean();
		studentBean.setName("Dewendra Singh");
		studentBean.setRollnumber(1001);
		System.out.println("Name : "+studentBean.getName()+" Roll Number: "+studentBean.getRollnumber());
	}
}
