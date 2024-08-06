package Subtration_Program;

public class Facebook {

	public Facebook(String userName, int userId, String password) {
		this.userName=userName;
		this.userId=userId;
		this.password=password;
	}
	
	private String userName;
	private int userId;
	private String password;
	
	public void getName() {
		System.out.println(userName);
	}
	public void setName(String userName) {
		this.userName=userName;
	}
	public void getId() {
		System.out.println(userId);
	}
	public void setPassword(String password) {
		
	}
	
	public static void main(String [] args) {
		
	}
	
}
