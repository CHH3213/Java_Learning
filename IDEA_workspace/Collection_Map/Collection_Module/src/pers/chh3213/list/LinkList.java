package pers.chh3213.list;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.list
 * @FileName : LinkList.java
 * @createTime : 2022/1/11 上午8:54
 * @Email :
 * @Description :
 */
public class LinkList {
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
