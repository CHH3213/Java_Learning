package pers.chh3213.exercise;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : DAO.java
 * @createTime : 2022/1/14 下午8:03
 * @Email :
 * @Description :
 * > 定义个泛型类 `DAO<T>`，在其中定义一个 Map 成员变量，Map 的键 为 String 类型，值为 T 类型。 分别创建以下方法：
 * > `public void save(String id,T entity)`： 保存 T 类型的对象到 Map 成员 变量中
 * > ` public T get(String id)`：从 map 中获取 id 对应的对象
 * > ` public void update(String id,T entity)`：替换 map 中 key 为 id 的内容, 改为 entity 对象
 * > `public List<T> list()`：返回 map 中存放的所有 T 对象
 * > `public void delete(String id)`：删除指定 id 对象
 * 定义一个 User 类：
 * > 该类包含： private 成员变量（int 类型） id， age； （String 类型） name。
 * >  定义一个测试类： 创建 DAO类的对象， 分别调用其 save、 get、 update、 list、 delete 方 法来操作 User 对象， 使用 Junit单元测试类进行测试。
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.replace(id,entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();

        Collection<T> values = map.values();
        for(T t : values){
            list.add(t);
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }
}
