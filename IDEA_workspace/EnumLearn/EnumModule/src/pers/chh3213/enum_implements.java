package pers.chh3213;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : EnumLearn
 * @Package : pers.chh3213
 * @FileName : enum_implements.java
 * @createTime : 2022/1/10 上午9:23
 * @Email :
 * @Description :
 *  * 使用enum关键字定义枚举类
 *  * 说明：定义的枚举类默认继承于java.lang.Enum类
 *  *
 *  * 四、使用enum关键字定义的枚举类实现接口的情况
 *  *   情况一：实现接口，在enum类中实现抽象方法
 *  *   情况二：让枚举类的对象分别实现接口中的抽象方法
 *
 */
public class enum_implements {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //values():返回所有的枚举类对象构成的数组
        Season1[] values = Season1.values();
        for(int i = 0;i < values.length;i++){
            System.out.println(values[i]);
            values[i].show();
        }

        //valueOf(String objName):返回枚举类中对象名是objName的对象。
        Season1 winter = Season1.valueOf("WINTER");
        winter.show();
    }
}

interface Info{
    /**
     *
     */
    void show();
}

//使用enum关键字枚举类
enum Season1 implements Info{
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","春暖花开"){
//        @Override
//        public void show() {
//            System.out.println("一元复始、万物复苏");
//        }
    },
    SUMMER("夏天","夏日炎炎"){
//        @Override
//        public void show() {
//            System.out.println("蝉声阵阵、烈日当空");
//        }
    },
    AUTUMN("秋天","秋高气爽"){
//        @Override
//        public void show() {
//            System.out.println("天高气清、金桂飘香");
//        }
    },
    WINTER("冬天","冰天雪地"){
//        @Override
//        public void show() {
//            System.out.println("寒冬腊月、滴水成冰");
//        }
    };

    //2.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器,并给对象属性赋值
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.其他诉求1：提供toString()
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节。");
    }
}

