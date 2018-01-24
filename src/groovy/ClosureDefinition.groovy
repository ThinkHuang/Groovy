package groovy

/**
 * 闭包
 */
class ClosureDefinition {
    static void main(def args) {
        //        def clos = {println "hello groovy";};
        //        clos.call();
        
        //带参数的闭包形式
        //        def clos = {params -> println "hello ${params}";};
        //        clos.call("groovy");
        
        //单参数的隐式传递，it是一个隐藏的变量，在groovy中是一个关键字
        //        def clos = {println "hello ${it}"};
        //        clos.call("groovy");
        
        //修改闭包中的参数
        //        def str = "hello";
        //        def clos = {param -> println "${str} ${param}"};
        //        clos.call("groovy");
        //
        //        str = "welcome";
        //        clos.call("groovy");
        
        //方法中内置闭包
//        def str = "hello";
//        def clos = {param -> println "${str} ${param}"};
//        clos.call("groovy");
//        ClosureDefinition.Display(clos);
        
        //集合中使用闭包
//        def lst = [11, 12, 13, 14];
//        lst.each({println it});
        
        //map中的使用
//        def map=["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"];
//        map.each({println it});
//        map.each({println "key:${it.key}   value:${it.value}"});
        
        //any和every
        def lst = [1, 2, 3, 4];
        def value;
        value = lst.any({element -> element > 2});
        println value;
        
        value = lst.every({element -> element > 2});
        println value;
        
        def newLst = [];
        newLst = lst.collect({element -> element * element});
        println newLst;
    }
    
    
    def static Display(clos)
    {
        clos.call("Inner");
    }
}
