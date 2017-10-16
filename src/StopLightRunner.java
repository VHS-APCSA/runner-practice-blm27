import java.awt.Color;
public class StopLightRunner {

	public static void main(String[] args) 
	{
		StopLight light = new StopLight(Color.green);
		light.changeLight();
		System.out.print(light);
	}
}
