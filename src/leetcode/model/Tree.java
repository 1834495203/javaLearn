package leetcode.model;


import java.util.List;

/**
 * 树节点
 */
public class Tree<T>{

    public T val;
    public List<Tree<T>> childTree;

    public Tree() {}

    public Tree(T val, List<Tree<T>> childTree) {
        this.val = val;
        this.childTree = childTree;
    }
}
