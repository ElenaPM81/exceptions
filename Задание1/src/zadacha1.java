import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {

        float num = readFloatFromUser();
        System.out.println("Введеное число:" + num);
    }
    public static float readFloatFromUser(){

        Scanner scan = new Scanner(System.in);
        float num;


        while (true){
            System.out.println("Введите дробное число: ");

            if(scan.hasNextFloat()) {
                num = scan.nextFloat();
                break;
            }
                else
                {
                    System.out.println("Внимание, ошибка!");
                    System.out.println("Повторите ввод!");
                    scan.nextLine();
                }

            }
        return  num;
        }
}
