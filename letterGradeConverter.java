import java.util.Scanner;

public class letterGradeConverter {

	public static void main(String[] args) {
		//scan in numbers for code
		Scanner scan = new Scanner(System.in);
		double number = 0.0;
		double gpa = 0.0;
		double gradePoints = 0.0;
		double totalNumberGrade = 0.0;
		String courseInfo = null;
		System.out.print("Enter course info separated by commas(title, credit hours, a letter grade(followed by + or - if applicable), or Q to quit : ");		





		//start loop for calculations
		while(scan.hasNext()) {

			courseInfo = scan.next();
			if(courseInfo.equals("Q")) {
				break;
			}
			//Split into array for course info
			String [] data = courseInfo.split(",");
			System.out.print(courseInfo);
			String info = data[0];
			int hours = Integer.parseInt(data[1]);
			String letter = data[2];

			
			if(letter.equals("A") || letter.equals("A+")) {
				number = 4.0;
			}
			else if(letter.equals("A-")) {
				number = 3.7;
			}
			else if(letter.equals("B+")) {
				number = 3.3;
			}
			else if(letter.equals("B")) {
				number = 3.0;
			}
			else if(letter.equals("B-")) {
				number = 2.7;
			}
			else if(letter.equals("C+")) {
				number = 2.3;
			}
			else if(letter.equals("C")) {
				number = 2.0;
			}
			else if(letter.equals("C-")) {
				number = 1.7;
			}
			else if(letter.equals("D+")) {
				number = 1.3;
			}
			else if(letter.equals("D")) {
				number = 1.0;
			}
			else if(letter.equals("D-")) {
				number = 0.7;
			}
			else if(letter.equals("F") || letter.equals("WF"))  {
				number = 0.0;
			}
			else if(letter.equals("P") || letter.equals("NP") || letter.equals("I")){
				hours = 0;
			}
			else {
				System.out.println("Invalid letter grade, enter a different value: ");
			}
			gradePoints = + number * hours;
			int totalCreditHours =+ hours;
			totalNumberGrade =+ number;
			gpa = totalNumberGrade/totalCreditHours;
			System.out.print("Enter course info separated by commas(title, credit hours, a letter grade(followed by + or - if applicable), : ");
		}
	

		System.out.print("Your gpa is: " + gpa);
		
	}


}