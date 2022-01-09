package pers.chh3213.string_learn.string_learn20220108;

import java.util.Arrays;
import org.junit.Test;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220108
 * @FileName : StringSort.java
 * @createTime : 2022/1/8 下午8:59
 * @Email :
 * @Description :

5、对字符串中字符进行自然顺序排序。

提示：

1）字符串变成字符数组。

2）对数组排序，选择，冒泡，Arrays.sort();

3）将排序后的数组变成字符串。

 */
public class StringSort {
    public void swap(char[] arr, int i, int j) {
        char temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    /**
     * 冒泡排序
     * @param arr
     */
    public void bubbleSort(char[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean is_swap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    is_swap = true;
                }
            }
            if(!is_swap)break; //不交换时停止排序
        }
    }

    /**
     * 选择排序
     */
    public void selectSort(char[] arr){
        for (int i = 0; i < arr.length; i++) {//进行n-1趟排序
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j])min=j; // 记录目前能找到的最小值元素的下标
            }
            // 找到最小值后，再将找到的最小值和i位置所在的值进行交换
            if(i!=min)swap(arr, i, min);
        }
    }
    @Test
    public void stringSort(){
        String str = "kjhgabcfuygtqwepo";
        char[] arr = str.toCharArray();
//        bubbleSort(arr);
//        selectSort(arr);
        Arrays.sort(arr); //Arrays.sort()方式
        String newStr = new String(arr);
        System.out.println(newStr);
    }
}
