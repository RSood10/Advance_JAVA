/*Create a class TravelAgencies with below attributes:
regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice 
and agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return 
the highest package price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, 
int parameter regNo and String parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : 
Same Travel agency can have more than one package type. Travel agency and package type combination is unique. 
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned object.
The AgencyName and price should be concatinated with : while printing.
*/
import java.util.Scanner;

class solutionA
{
	public static void main(String args[])
	{
		TravelAgencies[] arr = new TravelAgencies[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			 int regNo = sc.nextInt();sc.nextLine();
			 String agencyName = sc.nextLine();
			 String pakageType = sc.nextLine();
			 int price = sc.nextInt();sc.nextLine();
			 boolean flightFacility = sc.nextBoolean();
			 
			 arr[i] = new TravelAgencies( regNo, agencyName, pakageType, price, flightFacility);
		}
		int sregno = sc.nextInt();sc.nextLine();
		String sptype = sc.nextLine();
		
		System.out.println(findAgencyWithHighestPackagePrice(arr));
		int k = agencyDetailsforGivenIdAndType(arr,sregno,sptype);
		if(k>0)
			System.out.print(arr[k].getaname()+" : "+arr[k].getprice());
		else
			System.out.print("Not-Found");
	}
	static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr)
	{
		int hprice = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(hprice<arr[i].getprice())
			{
				hprice = arr[i].getprice();
			}
		}
		return hprice;
	}
	static int agencyDetailsforGivenIdAndType(TravelAgencies[] arr,int sregno,String sptype)
	{
		int p = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(sregno == (arr[i].getregno()) && sptype.equalsIgnoreCase(arr[i].getpack()))
			{
				p = i;
			}
		}
		return p;
	}
}
class TravelAgencies
{
	private int regNo ;
	private String agencyName ;
	private String packageType ;
	private int price;
	private boolean flightFacility ;
	
	TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility)
	{
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	public int getregno()
	{
		return this.regNo;
	}
	public String getpack()
	{
		return this.packageType;
	}
	public int getprice()
	{
		return this.price;
	}
	public String getaname()
	{
		return this.agencyName;
	}
}