package groovy

/**
 * 斐波那契
 */
class Fibnacci
{
    long total = 0;//统计计算了多少次
    int n;//计算的上限值
    
    public Fibnacci(def n)
    {
        this.n = n;
    }
    
    def fibnacci_1(n){
        total ++
        n < 2 ? 1 : fibnacci_1(n-1) + fibnacci_1(n-2)
    }
     
    @groovy.transform.Memoized
    def fibnacci_2(n){
        total ++
        n < 2 ? 1 : fibnacci_2(n-1) + fibnacci_2(n-2)
    }
    
    //测试不使用Memoized
    def runWithoutMem(){
        long start = System.currentTimeMillis()
        total = 0
        def val = fibnacci_1(n)
        long time = System.currentTimeMillis() - start
        println "未使用Memoized,${n}的Fibnacci值是${val}，共用时${time}毫秒，函数调用共${total}次"
    }
     
    //测试使用Memoized
    def runWithMem(){
        long start = System.currentTimeMillis()
        total = 0
        def val = fibnacci_2(n)
        long time = System.currentTimeMillis() - start
        println "使用Memoized,${n}的Fibnacci值是${val}，共用时${time}毫秒，函数调用共${total}次"
    }
    
    static void main(def args)
    {
        def fib = new Fibnacci(40);
        fib.runWithoutMem();
        fib.runWithMem();
    }
}

