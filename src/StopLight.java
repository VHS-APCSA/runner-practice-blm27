
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

}
