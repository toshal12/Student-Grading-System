import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("********** STUDENT GRADING SYSTEM**********");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your Roll Number : ");
        int Roll = sc.nextInt();
        System.out.print("Enter Number Of Subjects : ");
        int Num_sub = sc.nextInt();
        int total = 0;
        int i;
        int Marks = 0;
        int[] subjectMarks = new int[Num_sub];
        for (i = 1; i <= Num_sub; i++) {
            System.out.print("Enter Your Marks of Subject " + i + ": ");
            Marks = sc.nextInt();
            total += Marks;
            subjectMarks[i-1]= Marks;
        }
        System.out.println(" ");
        System.out.println("Name = "+name);
        System.out.println("Roll Number = "+Roll);
        System.out.println(" ");
        for (i=1;i<=Num_sub; i++) {
            System.out.println("Mark Of Subject "+i +":"+ subjectMarks[i-1]);
        }
        int x;
        x = i - 1;
        int Grade = (int) total /x;
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage (%) = " + Grade +" %");
        if(Grade >= 80 && Grade <=100){
            System.out.println("Grade = A");
        }
        else if (Grade >= 60 && Grade <= 79) {
            System.out.println("Grade = B");
        }
        else if (Grade >= 50 && Grade <= 59) {
            System.out.println("Grade = C");
        }
        else if (Grade >= 40 && Grade <= 49) {
            System.out.println("Grade = D");
        }
        else {
            System.out.println("Grade = F");
        }
    }
}
