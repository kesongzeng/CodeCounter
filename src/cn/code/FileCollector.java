package cn.code;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Bryan Sun
 * @version V1.0
 * @e-mail bryansun@163.com
 * @date 2017/10/13 18:40
 * @Description:
 */
public class FileCollector {
    public List<File> collect(String dirStr, String suffix){
        File dirFile = new File(dirStr);
        String fileRegex = "[\\w]+\\."+suffix+"$";
        File[] files = dirFile.listFiles((file, name) -> {
            if (name.matches(fileRegex)) {
                return true;
            }
            return false;
        });
        return Arrays.asList(files);
    }
}
