import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1, num2;
        Scanner input = new Scanner(System.in);

        int ans = 0;

        while(true){

            System.out.print("Enter the operator:");
            char op = input.next().trim().charAt(0);

            System.out.print("Enter two numbers:");
            num1 = input.nextInt();
            num2 = input.nextInt();



            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){

                if (op == '+'){
                    ans = num1 + num2;
                }

                if (op == '-'){
                    ans = num1 - num2;
                }

                if (op == '*'){
                    ans = num1 * num2;
                }

                if (op == '/'){

                    if(num2 != 0){
                        ans = num1 / num2;
                    } else{
                        System.out.println("Infinity");
                    }

                }

                if (op == '%'){
                    ans = num1 % num2;
                }


            } else if(op == 'x' || op == 'X'){
                break;
            } else{
                System.out.println("Invalid Operation");
            }

            System.out.println(ans);
        }
    }
}