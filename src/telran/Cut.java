package telran;

public class Cut {
    private int leftEnd;
    private int rightEnd;

    public Cut(Integer leftEnd, Integer rightEnd) throws LessThanLeftEnd, NumberFormatException {
        if(leftEnd == null){
            throw  new NumberFormatException("the left end is null");
        }else {
            this.leftEnd = leftEnd;
        }
        if(rightEnd <= leftEnd || rightEnd == null) {
            throw new LessThanLeftEnd("the right end is incorrect or null!!!");

        }else {
            this.rightEnd = rightEnd;
        }
    }

    public int getLeftEnd() {
        return leftEnd;
    }

    public void setLeftEnd(int leftEnd) {
        this.leftEnd = leftEnd;
    }

    public int getRightEnd() {
        return rightEnd;
    }

    public void setRightEnd(int rightEnd) {
        this.rightEnd = rightEnd;
    }
}
