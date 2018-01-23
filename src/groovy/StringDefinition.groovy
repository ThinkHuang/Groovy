package groovy

class StringDefinition
{
    /**
     * 字符串索引
     */
    static void main(def args)
    {
        /**
         * groovy中，字符串是字符的有序序列，可以通过索引位置进行位置的确定
         */
        String str = "Hello groovy";
//        println str[4];
//        println str[-1];//从末尾开始进行索引
//        println str[1..4];//进行字符区间索引
//        println str[4..2];//从索引4开始倒退2个字符
        
        /**
         * 字符串的重复
         */
        println str*3;
        println "hello"*3;
        
    }
}
