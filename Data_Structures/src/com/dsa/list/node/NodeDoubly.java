package com.dsa.list.node;

public class NodeDoubly<T> {

    public T data;
    public NodeDoubly prev = null;
    public NodeDoubly next = null;

    public NodeDoubly(T data) {
        this.data = data;
    }
}
