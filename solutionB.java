/*
Create a class NavalVessel with the below attributes:
vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String
classification – String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. 
The method will return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets 
the percentage requirement as mentioned below.The percentage for each navalVessel is 
calculated as percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage 
is greater than or equal to the percentage passed as the parameter, then those objects should participate in 
the average calculation. If there are no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. 
The method will return the NavalVessel object, if the input String parameter matches with the purpose attribute of the 
NavalVessel object. Before returning the object, the classification should be derived as mentioned below. 
This classification value should be assigned to the object before returning. If any of the above conditions are not met, 
then the method should return null. The classification attribute should be calculated based on the 
percentage calculation mentioned above. If the percentage = 100 then classification should be ‘Star’,
if percentage is between 99 and 80 then classification should be ‘Leader, if percentage is between 79 and 55 then 
classification should be ‘Inspirer otherwise the classification should be ‘Striver’ If the returned value is null 
then it should print 'No Naval Vessel is available with the specified purpose'.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects 
referring attributes in the above mentioned attribute sequence (except the classification attribute). 
Next, read the value for percentage and purpose.
*/
import java.util.Scanner;
class solutionB
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		NavalVessel[] arr = new NavalVessel[2];
		for(int i=0;i<arr.length;i++)
		{
				 int vesselld = sc.nextInt();sc.nextLine();
				 String vesselName = sc.nextLine();
				 int noOfVoyagesPlanned = sc.nextInt();sc.nextLine();
				 int noOfVoyagesCompleted =sc.nextInt();sc.nextLine();
				 String purpose = sc.nextLine();
				 
				 arr[i] = new NavalVessel(vesselld,vesselName,noOfVoyagesPlanned,noOfVoyagesCompleted,purpose);
		}
		int per = sc.nextInt();sc.nextLine();
		String pur = sc.nextLine();
		
		System.out.println(findAvgVoyagesByPct(arr,per));
		System.out.println();
		NavalVessel nv = findVesselByGrade(arr,pur);
		System.out.print(nv.getclassification());
	}
	static int findAvgVoyagesByPct(NavalVessel[] arr,int per)
	{
		int c =0,calp=0,total =0;
		for(int i=0;i<arr.length;i++)
		{
			calp = (arr[i].getvcomp()*100)/arr[i].getvplan();
			if(per<=calp)
			{c++;
			total +=calp;
			}
			calp = 0;
		}
		return total;
	}
	static NavalVessel findVesselByGrade(NavalVessel[] arr,String pur)
	{
		int calp=0;
		int type=0;
		for(int i=0;i<arr.length;i++)
		{
			if(pur.equals(arr[i].getpurpose()))
			{
				calp = (arr[i].getvcomp()*100)/arr[i].getvplan();
				if(calp == 100)
					arr[i].setclass(calp);
				else if(calp >80 && calp<=99)
					arr[i].setclass(calp);
				else if(calp >=79 && calp<=55)
					arr[i].setclass(calp);
				else if(calp >=0 && calp<=55)
					arr[i].setclass(calp);
				return arr[i];
			}
			
		}return null;
		
	}
}
class NavalVessel
{
	private int vesselld ;
	private String vesselName ;
	private int noOfVoyagesPlanned ;
	private int noOfVoyagesCompleted ;
	private String purpose ;
	private int classification ;
	
	NavalVessel(int vesselld,String vesselName,int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose )
	{
		this.vesselld = vesselld;
		this.vesselName = vesselName;
		this.noOfVoyagesPlanned = noOfVoyagesPlanned;
		this.noOfVoyagesCompleted = noOfVoyagesCompleted;
		this.purpose = purpose;
	}
	public int getvesselld()
	{
		return this.vesselld ;
	}
	public String getvesslename()
	{
		return this.vesselName ;
	}
	public int getvplan()
	{
		return this.noOfVoyagesPlanned ;
	}
	public int getvcomp()
	{
		return this.noOfVoyagesCompleted ;
	}
	public String getpurpose()
	{
		return this.purpose = purpose;
	}
	public int getclassification()
	{
		return this.classification ;
	}
	public void setclass(int cla)
	{
		this.classification = cla;
	}
	
}