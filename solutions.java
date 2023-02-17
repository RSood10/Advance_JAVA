
import java.util.Scanner;
public class solutions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		Motel[] m = new Motel[no];
		
		for(int i=0;i<no;i++)
		{
			int motelid = s.nextInt();s.nextLine();
			String motelName = s.nextLine();
			String dateofBooking = s.nextLine();
			int noofRoomsBooked = s.nextInt();s.nextLine();
			String cabFacility = s.nextLine();
			double totalBill = s.nextDouble();s.nextLine();
			m[i] = new Motel(motelid,motelName,dateofBooking,noofRoomsBooked,cabFacility,totalBill);
		}
		String cabFacilityPresent = s.nextLine();
		System.out.print(totalNoOfRoomsBooked(m,cabFacilityPresent));
		s.close();
	}
	
	public static int totalNoOfRoomsBooked(Motel[] m,String cabFacilityPresent)
	{
		int c = 0;
		for(int i=0;i<m.length;i++)
		{
			if(m[i].getcabF().equals(cabFacilityPresent))
			{
				if(m[i].getroom()>5)
				{
					c++;
				}
			}
		}
		if(c>1)
			return c;
		else
			return 0;
	}
}
class Motel
{
	private int motelid;
	private String motelName;
	private String dateofBooking;
	private int noofRoomsBooked;
	private String cabFacility;
	private double totalBill;
	
	public Motel(int motelid,String motelName,String dateofBooking,int noofRoomsBooked,String cabFacility,double totalBill)
	{
		this.motelid = motelid;
		this.motelName = motelName;
		this.dateofBooking = dateofBooking;
		this.noofRoomsBooked = noofRoomsBooked;
		this.cabFacility = cabFacility;
		this.totalBill = totalBill;
	}
	public String getcabF()
	{
		return this.cabFacility;
	}
	public int getroom()
	{
		return this.noofRoomsBooked;
	}
	public String getDateofBooking() {
		return dateofBooking;
	}
}

