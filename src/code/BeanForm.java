package code;

import java.io.Serializable;

public class BeanForm implements Serializable{

	
	private static final long serialVersionUID = 1L;
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
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanForm other = (BeanForm) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", forwarding=" + forwarding + "]";
	}
	
	
	
}
