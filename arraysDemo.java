package demo;

public class arraysDemo {

	public static void main(String[] args) {
		// Single Dimensional array

		int[] ages = new int[5]; // An Array declaration of size 5.

		ages[0] = 12;
		ages[1] = 14;
		ages[2] = 22;
		ages[3] = 13;
		ages[4] = 34;

		// test the contents
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}

		

		System.out.println("\n\nMulti dimemnsional array of 3 x 2 size");
		String[][] names = new String[3][2];
		names[0][0] = "Asha";
		names[0][1] = "Akshay";
		names[1][0] = "Sudha";
		names[1][1] = "Palani";
		names[2][0] = "Shakel";
		names[2][1] = "Robert";

		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[0].length; j++) {

				System.out.println("names at i=" + i + ",j=" + j + " is " + names[i][j]);

			}

		}
	}

}
