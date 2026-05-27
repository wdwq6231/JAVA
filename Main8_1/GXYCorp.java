package Main8_1;

import javax.swing.*;               // 导入Swing组件类
import java.awt.*;                  // 导入AWT核心类

public class GXYCorp extends Corp {  // 继承抽象类Corp，实现广告功能
    JPanel panel;                    // 主面板：整个广告的容器
    JButton enter;                   // 按钮：触发字符串反转
    JTextField inputNumber;          // 文本框：输入要反转的字符串
    JTextArea show;                  // 文本区域：显示反转后的结果

    public GXYCorp(){                // 构造方法：初始化广告界面
        panel = new JPanel();        // 创建主面板
        panel.setLayout(new BorderLayout());  // 设置主面板为边界布局

        inputNumber = new JTextField("java",15);  // 创建文本框，默认内容"java"，列宽15
        show = new JTextArea(5,18);    // 创建文本区域，5行18列，可显示多行文本
        inputNumber.setFont(new Font("",Font.BOLD,28));  // 设置文本框字体：加粗、大小28
        show.setFont(new Font("",Font.BOLD,28));         // 设置文本区域字体：加粗、大小28

        enter = new JButton("反转字符串");  // 创建按钮，文本为"反转字符串"
        JPanel north = new JPanel();      // 北部面板：放文本框和按钮
        north.add(inputNumber);           // 文本框添加到北部面板
        north.add(enter);                 // 按钮添加到北部面板

        panel.add(north,BorderLayout.NORTH);  // 北部面板添加到主面板的北部区域
        panel.add(new JScrollPane(show),BorderLayout.CENTER);  // 文本区域添加到带滚动条的面板，再放到主面板中心

        enter.addActionListener(e -> {    // 给按钮添加点击事件（Lambda表达式）
            String str = inputNumber.getText();  // 获取文本框中输入的字符串
            StringBuffer buffer = new StringBuffer(str);  // 用StringBuffer包装字符串（支持反转）
            buffer = buffer.reverse();          // 调用reverse()方法反转字符串
            show.append("\n" + buffer);         // 把反转后的结果追加到文本区域，换行显示
        });
    }

    public JPanel getCorpAD(){       // 实现抽象方法：返回广告面板
        return panel;                // 返回初始化好的主面板
    }
}
