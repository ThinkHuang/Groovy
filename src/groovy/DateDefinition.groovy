package groovy

/**
 * 日期操作
 */
class DateDefinition
{
    static void main(def args)
    {
        Date now = new Date();//现在
        
        Date begin = new Date(0);//1970年
        
        /**
         * 测试操作
         */
        println now.before(begin);
        println now.after(begin);
        println begin.toString();
        println now.getTime();//返回毫秒值
    }
}
