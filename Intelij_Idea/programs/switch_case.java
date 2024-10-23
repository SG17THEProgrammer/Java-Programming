import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any colour value from 1 till 6 : ");
        int colour_value= sc.nextInt();
        String colour_name="";
        switch(colour_value) {
            case 1:
                colour_name = "red";
                break;
            case 2:
                colour_name = "blue";
                break;
            case 3:
                colour_name = "green";
                break;
            case 4:
                colour_name = "pink";
                break;
            case 5:
                colour_name = "yellow";
                break;
            case 6:
                colour_name = "white";
                break;
            default:
                System.out.println("invalid");
        }
        System.out.println(colour_name);

        }
    }

