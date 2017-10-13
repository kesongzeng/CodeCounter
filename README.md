# -
简单代码统计

#版本1.0
实现简单的java源代码统计（空白行、注释行、普通行）
使用示例：

public class CoderTest {

    public static void main(String[] args) {
        String dir = "E:\\java\\workspace\\download_mock\\src\\cn\\bryans\\";
        FileCollector collector = new FileCollector(); //搜集器搜集代码文件
        List<File> files = collector.collect(dir,"java");  //可以通过传参设置需要的文件类型
        CodeCounter counter = new JCodeCounter(); //JCodeCounter为统计java代码的统计器 可以自定义统计器通过继承CodeCounter
        counter.count(files);  //调用统计方法
        System.out.println("代码统计：");
        System.out.println("空白行数："+counter.blankLine()); //空白结果
        System.out.println("注释行数："+counter.noteLine()); //注释结果
        System.out.println("普通行数："+counter.normalLine()); //普通代码结果
    }
}

#继续完善中....
