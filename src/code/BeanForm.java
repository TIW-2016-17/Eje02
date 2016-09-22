package code;

import java.io.Serializable;

public class BeanForm implements Serializable{

	private String name;
	private String email;
	private String forwarding;

	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getForwarding(){
		return forwarding;
	}
	

	public void setName(String pName){
		name = pName;
	}
	public void setEmail(String pEmail){
		email = pEmail;
	}
	public void setForwarding(String pForwarding){
		forwarding = pForwarding;
	}
	
}
