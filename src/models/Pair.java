package models;

public class Pair <K, V>{
    private K key;
    private V value;

    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
