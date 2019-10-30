import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an angle value of the direction you are heading: ");
		double angle = scan.nextDouble();


		if (angle > 0 && angle <= 22.5)
		{
			System.out.println("north (N)");
		}
		else if(angle > 22.5 && angle < 67.5)
		{
			System.out.println("northeast (NE) ");
		}
		else if(angle >= 67.5 && angle <= 112.5)
		{
			System.out.println("east (E) ");
		}
		else if(angle > 112.5 && angle < 157.5)
		{
			System.out.println("southeast (SE) ");
		}
		else if(angle>=157.5 && angle<=202.5)
		{
			System.out.println("south (S)");
		}
		else if(angle>202.5 && angle<247.5)
		{
			System.out.println("southwest (SW)");
		}
		else if(angle>=247.5 && angle<=292.5)
		{
			System.out.println("west (W)");
		}
		else if(angle > 292.5 && angle < 337.5)
		{
			System.out.println("northwest (NW)");
		}
		else if(angle >= 337.5 && angle <= 360.5)
		{
			System.out.println("north (N)");
		}
		else
		{
			System.out.println("Are you lost?");
		}
	}

}
