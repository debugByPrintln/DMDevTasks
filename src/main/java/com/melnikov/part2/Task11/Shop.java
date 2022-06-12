package com.melnikov.part2.Task11;

import java.util.Arrays;

public class Shop<T> {
    private T[] content;

    public Shop(T[] content) {
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
