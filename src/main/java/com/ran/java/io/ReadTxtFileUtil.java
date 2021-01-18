package com.ran.java.io;

/**
 *
 * @Author: 姚飞虎
 * @Date: 2021/1/18 2:33 下午
 * @Description:
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @since 2018/2/2 14:12
 */
public class ReadTxtFileUtil {

    //效率高
    public static void readTxtFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
                BufferedReader br = new BufferedReader(isr);
                String lineTxt = null;
                while ((lineTxt = br.readLine()) != null) {
                    System.out.println(lineTxt);
                }
                br.close();
            } else {
                System.out.println("文件不存在!");
            }
        } catch (Exception e) {
            System.out.println("文件读取错误!");
        }
    }

    public static void main(String[] args) {
        readTxtFile("/Users/innocence/tmp/test/1.txt");
    }
}
