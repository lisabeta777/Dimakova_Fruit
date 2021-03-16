package com.company;

public class Fruit {
    private boolean fresh;

    final boolean getFresh() {
        return fresh;
    }

        final void setFresh(final boolean fresh) {
        this.fresh = fresh;
        }

    @Override
    public String toString() {
        return "Фрукт{" + "fresh = " + fresh + '}';
    }
}
