class MyHashMap {
    Map<Integer,Integer>m;
    public MyHashMap() {
        m=new HashMap<>();
    }
    
    public void put(int key, int value) {
        m.put(key,value);
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            return m.get(key);
        }
        return -1;
    }
    
    public void remove(int key) {
        m.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */