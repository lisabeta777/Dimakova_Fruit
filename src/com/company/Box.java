package com.company;

final  class Box<T> {
    private T element;

    public T get() {
        return element;
    }

    public void put(final T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Коробка{" + "содержимое = " + element + '}';
    }
}
