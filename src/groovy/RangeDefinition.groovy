package groovy
/**
 * 范围
 */
class RangeDefinition
{
    
    static void main(def args)
    {
        def rint = 1..10;//直接定义范围
        
        println rint.contains(2);
        println rint.contains(11);
        
        println rint.get(2);//获取指定位置的值
        
        println rint.getFrom();//获取范围起始
        
        println rint.getTo();//结束
        
        println rint.subList(2, 5);//获取区间值
    }
}
