package equals;

public class Clock {
int hour;
int minute;
int second;
public Clock(int hour,int minute,int second)
{
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
public boolean equals(Object o)
{
	Clock c=(Clock)o;
	return this.hour==c.hour && this.minute==c.minute && this.second==c.second;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Clock c1=new Clock(2,26,51);
Clock c2=new Clock(2,26,51);
if(c1.equals(c2)) {
	System.out.println("both clocks are showing the same time");
}
	else 
	{
		System.out.println("both clocks are not showing the same time");
	}
}
	}


