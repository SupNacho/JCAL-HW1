package ru.supernacho;

import java.util.ArrayList;


public class Box <T extends Fruit> {
    private ArrayList<T> boxContent;
    private int count;
    public Box () {
        boxContent = new ArrayList<>();
    }

    public void add(T obj) {
        this.boxContent.add(obj);
        this.count++;
    }

    public void removeAll() {
        this.boxContent.clear();
        this.count = 0;
    }

    public int getCount(){
        return this.count;
    }

    public float getWeight() {
        float weight = 0.0f;
        for ( T item : boxContent) {
            weight += item.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box){
       if (getWeight() == box.getWeight()) return true;
       return false;
    }

    public void moveToBox(Box<T> dstBox){
       for (T items : boxContent) {
           dstBox.add(items);
       }
       removeAll();
    }

}
