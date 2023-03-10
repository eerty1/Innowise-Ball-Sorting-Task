package com.innowise.ballfactory.ball;

import com.innowise.ballfactory.ball.ballproperty.Color;
import com.innowise.ballfactory.ball.ballproperty.Type;

public class Ball {
    private Type type;
    private Color color;
    private int size;
    private int weight;

    public Ball(Type type, Color color, int size, int weight) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public Ball() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
