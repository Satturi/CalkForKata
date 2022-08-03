import java.util.Scanner;

public class MainLati {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String [] str1_s = str1.split(" ", 3);
        //for (String element: str1_s){
        //    System.out.println(element);
        //}



        int firstNumber = Integer.parseInt(str1_s[0]);
        String operation = str1_s[1];
        int secondNumber = Integer.parseInt(str1_s[2]);

        switch (operation)
        {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":

                if (secondNumber == 0)
                {
                    System.out.println("Yuo Durak?");
                }
                else
                    System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Введено не верное действие <(-_-)>");
                break;
        }

    }
}
