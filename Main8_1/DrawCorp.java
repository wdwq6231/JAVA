package Main8_1;

import javax.swing.JPanel;         // 导入Swing面板类
import java.awt.*;                  // 导入AWT核心类（绘图、图片、颜色等）
import java.awt.event.*;            // 导入AWT事件处理类（本代码未使用，但导入了）

public class DrawCorp extends Corp {  // 继承抽象类Corp，实现绘图广告功能
    public JPanel getCorpAD(){      // 实现抽象方法：返回广告面板
        DrawingBoard panel = new DrawingBoard();  // 创建自定义绘图面板
        return panel;               // 返回绘图面板作为广告组件
    }
}

class DrawingBoard extends JPanel{  // 自定义面板类，用于绘制图片广告
    Toolkit tool;                   // 工具包：用于加载本地图片
    Image image1, image2;            // 两个图片对象，用于切换显示

    DrawingBoard(){                  // 构造方法：初始化面板和图片
        setBackground(Color.yellow); // 设置面板背景色为黄色
        tool = getToolkit();         // 获取工具包实例
        image1 = tool.getImage("one.jpg");  // 加载本地图片one.jpg（需和class文件同目录）
        image2 = tool.getImage("two.jpg");  // 加载本地图片two.jpg
    }

    public void paint(Graphics g){  // 重写paint()方法：自定义绘图逻辑
        super.paint(g);             // 调用父类的paint()方法，绘制面板背景和基础组件
        g.setXORMode(Color.red);    // 设置绘图模式为异或模式，颜色为红色（实现图片叠加的特殊效果）

        int w = getBounds().width;  // 获取面板的当前宽度
        int h = getBounds().height;  // 获取面板的当前高度

        g.drawImage(image1,0,0,w,h,this);  // 绘制第一张图片，填满整个面板
        g.drawImage(image2,0,0,w,h,this);  // 绘制第二张图片，同样填满面板（异或模式下会产生叠加效果）
    }
}
