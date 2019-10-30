import java.util.Scanner;

public class E59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an angle value of the direction you are heading: ");
		double angle = scan.nextDouble();
		double angle2 = 0;
		double angle3 = 22.5;
		double angle4 = 67.5;
		double angle5 = 112.5;
		double angle6 = 157.5;
		double angle7 = 202.5;
		double angle8 = 247.5;
		double angle9 = 292.5;
		double angle10 = 337.5;
		double angle11 = 360.5;
		

		if (angle > angle2 && angle <= angle3)
		{
			System.out.println("north (N)");
		}
		else if(angle > angle3 && angle < angle4)
		{
			System.out.println("northeast (NE) ");
		}
		else if(angle >= angle4 && angle <= angle5)
		{
			System.out.println("east (E) ");
		}
		else if(angle > angle5 && angle < angle6)
		{
			System.out.println("southeast (SE) ");
		}
		else if(angle >= angle6 && angle <= angle7)
		{
			System.out.println("south (S)");
		}
		else if(angle > angle7 && angle < angle8)
		{
			System.out.println("southwest (SW)");
		}
		else if(angle >= angle8 && angle <= angle9)
		{
			System.out.println("west (W)");
		}
		else if(angle > angle9 && angle < angle10)
		{
			System.out.println("northwest (NW)");
		}
		else if(angle >= angle10 && angle <= angle11)
		{
			System.out.println("north (N)");
		}
		else
		{
			System.out.println("Are you lost?");
		}
	}

}
