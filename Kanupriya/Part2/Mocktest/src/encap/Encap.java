package encap;

public class Encap {

	private int num;
	private String name;
	
	public String getdetails(){
		return name;
	}
	public int setdetails(int num) {
		return this.num=num;
	}
	public static void main(String [] args) {
		Encap e=new Encap();
		System.out.println(e.getdetails());
		System.out.println(e.setdetails(647));
	}
}
