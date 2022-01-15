package pers.chh3213;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : EnumLearn
 * @Package : pers.chh3213
 * @FileName : enum_class.java
 * @createTime : 2022/1/10 上午8:54
 * @Email :
 * @Description :
 */
public class enum_class {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring.toString());
        Season[] seasons = Season.values();
        System.out.println("===================");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println("--------------------");
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer.toString());
    }
}
enum Season{
    SPRING("春天","春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天", "白雪皑皑");
    private final String SEASONNAME;//季节的名称
    private final String SEASONDESC;//季节的描述
    private Season(String seasonName,String seasonDesc){
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SEASONNAME='" + SEASONNAME + '\'' +
                ", SEASONDESC='" + SEASONDESC + '\'' +
                '}';
    }
}



