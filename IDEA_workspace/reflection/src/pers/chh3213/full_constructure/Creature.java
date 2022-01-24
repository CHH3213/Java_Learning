package pers.chh3213.full_constructure;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : Creature.java
 * @createTime : 2022/1/23 11:20
 * @Email :
 * @Description :
 */
public abstract class Creature<T> implements Serializable {
    private char gender;
    public double weight;
    private void breath(){
        System.out.println("呼吸");
    }

    public void eat(){
        System.out.println("吃东西");
    }
}
