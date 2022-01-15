package pers.chh3213.exercise;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : Apple.java
 * @createTime : 2022/1/14 下午8:59
 * @Email :
 * @Description :
 * 开发一个泛型Apple类，要求有一个重量属性weight在测试类中实例化不同的泛型对象，
 * 要求对象a1的这一属性是String类型，对象a2的这一属性是Integer型，a3的这一属性是Double型。
 * 分别为a1，a2，a3的重量属性赋值为：”500克”，500,500.0，在测试类中通过对象调用访问器得到属性值并输出。
 * 另外思考，为什么a2和a3的属性需要是Integer和Double而不是int和double？
 */
public class Apple<T> {
    private T weight;

    public Apple(T weight) {
        this.weight = weight;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple<?> apple = (Apple<?>) o;

        return weight != null ? weight.equals(apple.weight) : apple.weight == null;
    }

    @Override
    public int hashCode() {
        return weight != null ? weight.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
