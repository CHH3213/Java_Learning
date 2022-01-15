package pers.chh3213;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : EnumLearn
 * @Package : pers.chh3213
 * @FileName : ColorExercise.java
 * @createTime : 2022/1/10 上午11:01
 * @Email :
 * @Description :
 */
public class ColorExercise {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red.toString());
        red.meaning();
        red.reflectColor();
    }

}

enum Color implements Meaning, Works{
    RED(255,0,0){
        @Override
        public void meaning() {
            System.out.println("红色");
        }
        @Override
        public void reflectColor() {
            System.out.println("反射红色");
        }
    },
    BLUE(0,0,255){
        @Override
        public void meaning() {
            System.out.println("蓝色");
        }
        @Override
        public void reflectColor() {
            System.out.println("反射蓝色");
        }
    },
    YELLOW(255,255,0){
        @Override
        public void meaning() {
            System.out.println("黄色");
        }
        @Override
        public void reflectColor() {
            System.out.println("反射黄色");
        }
    },
    GREEN(0,255,0){
        @Override
        public void meaning() {
            System.out.println("绿色");
        }

        @Override
        public void reflectColor() {
            System.out.println("反射绿色");
        }
    };
    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    private Color(int redValue, int greenValue,int blueValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue=greenValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}

interface Meaning{
    public void meaning();
}


interface Works{
    public void reflectColor();
}