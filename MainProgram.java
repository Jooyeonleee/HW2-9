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
    public int max(int a,int b){
        return (a>b)? a:b;
    }
    public int min(int a,int b){
        return (a<b)? a:b;
    }
}
