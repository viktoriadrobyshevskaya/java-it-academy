package by.it_academy.hw.hw5.task9;

import java.io.Serializable;
import java.util.Objects;

public class Box implements Serializable, Comparable<Box> {
    private int x;
    private int y;
    private int z;
    private int volume;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = countVolume();
    }

    public int countVolume() {
        return x * y * z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return x == box.x && y == box.y && z == box.z && volume == box.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, volume);
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", volume=" + volume +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        if (volume > o.getVolume()) {
            return 1;
        } else if (volume < o.getVolume()) {
            return -1;
        }
        return 0;
    }
}
