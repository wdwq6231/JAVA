package Main8_1;

import javax.swing.JPanel;          // 导入Swing面板类，用于定义广告组件

public abstract class Corp {        // 定义抽象类Corp，作为所有广告公司的父类
    public abstract JPanel getCorpAD();  // 抽象方法：子类必须实现，返回广告面板（Swing组件）
}
