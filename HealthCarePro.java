//*********************************************************************
//HealthCarePro.java CS2043 Proj1
// Represents a user of health monitering system
//********************************************************************

public class HealthCarePro extends User
{
	protected String medicalIdNumber;
	
	//Constructor to set up Health Care Professional with specified information
	
	public HealthCarePro(String uName, String uEmail, String uPhoneNum, String medid)
	{
	
		super(uName, uEmail, uPhoneNum);
		
		medicalIdNumber = medid;
	}
	
	
	//Returns info about Health Care Professional
	
	public String toString()
	{
		String hcpInfo = super.toString();
		
		hcpInfo += "Medical Id Number: " + medicalIdNumber;
		
		return hcpInfo;
	}
	
	
	
	//Returns what is displayed on messages sent to other users
	
	public String nameString()
	{
		String hcpName = super.nameString "/n" + "Medical id number: " + this.medicalIdNumber;
		
		return hcpName;
			
	}
}
//Returns what is displayed on messages sent to other users
	
	public String nameString()
	{
		String senderName = name;
		
		senderName += "Message from: " + name;



