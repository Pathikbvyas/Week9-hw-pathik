import java.util.Scanner;

/*2.	Re write the student mark sheet programme using if else and while loop.
 */
public class Prgramme2_StudentMarksheet {
    public static void main(String[] args) {

        //scanner declartion for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter student name:");
        String name = scanner.next();
        System.out.println("\nEnter student roll number:");
        int rollNumber = scanner.nextInt();
        System.out.println("\nEnter the marks of subject maths:");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("\nEnter the marks of subject Science:");
        int marksScinece = scanner.nextInt();
        while (marksScinece < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid input,Marks should between 0 to 100 ");
            System.out.println("\n PLease enter correct marks");
            marksScinece = scanner.nextInt();
        }
        System.out.println("\nEnter the marks of subject English :");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input,Marks should between 0 to 100");
            System.out.println("\nplease enter correct marks:");
            englishMarks = scanner.nextInt();
        }
        int total = sum(marksScinece, mathsMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = String.valueOf(calculateResult(mathsMarks, marksScinece, englishMarks));
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNumber, mathsMarks, marksScinece, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculate the result on subject marks
    public static String calculateResult(int mathmarks, int marksScience, int englishMarks) {
        if (mathmarks < 35 || marksScience < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;

    }

    // printing the marksheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}

