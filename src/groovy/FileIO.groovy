package groovy

class FileIO
{
    
    static void main(def args)
    {
        /**
         * 使用eachline直接读取文件中的每行数据
         */
//        new File("e://项目地址和SVN地址.txt").eachLine(//"gb2312", 
//            {line -> println "line:${line}"});
        
        /**
         * 使用文件的text属性获取文件的整个内容作为字符串
         */
//        File file = new File("e://项目地址和SVN地址.txt");
//        println file.text;
        
        /**
         * 写入文件
         */
//        new File("e:/", "Example.txt").withWriter("utf-8", {
//           //writer -> writer.writeline("你好 groovy!"); 
//           writer -> writer.writeLine "你好 groovy!" ;
//        });
    
        /**
         * 获取文件大小 
         */
//        File file = new File("e://Example.txt");
//        println "the file ${file.absolutePath} has ${file.length()} bytes";
        
        /**
         * 测试文件是否是目录
         */
//        def file = new File("e://");
//        println "file? ${file.isFile()}";
//        println "directory? ${file.isDirectory()}";
        
        /**
         * 创建目录
         */
//        def file = new File("e://Directory");
//        file.mkdir();
        
        /**
         * 删除文件,如果文件不存在，不会报错
         */
//        def file = new File("e://Example.txt");
//        file.delete();
        
        /**
         * 复制文件
         */
//        def src = new File("e://Example.txt");
//        def desc = new File("e://Example1.txt");
//        desc << src.text;
        
        /**
         * 显示计算机驱动器
         */
//        def rootFiles = new File("e://Example.txt").listRoots();
//        rootFiles.each({
//            file -> println file.absolutePath;
//        });
        
        /**
         * 显示特定文件夹下的文件
         */
//        def file = new File("e://工资单").eachFile({
//            file -> println file.absolutePath;
//        });
        
        /**
         * 递归显示目录中的所有文件,
         * 注意，使用eachFileRecurse时，里面闭包使用的是getAbsolutePath()
         */
        new File("E:/工作文档/接口文档").eachFileRecurse({
            file -> println file.getAbsolutePath();
        });
        
    }
}
