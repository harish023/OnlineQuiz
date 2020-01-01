package webapp;

public class User {
	
	private String name;
	private String email_id;
	private String password;
	private String city;
	private String mobile;
	
	private int c_quiz=0;
	private int cpp_quiz=0;
	private int java_quiz=0;
	private int data_structure_quiz=0;
	
	
	public int getC_quiz() {
		return c_quiz;
	}
	public void setC_quiz(int c_quiz) {
		this.c_quiz += c_quiz;
	}
	public int getCpp_quiz() {
		return cpp_quiz;
	}
	public void setCpp_quiz(int cpp_quiz) {
		this.cpp_quiz += cpp_quiz;
	}
	public int getJava_quiz() {
		return java_quiz;
	}
	public void setJava_quiz(int java_quiz) {
		this.java_quiz += java_quiz;
	}
	public int getData_structure_quiz() {
		return data_structure_quiz;
	}
	public void setData_structure_quiz(int data_structure_quiz) {
		this.data_structure_quiz += data_structure_quiz;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
