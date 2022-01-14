package pers.chh3213.exercise;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : News.java
 * @createTime : 2022/1/14 下午9:14
 * @Email :
 * @Description :
 * 封装一个新闻类News，包含新闻标题，新闻作者，新闻内容，新闻类型4个属性，
 * 提供必要的访问器和修改器方法，重写toString方法，要求打印对象时输出格式为“标题；类型；作者”，
 * 要求只要新闻标题相同就判断为同一条新闻。在测试类中创建一个只能容纳该类对象的ArrayList集合，添加三条新闻。
 * 遍历集合，打印新闻标题，将新闻标题截取字符串到10个汉字的长度。
 */
public class News<T1,T2,T3,T4> {
    private T1 title;
    private T2 author;
    private T3 contents;
    private T4 type;

    public News(T1 title, T2 author, T3 contents, T4 type) {
        this.title = title;
        this.author = author;
        this.contents = contents;
        this.type = type;
    }

    public T1 getTitle() {
        return title;
    }

    public void setTitle(T1 title) {
        this.title = title;
    }

    public T2 getAuthor() {
        return author;
    }

    public void setAuthor(T2 author) {
        this.author = author;
    }

    public T3 getContents() {
        return contents;
    }

    public void setContents(T3 contents) {
        this.contents = contents;
    }

    public T4 getType() {
        return type;
    }

    public void setType(T4 type) {
        this.type = type;
    }
    public boolean isTheSame(T1 title){
        if(this.title==title){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News<?, ?, ?, ?> news = (News<?, ?, ?, ?>) o;

        return title != null ? title.equals(news.title) : news.title == null;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    @Override
    public String toString() {
        return
                "标题：" + title +
                "； 类型：" + type +
                "； 作者：" + author;
    }
}
