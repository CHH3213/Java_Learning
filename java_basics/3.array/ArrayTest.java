import java.util.Scanner;
public class ArrayTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("please input the number of students: ");
        int n;
        for (;;) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("input wrong, please input again:");
            }    
        }
        int[] grades = new int[n];
        System.out.println("please input the "+n+" students'grades, respectively:");
        for (int i = 0; i < grades.length; i++) {
            for (;;) {
                String str = readKeyBoard(4);
                try {
                    grades[i] = Integer.parseInt(str);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("input wrong, please input again:");
                }
            } 
        }
        int max = 0;
        for (int i : grades) {
            if (i>max){
                max = i;
            }
        }
        System.out.println("the highest score is: "+max);
        for (int i = 0; i < grades.length; i++){
            if (grades[i]>max-10){
                System.out.println("student "+i+" score is "+grades[i]+"\t grade is " +"A");
            }
            else if (grades[i] > max - 20) {
                System.out.println("student " + i + " score is " + grades[i] + "\t grade is " + "B");
            }
            else if (grades[i] > max - 30) {
                System.out.println("student " + i + " score is " + grades[i] + "\t grade is " + "C");
            }
            else{
                System.out.println("student " + i + " score is " + grades[i] + "\t grade is " + "D");
            }
        }
    }
    
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input length (not greater than" + limit + ")input wrong, please input again:");
                continue;
            }
            break;
        }

        return line;
    }
}
