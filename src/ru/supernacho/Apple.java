package ru.supernacho;

public class Apple extends Fruit {
    Apple() {
        super(1.0f);
    }

    Apple(float weight) {
        super(weight);
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }
}
