package pers.chh3213.exercise;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.exercise
 * @ClassName : ExamTest.java
 * @createTime : 2022/1/21 15:28
 * @Email :
 * @Description :
 */
public class ExamTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("exam.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //写入试题
        writeFile(file);
        //读取试题并作答
        readFile(file);
        
    }

    /**
     * 写入试题
     * @param file
     */
    public static void writeFile(File file){
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            String s = "(1)北京奥运是什么时间开幕的？\n" +
                    "   A.2008-08-08  B. 2008-08-01 \n" +
                    "C.2008-10-01 D. 2008-07-08\n" +
                    "********************\n" +
                    "(2)下列哪个国家不属于亚洲？\n" +
                    "   A.沙特  B.印度 C.巴西  D.越南\n" +
                    "********************\n" +
                    "(3)下列哪个国家最爱足球？\n" +
                    "   A.刚果  B.越南 C.老挝  D.巴西\n" +
                    "********************\n" +
                    "(4)下列哪种动物属于猫科动物？\n" +
                    "   A.鬣狗  B.犀牛 C.大象 D.狮子\n" +
                    "********************\n";
            fw.write(s);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try{
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 读取试题
     * @param file
     */
    public static void readFile(File file){
        FileReader fr = null;
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        StringBuffer result = new StringBuffer();//存储用户输入的答案
        String answer = "ABCD"; //假设四题的标准答案
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String s;
            while((s= br.readLine())!=null){
                if(!s.startsWith("*")){
                    System.out.println(s);
                }else{
                    System.out.println("输入选择的答案（A、B、C、D）：");
                    result.append(scanner.next().charAt(0));
                }
            }
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(br!=null){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            int score=0;
            for (int i = 0; i < result.length(); i++) {
                if(result.charAt(i)==answer.charAt(i)){
                    score+=25;
                }

            }
            System.out.println("得分："+score);
        }
    }
}
