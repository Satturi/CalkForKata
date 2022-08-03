
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("\n///   ОБЯЗАТЕЛЬНО К ПРОЧТЕНИЮ!!!   ///\n\n" +
                "Условия использования программы.\n\n"+
                "1\t-\tПрограмма выполняет операции + - * / с двумя числами;\n"+
                "2\t-\tПрограмма работает единовременно только c одним видом систем исчисленпия" +
                "\n\t\t* и только с целыми числами в них от 1 до 10 или с аналагом их в римской системе исчисления" +
                "\n\t\t* программа принемает римские числа только прописанные в верхнем регистре;\n" +
                "3\t-\tЗапись мат.выражения начинается с первого члена мат.выражения, " +
                  "\n\t\tдалее через пробел указывается желаемая проводимая над ним операция, " +
                  "\n\t\tдалее - пробел и указывается последий член мат.выражения;\n" +
                "\n" +
                "Введи мат.выражение:");

        String [] romanNumerals = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};                 //*массив для последуещей поверики на принадлежность чилел к системе исчесления
        List<String> romanList = new ArrayList<>(Arrays.asList(romanNumerals));                         //*инструмент для этого
        String [] arabNumerals = {"1","2","3","4","5","6","7","8","9","10"};
        List<String> arabList = new ArrayList<>(Arrays.asList(arabNumerals));

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String[] str1_s = str1.split(" ", 3);





        Roman[] valuesRoman = Roman.values();

        ConvertRomanToArab convertfirst = new ConvertRomanToArab();              //**создание обьекта ConvertRomanToArab для конвертации присвоенных в дальнейшем к ним чисел из рим в араб -> в int
        ConvertRomanToArab convertsecond = new ConvertRomanToArab();
        try {
            convertfirst.first1Number = str1_s[0];                               //**присвоение
            convertsecond.first1Number = str1_s[2];
            convertfirst.convert();
            convertsecond.convert();

            int firstNumber = Integer.parseInt(convertfirst.first1Number);        //**непосредствено конвертация араб в int
            String operation = str1_s[1];
            int secondNumber = Integer.parseInt(convertsecond.first1Number);
            int otvet = 1000;

            if (firstNumber < 1 || secondNumber < 1 || firstNumber > 10 || secondNumber > 10) {
                System.out.println("Не соблюдено условие программы!\tПрограмма завершена.");
                System.exit(0);
            }


            switch (operation) {
                case "+" -> otvet = firstNumber + secondNumber;
                case "-" -> otvet = firstNumber - secondNumber;
                case "*" -> otvet = firstNumber * secondNumber;
                case "/" -> otvet = firstNumber / secondNumber;
                default -> {System.out.println("Не соблюдено условие программы!\tПрограмма завершена.");System.exit(0);}
            }


            if (romanList.contains(str1_s[0])&&romanList.contains(str1_s[2])){                                //*непосредственно проверка на принадлежность
                System.out.println("Ответ: " + valuesRoman[otvet - 1]);}
            else if (arabList.contains(str1_s[0])&&arabList.contains(str1_s[2]))
                System.out.println("Ответ: " + otvet);
            else {System.out.println("Не соблюдено условие программы!\tПрограмма завершена.");System.exit(0);}

        }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Не соблюдено условие программы!\tПрограмма завершена.");
        }



    }
}


class ConvertRomanToArab {                                     //**конвертация рим.цифр в араб. для дальнейшей конвертации в int
    String first1Number;

    void convert() {

        switch (first1Number) {
            case "I" -> first1Number = "1";
            case "II" -> first1Number = "2";
            case "III" -> first1Number = "3";
            case "IV" -> first1Number = "4";
            case "V" -> first1Number = "5";
            case "VI" -> first1Number = "6";
            case "VII" -> first1Number = "7";
            case "VIII" -> first1Number = "8";
            case "IX" -> first1Number = "9";
            case "X" -> first1Number = "10";
            default -> first1Number = first1Number;
        }
    }
}