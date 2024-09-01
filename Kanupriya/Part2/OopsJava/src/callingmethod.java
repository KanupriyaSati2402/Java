
public class callingmethod {
  private int num;
  private String name;
  
  callingmethod(int num , String name){
	  this.num=num;
	  this.name=name;
  }
  public void getname() {
	  System.out.println(name);
  }
  public void setnum(int num) {
	  this.num=num;
  }
  public static void main (String [] args) {
	  callingmethod call = new callingmethod(int num , String name);
	  call.getname();
	  call.setnum(8787);
	  
  }
}
