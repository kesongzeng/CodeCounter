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
 * @date 2017/10/13 19:47
 * @Description:
 */
public class JCodeCounter extends CodeCounter{
    public void count(List<File> files) {
        try {
            for (File file:files
                    ) {
                Scanner scanner = new Scanner(new FileInputStream(file));
                boolean isNoteLine = false;
                while(scanner.hasNextLine()){
                    String currLine = scanner.nextLine();
                    if(currLine.matches(CodeCounter.BLANK_EX))
                        blankLine++;
                    else if(currLine.trim().startsWith("/*") || isNoteLine) {
                        noteLine++;
                        isNoteLine = currLine.trim().endsWith("*/") ? false : true;
                    }
                    else
                        normalLine++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
