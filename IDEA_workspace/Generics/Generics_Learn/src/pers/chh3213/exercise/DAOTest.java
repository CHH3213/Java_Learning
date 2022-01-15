package pers.chh3213.exercise;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : DAOTest.java
 * @createTime : 2022/1/14 下午8:19
 * @Email :
 * @Description :
 */
public class DAOTest {
    @Test
    public void test(){
        DAO<User> userDAO = new DAO<User>();
        userDAO.save("1",new User(1,20,"jack"));
        userDAO.save("2",new User(2,19,"lack"));
        userDAO.save("3",new User(3,25,"rack"));
        System.out.println(userDAO);
        User user = userDAO.get("2");
        System.out.println(user);
        userDAO.update("1",new User(4,25,"rose"));
        System.out.println(userDAO);
        userDAO.delete("1");
        System.out.println(userDAO);
        System.out.println(userDAO.list());
    }
}
