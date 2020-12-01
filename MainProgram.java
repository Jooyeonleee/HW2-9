import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if (studentID == 1815060){
            System.out.println("[Student ID: "+studentID+"]");
            myfunc();
        }
        else if(studentID == 1814965) {
        	System.out.println("[Student ID: " + studentID + "]");
        	menu_1814965();
        }
        else{
            System.out.println("To be developed...\n");
        }
    }
    public void myfunc(){
        Scanner sc = new Scanner(System.in);
        int num,a,b;
        System.out.println("1. Calculate max");
        System.out.println("2. Calculate min");
        System.out.print("Enter menu number: ");
        num = sc.nextInt();
        if(num == 1){
            System.out.print("Enter two numbers to compare:");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Max value is " +max(a,b));
        }
        if(num == 2){
            System.out.print("Enter two numbers to compare:");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Min value is " +min(a,b));
        }
        return;
    }
    
    public void menu_1814965() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("1. Calculate the distance between two points in a three dimensional.");
    	System.out.println("2. Calculate the least common multiple of two numbers.");
    	System.out.print("Enter menu number: ");
    	int num = input.nextInt();
    	if(num == 1) {
    		double A[][] = new double[2][3];
    		char arr[] = {'A', 'B', 'x', 'y', 'z'};
    		String str[] = new String[2];
    		for(int i = 0, j; i < 2; i++) {
    			str[i] = arr[i] + "(";
    			for(j = 0; j < 3; j++) {
    				System.out.print("Enter " + arr[i] + "'" + arr[j+2] + ": ");
            		A[i][j] = input.nextDouble();
            		if(j != 2)
            			str[i] += A[i][j] + ", ";
            		else
            			str[i] += A[i][j] + ")";
    			}
    			System.out.println(str[i]);
    		}
    		System.out.println("=> the distance between " + str[0] + " and " + str[1] + " is " + DistanceOfTwoPoints_1814965(A[0], A[1]) + "\n");
    	}
    	else if(num == 2) {
    		do {
    			System.out.print("Enter natural number X (0 < X <= 100): ");
        		num = input.nextInt();
    		} while(num < 1 || num > 100);
    		int a;
    		do {
    			System.out.print("Enter natural number Y (0 < Y <= 100): ");
        		a = input.nextInt();
    		} while(a < 1 || a > 100);
    		System.out.println("=> the least common multiple of two numbers " + num + " and " + a + " is " + LeastCommonMultiple_1814965(num, a) + "\n");
    	}
    	return;
    }
    
    public int max(int a,int b){
        return (a>b)? a:b;
    }
    public int min(int a,int b){
        return (a<b)? a:b;
    }
    
    public double DistanceOfTwoPoints_1814965(double[] A, double[] B) {
    	return Math.sqrt(Math.pow(A[0]-B[0], 2) + Math.pow(A[1]-B[1], 2) + Math.pow(A[2]-B[2], 2));
    }
    public int LeastCommonMultiple_1814965(int x, int y) {
    	int least = x * y;
    	for(int i = y-1; i > 0; i--)
    		if((x * i) % y == 0)
    			least = x * i;
    	return least;
    }
    
}