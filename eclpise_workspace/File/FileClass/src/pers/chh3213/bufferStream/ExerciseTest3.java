package pers.chh3213.bufferStream;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.bufferStream
 * @ClassName : ExerciseTest3.java
 * @createTime : 2022/1/20 10:44
 * @Email :
 * @Description :
 * 获取文本上每个字符出现的次数
 * 提示：遍历文本的每一个字符；字符及出现的次数保存在Map中；
 * 将Map中数据写入文件
 */
public class ExerciseTest3 {
    @Test
    public void test(){
        FileReader fi = null;
        BufferedWriter fo = null;
        try{
            Map<Character, Integer> map = new HashMap<>();
            File file1 = new File("hello1.txt");
            File file2 = new File("count_hello1.txt");
            fi = new FileReader(file1);
            fo =new BufferedWriter(new FileWriter(file2, false)) ;
            int len;
            char[] chars = new char[1];
            // 将字符数据统计写入map
            while((len=fi.read(chars))!=-1){
                if(map.containsKey(chars[0])){
                    map.put(chars[0],map.get(chars[0])+1);
                }else{
                    map.put(chars[0],1);
                }
            }
            //将map数据保存在txt中
            //遍历map,再写入数据
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                switch (entry.getKey()) {
                    case ' ':
                        fo.write("空格=" + entry.getValue());
                        break;
                    case '\t'://\t表示tab 键字符
                        fo.write("tab键=" + entry.getValue());
                        break;
                    case '\r'://
                        fo.write("回车=" + entry.getValue());
                        break;
                    case '\n'://
                        fo.write("换行=" + entry.getValue());
                        break;
                    default:
                        fo.write(entry.getKey() + "=" + entry.getValue());
                        break;
                }
                fo.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fi!=null){
                try{
                    fi.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fo!=null){
                try{

                    fo.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
