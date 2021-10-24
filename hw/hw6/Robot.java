package by.it_academy.hw.hw6;

public class Robot {
    private Part rightArm = Part.RIGHT_ARM;
    private Part leftArm = Part.LEFT_ARM;
    private Part rightLeg = Part.RIGHT_LEG;
    private Part leftLeg = Part.LEFT_LEG;
    private Part body = Part.BODY;
    private Part head = Part.HEAD;

    public Robot() {

    }

    public Robot(Part rightArm, Part leftArm, Part rightLeg, Part leftLeg, Part body, Part head) {
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.body = body;
        this.head = head;
    }

    public Part getRightArm() {
        return rightArm;
    }

    public void setRightArm(Part rightArm) {
        this.rightArm = rightArm;
    }

    public Part getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Part leftArm) {
        this.leftArm = leftArm;
    }

    public Part getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Part rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Part getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Part leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Part getBody() {
        return body;
    }

    public void setBody(Part body) {
        this.body = body;
    }

    public Part getHead() {
        return head;
    }

    public void setHead(Part head) {
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
