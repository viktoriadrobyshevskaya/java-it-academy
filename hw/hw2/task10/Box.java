package by.it_academy.hw.hw2.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Задача 10:
    Используя класс Box из задания 2, необходимо добавить в него конструктор, который принимает строку вида:
    Box[1,2,3] или Box[2] или Box[1,2]
    И как результат создает соответствующий объект.
 */
public class Box {
    private int x;
    private int y;
    private int z;
    private TypeOfShape typeOfShape;

    public Box(String str) {
        Pattern pattern = Pattern.compile("(Box\\[(\\d),?(\\d)?,?(\\d)?\\])");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            if (matcher.group(3) == null && matcher.group(4) == null) {
                this.x = Integer.valueOf(matcher.group(2));
                this.y = Integer.valueOf(matcher.group(2));
                this.z = Integer.valueOf(matcher.group(2));
            } else if (matcher.group(3) != null && matcher.group(4) == null) {
                this.x = Integer.valueOf(matcher.group(2));
                this.y = Integer.valueOf(matcher.group(3));
            } else {
                this.x = Integer.valueOf(matcher.group(2));
                this.y = Integer.valueOf(matcher.group(3));
                this.z = Integer.valueOf(matcher.group(4));
            }
        }
    }

    public Box(int x) {
        this.x = x;
        this.y = x;
        this.z = x;
        typeOfShape = TypeOfShape.CUBE;
    }

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        typeOfShape = TypeOfShape.ENVELOPE;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        typeOfShape = TypeOfShape.BOX;
    }

    public int volume() {
        return x * y * z;
    }

    @Override
    public String toString() {
        if (z == 0) {
            return "Коробка со сторонами: " + "x = " + x + ", y = " + y;
        } else {
            return "Коробка со сторонами: " + "x = " + x + ", y = " + y + ", z = " + z;
        }
    }
}
