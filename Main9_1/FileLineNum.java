package Main9_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLineNum {
    public static void main(String[] args) {
        String srcPath = "Main9_1/src.txt";
        String destPath = "Main9_1/dest.txt";
        int lineNum = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(srcPath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))) {

            String line;
            while ((line = br.readLine()) != null) {
                String outStr = lineNum + ":" + line;
                bw.write(outStr);
                bw.newLine(); 
                lineNum++;    
            }
            System.out.println("文件处理完成，已生成带行号的目标文件");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
