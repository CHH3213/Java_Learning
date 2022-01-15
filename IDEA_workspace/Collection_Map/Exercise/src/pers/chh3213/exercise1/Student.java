package pers.chh3213.exercise1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise1
 * @FileName : Student.java
 * @createTime : 2022/1/13 上午8:59
 * @Email :
 * @Description :
 */
public class Student implements Comparable{
    private String name;
    private int score;
    private int id;

    public Student(String name, int score, int id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (score != student.score) return false;
        if (id != student.id) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + score;
        result = 31 * result + id;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student student = (Student) o;
            return -Integer.compare(this.score,student.getScore());
        }else{
            throw new RuntimeException("类型不一致");
        }
    }
}
