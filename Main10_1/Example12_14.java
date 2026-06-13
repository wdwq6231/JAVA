package Main10_1;

public class Example12_14 {
    public static void main(String args[]) {
        StandardExamInTime win = new StandardExamInTime();
        win.setTitle("限时回答问题");
        win.setTestFile(new java.io.File("Main10_1/test.txt"));
        win.setMAX(8);
    }
}
