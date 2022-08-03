import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world!");
        Person person1 =new Person();
        person1.age = 50;
        System.out.println("Скажи как меня зовут - ");
        String name1 = in.nextLine();

        System.out.println("Скажи сколько мне лет - ");
        int age1 = in.nextInt();

        person1.setNameAndAge(name1, age1);

        person1.speak();
        int years1=person1.calculateYearsToRetiremrnt();
        System.out.println("До пенсии осталось прожить "+years1+" лет.");

        Roman[] values = Roman.values();
        System.out.println(values[1]);
        in.close();




    }
}
class Person{
    String name;
    int age;
    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    int calculateYearsToRetiremrnt(){
        int years = 65-age;
        return years;
    }
    void speak(){
        System.out.println("Меня зовут "+ name +",мне "+ age +" лет.");
    }
}