package Main3_1;

public class Circular {
    Circle bottom;
    double height;
    void setBottom(Circle c) { //设置圆锥的底是一个Circle对象
        bottom = c;
    }
    void setHeight(double h) {
        height = h;
    }
    double getVolume() {
        if(bottom == null)
            return -1;
        else
            return bottom.getArea() * height/3.0;
    }
    double getBottomRadius() {
        return bottom.getRadius();
    }
    public void setBottomRadius(double r){
        bottom.setRadius(r);
    }
}