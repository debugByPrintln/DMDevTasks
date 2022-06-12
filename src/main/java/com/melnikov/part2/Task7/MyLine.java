package com.melnikov.part2.Task7;

public class MyLine {
    private MyPoint startPoint;
    private MyPoint endPoint;

    public MyLine(int xs, int ys, int xe, int ye) {
        this.startPoint = new MyPoint(xs, ys);
        this.endPoint = new MyPoint(xe, ye);
    }

    public MyPoint getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(MyPoint startPoint) {
        this.startPoint = startPoint;
    }

    public MyPoint getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(MyPoint endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    class MyPoint{
        private int x;
        private int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
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

        @Override
        public String toString() {
            return "MyPoint{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
