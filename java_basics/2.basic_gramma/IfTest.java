import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {
        // Scanner
        System.out.print("please input your caipiao number(10~99):");
        Scanner scan = new Scanner(System.in);
        
        // caipiao definate
        int cai_piao = (int)(Math.random()*90+10);
        //input number
        System.out.print("your guess caipiao number is:" );
        int guess_caipiao = scan.nextInt();
        int guess_caipiao01 = guess_caipiao % 10;
        int guess_caipiao10 = guess_caipiao / 10;
        int caipiao01 = cai_piao % 10;
        int caipiao10 = cai_piao / 10;

        if (guess_caipiao==cai_piao){
            System.out.println("you have gotten $10000!");
        }
        else if (guess_caipiao01 == caipiao10 && guess_caipiao10 == caipiao01) {
            System.out.println("you have gotten $3000!");
        }
        else if (guess_caipiao01 == caipiao01 || guess_caipiao10 == caipiao10) {
            System.out.println("you have gotten $1000!");
        }
        else if (guess_caipiao01 == caipiao10 || guess_caipiao10 == caipiao01) {
            System.out.println("you have gotten $500!");
        }
        else{
            System.out.println("you have gotten $0!");

        }
        System.out.println("the choosen caipiao number is:" + cai_piao);

    }
}

