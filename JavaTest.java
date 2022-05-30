import java.util.Random;
import java.util.Scanner;
public class JavaTest {

    static Scanner sc= new Scanner(System.in);
    private static String[] father = new String[3];
    private static String[] mother = new String[3];
    private static byte input;

    public static void main(String[] args) {
        Random rn = new Random();
        Father();
        Mother();
        int n;
        int moth = 0;
        int fath = 0;
        String skin;
        String eye;
        String hair;
         n = rn.nextInt(2) + 1;
        if(n==1) {
            skin = father[0];
            fath++;
        }
        else {
            skin = mother[0];
            moth++;
        }

        n = rn.nextInt(2) + 1;
        if(n==1) {
            eye = father[1];
            fath++;
        }
        else {
            eye = mother[1];
            moth++;
        }

        n = rn.nextInt(2) + 1;
        if(n==1) {
            hair = father[2];
            fath++;
        }
        else {
            hair = mother[2];
            moth++;
        }

        System.out.println("Child: ");
        System.out.println("skin: "+ skin);
        System.out.println("eye: "+ eye);
        System.out.println("hair: "+ hair);
        System.out.println("after " + (fath > moth ? "father" : "mother"));
    }
    public static void Father(){
        System.out.println("Father skin: 1.White  2.Black");
        input = sc.nextByte();
        switch (input){
            case 1:
                father[0] = "White";
                break;
            case 2:
                father[0] = "Black";
                break;
            default:
                System.out.println("Error!");
                Father();
                break;
        }
        System.out.println("Father eye color: 1.Black  2.Blue 3.Green");
        input = sc.nextByte();
        switch (input){
            case 1:
                father[1] = "Black";
                break;
            case 2:
                father[1] = "Blue";
                break;
            case 3:
                father[1] = "Green";
                break;
            default:
                System.out.println("Error!");
                Father();
                break;
        }
        System.out.println("Father hair type: 1.curly  2.wavy 3.straight");
        input = sc.nextByte();
        switch (input){
            case 1:
                father[2] = "Curly";
                break;
            case 2:
                father[2] = "Wavy";
                break;
            case 3:
                father[2] = "Straight";
                break;
            default:
                System.out.println("Error!");
                Father();
                break;
        }
        System.out.println("-----------------------------------------");
    }
    public static void Mother(){
        System.out.println("Mother skin: 1.White  2.Black");
        input = sc.nextByte();
        switch (input){
            case 1:
                mother[0] = "White";
                break;
            case 2:
                mother[0] = "Black";
                break;
            default:
                System.out.println("Error!");
                Mother();
                break;
        }
        System.out.println("Mother eye color: 1.Black  2.Blue 3.Green");
        input = sc.nextByte();
        switch (input){
            case 1:
                mother[1] = "Black";
                break;
            case 2:
                mother[1] = "Blue";
                break;
            case 3:
                mother[1] = "Green";
                break;
            default:
                System.out.println("Error!");
                Mother();
                break;
        }
        System.out.println("Mother hair type: 1.curly  2.wavy 3.straight");
        input = sc.nextByte();
        switch (input){
            case 1:
                mother[2] = "Curly";
                break;
            case 2:
                mother[2] = "Wavy";
                break;
            case 3:
                mother[2] = "Straight";
                break;
            default:
                System.out.println("Error!");
                Mother();
                break;
        }
        System.out.println("-----------------------------------------");
    }
}
