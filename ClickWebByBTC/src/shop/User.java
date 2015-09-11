package shop;

public class User {
	private int id;
	private String name;
	private String passWord;
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPassWord() {
		return this.passWord;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public void setPassWord(String value) {
		this.passWord = value;
	}
}
