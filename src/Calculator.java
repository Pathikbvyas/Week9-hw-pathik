/*3.	Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
All methods are instance method and it doesn’t return anything. But it has two parameters with name
“int a” and “int b”. Also each method have System.out.println(). This prints the result. Also create all
one more method with name “calculateResult” with three parameter with name int a, int b and char symbol.
Write the logic in calculateResult method that when user enter first number and second number and symbol
based on symbol it does calculate.
 */
public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        char ch=0;
        Calculator calculator=new Calculator();
        calculator.calculateResul(a,b,ch);

    }

    public void addition(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
    public void substration(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public void division(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public void multiplication(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public void calculateResul(int a,int b,char ch){
        if (ch == '+') {
            System.out.println("Addition of the two numbers is  " + (a + b));
        } else if (ch == '-') {
            System.out.println( " Substraction of the Two number is:  " + (a - b));
        } else if (ch  == '*') {
            System.out.println( "Multiplication of two number is :  " + (a * b));
        } else if (ch == '/') {
            System.out.println(" Division of the two number is :" + (a/ b));

        }

    }
}