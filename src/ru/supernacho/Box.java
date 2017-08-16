package ru.supernacho;

import java.util.ArrayList;


public class Box <T extends Fruit> {
    private ArrayList<T> boxContent;

    public Box () {
        boxContent = new ArrayList<>();
    }

    public void add(T obj) {
        this.boxContent.add(obj);

    }

    public void removeAll() {
        this.boxContent.clear();
    }

    public int getCount(){
        return this.boxContent.size();
    }

    public float getWeight() {
        float weight = 0.0f;
        for ( T item : boxContent) {
            weight += item.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box){
       return Math.abs(getWeight() - box.getWeight()) < 0.0001f;
    }

    public void moveToBox(Box<T> dstBox){
       for (T items : boxContent) {
           dstBox.add(items);
       }
       removeAll();
    }

}
