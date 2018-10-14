package com.ooprog.movies;

import java.util.Objects;

public class ToWatch {
    public ToWatch(String name) {
        super();
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ToWatch [name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToWatch ToWatch = (ToWatch) o;
        return Objects.equals(name, ToWatch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}