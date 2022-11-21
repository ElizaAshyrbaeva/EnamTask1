import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dayName=new Scanner(System.in).nextLine();

        switch (dayName.toLowerCase()){
            case "monday":
                System.out.println("Java okuim");
                break;
            case "tuesday":
                System.out.println("English lesson");
                break;
            case "  wednesday":
                System.out.println("Praktica");
                break;
            case "thursday":
                System.out.println("Soft Skills");
                break;
            case " friday":
                System.out.println("Event");
                break;
            case " saturday":
                System.out.println("hks");
            case "sunday":
                System.out.println("Es aluu");
                break;
            default:
                System.out.println("Error");
        }
    }
}