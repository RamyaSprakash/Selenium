package tostring;

public class Battery {
int currentcapacity;
Battery(int currentcapacity)
{
	this.currentcapacity=currentcapacity;
}
void charging(int n)
{
	System.out.println("charging!!!!!!!!!!!!!!!!!!!!!");
	currentcapacity+=n;
}
void discharging(int n)
{
	System.out.println("discharging-------------------------------");
	currentcapacity-=n;
}

public String toString()
{
	return "Battery[currentcapacity= "+currentcapacity + " % ]";
	
}
}
