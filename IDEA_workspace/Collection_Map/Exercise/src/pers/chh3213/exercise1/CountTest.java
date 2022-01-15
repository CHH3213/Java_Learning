package pers.chh3213.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise1
 * @FileName : CountTest.java
 * @createTime : 2022/1/13 上午9:46
 * @Email :
 * @Description :
 */
public class CountTest {
    public static void main(String[] args) {
        try {
            File file = new File("/home/chh3213/chh_coding/Java_Learning/IDEA_workspace/Collection_Map/Exercise/src/pers/chh3213/exercise1/keyWords.txt");
            Scanner scanner = new Scanner(file);
            HashSet hashSet = new HashSet();

            while(scanner.hasNext()){
                String word = scanner.next();
                hashSet.add(word);
                System.out.println(word);
            }
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }

    }
}
