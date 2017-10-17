
import java.awt.Color;
public class StopLight 
{
	private Color color;
	public StopLight()
	{
		color = Color.red;
	}
	public StopLight(Color color)
	{
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void changeLight()
	{
		if(color.equals(Color.red))
		{
			color = Color.green;
		}
		else if(color.equals(Color.green))
		{
			color = Color.yellow;
		}
		else
		{
			color = Color.red;
		}
	}
	public String toString()
	{
		String str = "The color of the stoplight is ";
		if(color.equals(Color.green)) 
		{
			str += "green.";
		}
		else if(color.equals(Color.yellow))
		{
			str += "yellow.";
		}
		else if(color.equals(Color.red))
		{
			str += "red.";
		}
		return str;
	}
}

