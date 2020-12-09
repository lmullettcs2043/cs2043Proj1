//*********************************************************************
//Client.java CS2043 Proj1
// Represents a user of health monitering system
//********************************************************************

public class Client extends User
{
	protected String medicareNum;
	
	//Constructor to set up Client with specified information
	
	public Client(String uName, String uEmail, String uPhoneNum, String mc)
	{
	
		super(uName, uEmail, uPhoneNum);
		
		medicareNum = mc;
	}
	
	
	//Returns info about Client
	
	public String toString()
	{
		String clientInfo = super.toString();
		
		clientInfo += "Medicare Number: " + medicareNum;
		
		return clientInfo;
	}
}