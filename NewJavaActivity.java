package dreiJAva;

public class NewJavaActivity {

	public static void main(String[] args) {
		  int numbers[][] = {
		            {100, 200, 300, 400},
		            {10, 20, 30, 40},
		            {1, 2, 3, 4},
		            {5, 15, 30, 90}
		        };

		       
		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = 0; j < numbers[i].length; j++) {
		                if (numbers[i][j] == 2) {
		                    System.out.println("Number 2 is found at indices " + i + " & " + j);
		                }
		            }
		        }

		     
		        System.out.println("Current 2D Array:");
		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = 0; j < numbers[i].length; j++) {
		                System.out.print(numbers[i][j] + " ");
		            }
		            System.out.println();
		        }

		     
		        int targetX = -1, targetY = -1;
		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = 0; j < numbers[i].length; j++) {
		                if (numbers[i][j] == 15) {
		                    targetX = i;
		                    targetY = j; 
		                    System.out.println("Number 15 is found at indices: " + targetX + " & " + targetY);
		                }
		            }
		        }

		     
		        if (targetX != -1) {
		            numbers[targetX][targetY] = 99;
		            System.out.println("Updated value at [" + targetX + "][" + targetY + "] to 99.");
		        }

		     
		        System.out.println("Updated 2D Array:");
		        for (int[] row : numbers) {
		            for (int val : row) {
		                System.out.print(val + " ");
		            }
		            System.out.println();
		        }
		    }

	}


