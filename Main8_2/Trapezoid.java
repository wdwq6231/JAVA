package Main8_2;

public class Trapezoid {
    double top, bottom, height, area;
    boolean isValid;

    public double getArea() {
        if (isValid) {
            area = (top + bottom) * height / 2.0;
            return area;
        } else {
            area = Double.NaN;
            return area;
        }
    }

    public void setTop(double top) {
        this.top = top;
        // 每次设置数据，都要检查三个属性是否都为正
        if (top > 0 && bottom > 0 && height > 0) {
            isValid = true;
        } else {
            isValid = false;
        }
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
        if (top > 0 && bottom > 0 && height > 0) {
            isValid = true;
        } else {
            isValid = false;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (top > 0 && bottom > 0 && height > 0) {
            isValid = true;
        } else {
            isValid = false;
        }
    }
}
