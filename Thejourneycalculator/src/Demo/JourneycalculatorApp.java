package Demo;
import java.util.Scanner;
public class JourneycalculatorApp {
	public static void main(String[] args)
	{

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Speed And Time To Calculate Distance");

	double speed=scan.nextDouble();

	double time=scan.nextDouble();

	Journeycalculator journeyCalculator=new Journeycalculator();

	double distance=journeyCalculator.calculateDistance(speed, time);

	System.out.println(distance);

	}

	}


