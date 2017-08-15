package ru.supernacho;

public class Orange extends Fruit {
    Orange() {
        super(1.5f);
    }

    Orange(float weight) {
        super(weight);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }
}
