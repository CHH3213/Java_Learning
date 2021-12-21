
public class Grammar {
    public static void main(String[] args) {
        // //1. test identifier and variable
        // Identifier ind = new Identifier();
        // int var = ind.identifier();
        // System.out.println("var:" + var);

        // //2.整数类型
        // IntegerTest integ = new IntegerTest();
        // integ.printInteger();

        // //3.浮点
        // Floa F = new Floa();
        // F.printFlo();

        // //4. boolean
        // Boo bool = new Boo();
        // bool.judge(12);

        // // string convert test
        // ConvertTest convert = new ConvertTest();
        // convert.printString();

        // // ari
        // AriTest ari = new AriTest();
        // ari.ariPrint();

        //if else
        IfTest iftest = new IfTest();
        iftest.printIf();
    }
}
/*
 * 标识符
 * - Java 对各种变量、方法和类等要素命名时使用的字符序列称为标识符
 * - 技巧：凡是自己可以起名字的地方都叫标识符。
 * 
 * > 由 26 个英文字母大小写，0-9，_或$ 组成
 * > 数字不可以开头。
 * > 标识符不能包含空格。
 * > 不可以使用关键字和保留字，但能包含关键字和保留字。
 * > Java 中严格区分大小写，长度无限制
 * 包名：多单词组成时所有字母都小写：xxxyyyzzz
 * 类名、接口名：多单词组成时，**所有单词的首字母大写：**XxxYyyZzz
 * 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
 * 常量
 */

 /*
 变量
 1. 声明变量
 > 语法：<数据类型>  <变量名称>
 > example: int myNumber;
 
 2. 赋值
 > 语法：<变量名称> = <值>
 > example: myNumber = 100;
 
 3. 声明与赋值同时进行
 >  语法： <数据类型> <变量名> = <初始化值>
 >  int myNumber=100;
 
 > 注意，写代码时，分号（英文符号）不要漏。
 */

 class Identifier {
     public int identifier() {

         int $_s = 10;
         return $_s;
     }

 }

/*
 * 整数类型：byte(1字节）、short（2字节）、int（4字节）、long（8字节)
 */

 class IntegerTest{
     public void printInteger(){
        System.out.println("byte size:"+Byte.SIZE);
        // TODO:int大小如何输出
        // System.out.println("int size:"+ Integer.SIZE);
        System.out.println("short size:"+Short.SIZE);
        System.out.println("long size:"+Long.SIZE);

     }
 }


class Floa {
     public void printFlo() {
         // float
         System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
         System.out.println("包装类：java.lang.Float");
         System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
         System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
         System.out.println();

         // double
         System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
         System.out.println("包装类：java.lang.Double");
         System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
         System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
         System.out.println();
     }
 }


class Boo{
    static boolean flag = false;
    public void judge(int x){
        if(x>10){
            flag=true;
        }
        else{
            flag = false;
        }
        if (flag){
            System.out.println("flag :" + flag);
        }
        else{
            System.out.println("flag not true :" + flag);

        }
    }
}


class ConvertTest{
    static String str = "523213haha";
    public void printString(){
        int a = 10000;
        str = str+a;
        System.out.println(str);
        System.out .println(3+4+"Hello!"); //输出：7Hello!
        System.out.println("Hello!"+3+4); //输出：Hello!34
        System.out.println('a'+1+"Hello!"); //输出：98Hello!
        System.out.println("Hello"+'a'+1); //输出：Helloa1
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b); // 输出：-128
        short s= 5;
        s = (short)(s-1); //right
        // s = s-1; //wrong
        System.out.println(s); 
        char [] data = {'a'};
        String s2 = new String(data);
        char c = 'a';
        int i = 5;
        float d = .314F;
        double result = c+i+d; //判断：yes
        System.out.println(result); // 输出：Helloa1
        System.out.println('*'+'\t'+'*'); // 输出：93
        System.out.println('*'+'\t'+"*"); // 输出：51*
        System.out.println('*'+('\t'+"*")); // 输出：*     *
        System.out.println(123+""); // 输出：字符串123  与"123"等价      

    }
}


class AriTest{
    public void ariPrint(){
        // int a=2;
        // System.out.println(++a);//3
        // System.out.println(a++);//3
        // System.out.println(a--);//4
        // System.out.println(--a);//2
        // System.out.println("5+5="+5+5);
        // int x = 3510;
        // x = x / 1000 * 1000;
        // System.out.println(x);

        // short s = 3;
        // s+=2;
        // System.out.println(s);  //编译正确：5
        // int i = 1;
        // i *= 0.1;
        // System.out.println(i);// 0
        // i++;
        // System.out.println(i);// 1
        // int m = 2;
        // int n = 3;
        // n *= m++;
        // System.out.println("m=" + m); //3
        // System.out.println("n=" + n); //6
        // int n1 = 10;
        // n1 += (n1++) + (++n1);
        // System.out.println(n1); //32
        // int x = 1;
        // int y = 1;
        // if (x++ == 2 & ++y == 2) {
        //     x = 7;
        // }
        // System.out.println("x=" + x + ",y=" + y); //2,2

        // int x2 = 1, y2 = 1;
        // if (x2++ == 2 && ++y2 == 2) {
        //     x2 = 7;
        // }
        // System.out.println("x=" + x2 + ",y=" + y2); //2,1

        // int x3 = 1, y3 = 1;
        // if (x3++ == 1 | ++y3 == 1) {
        //     x3 = 7;
        // }
        // System.out.println("x=" + x3 + ",y=" + y3); //7,2
        // int x4 = 1, y4 = 1;
        // if (x4++ == 1 || ++y4 == 1) {
        //     x4 = 7;
        // }
        // System.out.println("x=" + x4 + ",y=" + y4); //7,1

        // boolean x=true;
        // boolean y =false;
        // short z=42;
        // if((z++==42)&&(y=true)){
        //     System.out.println(y=true); //赋值
        //     z++;
        // }
        // if((x==false)||(++z==45))z++;
        // System.out.println("z="+z);

        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b; /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b; /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b; /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a; /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2; /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2; /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2; /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }
}

class IfTest{
    public void printIf(){
        boolean b = true;
        // 如果写成if(b=false)能编译通过吗？如果能，结果是？
        if (b == false)
            System.out.println("a");
        else if (b)
            System.out.println("b");
        else if (!b)
            System.out.println("c");
        else
            System.out.println("d");
    }




}
