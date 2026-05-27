package Main8_2;

import java.awt.event.*;

public class TrapezoidController implements ActionListener {
    WindowTrapezoidView view;

    public void setView(WindowTrapezoidView view) {
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double top = Double.parseDouble(view.textTop.getText().trim());
            double bottom = Double.parseDouble(view.textBottom.getText().trim());
            double height = Double.parseDouble(view.textHeight.getText().trim());

            view.trapezoid.setTop(top);
            view.trapezoid.setBottom(bottom);
            view.trapezoid.setHeight(height);

            double area = view.trapezoid.getArea();

            view.textTop.setText("" + view.trapezoid.top);
            view.textBottom.setText("" + view.trapezoid.bottom);
            view.textHeight.setText("" + view.trapezoid.height);

            String strArea = String.format("%.3f", view.trapezoid.area);
            view.showArea.append("\n梯形面积（保留3位小数）:\n" + strArea);

        } catch (Exception ex) {
            view.showArea.append("\n错误: " + ex + "\n");
        }
    }
}
