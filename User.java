//*********************************************************************
//User.java CS2043 Proj1
// Represents a user of health monitering system
//********************************************************************

abstract public class User
{
	protected String name;
	protected String id;
	protected String email;
	protected String phoneNum;
	
	//Construstor to set up user using specified information
	
	public User(String uName, String uEmail, String uPhoneNum)
	{
		name = uName;
		email = uEmail;
		phoneNum = uPhoneNum;
	}
	
	
	//Return a string including basic user information
	
	public String toString()
	{
		String userInfo = "Name: " + name + "\n";
		
		userInfo += "Email: " + email + "\n";
		userInfo += "Phone# " + phoneNum + "\n";
		
		return userInfo;
	}
}