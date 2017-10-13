package cn.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bryan Sun
 * @version V1.0
 * @e-mail bryansun@163.com
 * @date 2017/10/13 18:29
 * @Description:
 */
public abstract class CodeCounter {

    public static String BLANK_EX = "^[\\s]*$";
    protected int normalLine = 0;
    protected int noteLine = 0;
    protected int blankLine = 0;

    public int normalLine() {
        return normalLine;
    }

    public int noteLine() {
        return noteLine;
    }

    public int blankLine() {
        return blankLine;
    }

    public abstract void count(List<File> files);
}
