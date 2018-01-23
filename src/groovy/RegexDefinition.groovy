package groovy

import java.util.regex.Pattern

/**
 * 正则
 * 解释：在java中包含两个类用来完成正则的匹配，
 * 1、Pattern：通过指定的字符串或者正则表达式生成的Pattern对象。例如Pattern p = Pattern.compile("a*b");这样就生成了一个模式对象
 * 2、Matcher：模式对象Pattern通过和目标字符串进行模式匹配生成一个Matcher对象。这个对象中包含了模式对象和目标字符串比较的结果
 */
class RegexDefinition
{
    static void main(def args)
    {
//        Pattern regex = ~'Gro{2}vy';
//        def regex = ~'Groovy';这条语句同上
        def regex = ~'G$';
        println regex.matcher('Groovy').matches();
    }
}
