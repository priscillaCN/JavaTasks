public class TaskThree {

	public static void main(String[] args) {

		int length = 10;
		double area = (Math.sqrt(3) / 4) * (length * length);
		double volume = area * length;

		System.out.printf("The volume of an equilateral triangle with length %dcm and area %.2fcm^2 is %.2fcm^3", length, area, volume);	

	}

}