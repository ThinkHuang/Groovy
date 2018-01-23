package groovy

/**
 * 列表
 */
class ListDefinition
{
    static void main(def args)
    {
        def list = [11, 12, 13, 14];
        def newList = [];
        
        newList = list.minus([12, 13]);//创建未包含指定的元素的列表
        println newList;
        
        newList = list.plus([15, 16]);//和minus刚好相反，将指定元素添加到列表中去
        println newList;
        
        newList.pop();//删除最后一个元素
        
        newList.remove(3);//删除指定索引位置上的元素
        
        newList.reverse();//将列表进行反转
        
        newList.sort();//返回原始列表排序副本，默认排序算法使用的是java中的快速排序么？
    }
}
