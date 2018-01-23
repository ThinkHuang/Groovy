package groovy

/**
 * 闭包
 */
class ClosureDefinition
{
    static void main(def args)
    {
//        def clos = {println "hello groovy";};
//        clos.call();
        
        //带参数的闭包形式
//        def clos = {params -> println "hello ${params}";};
//        clos.call("groovy");
        
        //单参数的隐式传递
        def clos = {println "hello ${it}"};
        clos.call("groovy");
    }
}
