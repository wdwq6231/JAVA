package Main8_1;

import java.awt.*;                  // 导入AWT核心类（布局、字体、颜色等）
import java.awt.event.*;            // 导入AWT事件处理类（按钮点击事件）
import javax.swing.*;               // 导入Swing GUI组件（窗口、按钮、文本框等）
import java.lang.reflect.Constructor;  // 导入反射API的构造器类，用于动态创建对象

public class MainClass extends JFrame {  // 主窗口类，继承JFrame（Swing顶级窗口）
    JTextField inputName;            // 文本框：输入公司名称（类名）
    JButton show;                    // 按钮：点击后显示对应公司的广告
    JPanel north;                    // 北部面板：放文本框和按钮
    JPanel center;                   // 中部面板：放动态加载的广告内容

    public static void main(String args[]) {  // 程序入口
        MainClass win = new MainClass();     // 创建主窗口实例，触发构造方法
    }

    public MainClass(){              // 主窗口构造方法，初始化界面
        setTitle("广告牌");           // 设置窗口标题为"广告牌"
        north = new JPanel();        // 创建北部面板（默认流式布局）
        center = new JPanel();       // 创建中部面板
        center.setLayout(new BorderLayout());  // 中部面板设置为边界布局

        inputName = new JTextField("Corp",12);  // 创建文本框，默认内容"Corp"，列宽12
        show = new JButton("显示广告");        // 创建按钮，文本为"显示广告"

        show.addActionListener(new ButtonListener());  // 给按钮添加点击监听器
        inputName.setFont(new Font("",Font.BOLD,28));  // 设置文本框字体：加粗、大小28
        show.setFont(new Font("",Font.BOLD,28));       // 设置按钮字体：加粗、大小28

        north.add(inputName);        // 把文本框添加到北部面板
        north.add(show);             // 把按钮添加到北部面板
        add(north,BorderLayout.NORTH);  // 把北部面板添加到窗口的北部区域
        add(center,BorderLayout.CENTER);  // 把中部面板添加到窗口的中心区域

        setVisible(true);            // 设置窗口可见
        setBounds(0,0,1000,589);     // 设置窗口位置(0,0)、宽1000、高589
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 关闭窗口时终止程序
    }

    class ButtonListener implements ActionListener{  // 内部类：按钮点击事件监听器
        public void actionPerformed(ActionEvent e) {  // 按钮点击触发的方法
            String name = inputName.getText();  // 获取文本框中输入的类名（公司名）
            System.gc();                  // 主动触发垃圾回收（释放之前的广告组件）
            try{
                Class<?> cs = Class.forName(name);  // 反射：根据类名字符串加载对应的Class对象
                Constructor<?> gouzhao = cs.getDeclaredConstructor();  // 获取该类的无参构造器
                Corp corp = (Corp)gouzhao.newInstance();  // 用构造器创建该类的实例（强转为Corp类型）

                center.removeAll();       // 清空中部面板上的所有旧组件
                center.add(corp.getCorpAD());  // 调用实例的getCorpAD()方法，把广告面板添加到中部
                center.repaint();         // 重绘中部面板，更新界面
                validate();               // 验证并刷新窗口布局，确保组件显示正常
            }catch(Exception exp) {       // 捕获反射或创建对象时的所有异常
                System.out.println(exp);  // 打印异常信息（如类不存在、构造器异常等）
            }
        }
    }
}
