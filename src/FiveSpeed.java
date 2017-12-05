
public class FiveSpeed {
	private int gear;
	private boolean inGear;
	public FiveSpeed()
	{
		gear = -1;
		inGear = false;
	}
	public int getGear() {
		return gear;
	}
	public boolean getInGear() {
		return inGear;
	}
	public int shiftUp()
	{
		if(inGear && gear <5)
		{
			gear += 1;
		}
		else if(!inGear)
		{
			inGear = true;
			gear = 1;
		}
		return gear;
	}
	public int shiftDown()
	{
		if(inGear == true && gear >2)
		{
			gear -= 1;
		}
		else if(inGear == true && gear == 1)
		{
			inGear = false;
			gear = -1;
		}
		return gear;
	}
	
}
