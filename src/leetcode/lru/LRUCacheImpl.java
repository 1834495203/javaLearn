package leetcode.lru;

public class LRUCacheImpl extends LRUCache {

    public LRUCacheImpl(int capacity) {
        super(capacity);
    }

    @Override
    public int get(int key) {
        return 0;
    }

    @Override
    public void put(int key, int value) {
        System.out.println(this.v[0]);
    }

    private int hash(int key) {
        
        return 0;
    }
}
