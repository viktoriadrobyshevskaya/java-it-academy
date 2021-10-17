package by.it_academy.hw.hw6;

import by.it_academy.hw.hw6.parts.*;

public class Robot {
    private RightArm rightArm;
    private LeftArm leftArm;
    private RightLeg rightLeg;
    private LeftLeg leftLeg;
    private Body body;
    private Head head;

    public Robot() {
    }

    public Robot(RightArm rightArm, LeftArm leftArm, RightLeg rightLeg, LeftLeg leftLeg, Body body, Head head) {
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.body = body;
        this.head = head;
    }

    public RightArm getRightArm() {
        return rightArm;
    }

    public void setRightArm(RightArm rightArm) {
        this.rightArm = rightArm;
    }

    public LeftArm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(LeftArm leftArm) {
        this.leftArm = leftArm;
    }

    public RightLeg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(RightLeg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public LeftLeg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(LeftLeg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "rightArm=" + rightArm +
                ", leftArm=" + leftArm +
                ", rightLeg=" + rightLeg +
                ", leftLeg=" + leftLeg +
                ", body=" + body +
                ", head=" + head +
                '}';
    }
}
