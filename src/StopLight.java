
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
		String str = "";
		if(color.equals(Color.green)) 
		{
			str = "The color of the stoplight is green.";
		}
		else if(color.equals(Color.yellow))
		{
			str = "The color of the stoplight is yellow.";
		}
		else if(color.equals(Color.red))
		{
			str = "The color of the stoplight is red.";
		}
		return str;
	}
}

