package HashTable;

//implementation of a Hash Table Data Structure.

public class hashTable {
    // table size
    private static final int TABLE_SIZE = 100;
    private Record[] tableData = new Record[TABLE_SIZE];
    // Put method: takes a key-value pair, calculates the hash code, and stores the Record in the corresponding slot
    public void put(Object key, Object value){
        int keyCode = key.hashCode();
        int step = 0;
        int slot = hash(keyCode, step);
        while (!isEmpty(slot)){
            slot = hash(keyCode, ++step);
        }
        tableData[slot]= new Record(key,value);
    }
    // KeyExists method: checks if a given key exists in the hash table
    public boolean keyExists( Object key){
        int keyCode = key.hashCode();
        int step =0;
        int slot = hash(keyCode, step);
        while (tableData[slot] != null && !tableData[slot].getKey().equals(key)){
            slot= hash(keyCode, ++step);
        }
        if (tableData[slot]!= null){return true;}
        return false;
    }
    // Get method: retrieves the value corresponding to the given key from the hash table

    private Object get(Object key){
        int keyCode = key.hashCode();
        int step= 0;
        int slot =hash(keyCode, step);
        while (tableData[slot] != null && !tableData[slot].getKey().equals(key)) {
            slot = hash(keyCode, ++step);
        }
        if(tableData[slot]!=null) {return tableData[slot].getData();};
        return null;

    }
    // Hash method: calculates the hash code of a given key, based on the table size and the step
    private int hash(int key, int step){
        if(step ==0){return key % TABLE_SIZE;}
        return (key % TABLE_SIZE + step*step)% TABLE_SIZE;
    }

    // isEmpty method: checks if a given slot in the hash table is empty
    private boolean isEmpty(int slot) {return tableData[slot]==null;}



// Record class: defines a Record, which consists of a key and a data value
    private class Record{
        Object key;
        Object data;
        public Record(Object key, Object data){
            this.key = key;
            this.data = data;
        }
        public Object getKey(){return this.key;}
        public Object getData(){return this.data;}
    }

    public static void main (String args[]){
        hashTable ht = new hashTable();
        ht.put("4", 40);
        ht.put("401", 410);
        ht.put("7", 70);
        ht.put("8", 80);
        ht.put("9", 90);
        ht.put("5", 50);
        System.out.println(ht.keyExists("2")); // false
        System.out.println(ht.keyExists("4")); // true
        System.out.println(ht.get(2)); // null
        System.out.println(ht.get("4")); // 40
    }

}
