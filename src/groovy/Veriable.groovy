/*
测试groovy的变量的特性
*/
//1、groovy默认是不需要强制类型声明的，仅仅只需以def进行变量定义
/*def var = "Hello World";

println var;

println var.class;*/

//2、groovy默认是不需要写public的，因为默认修饰符就是public

//3、groovy不需要结束修饰符，当然为了和java同步，一般建议加上

//4、字符串连接
/*def str = "Hello " + "World " + ",groovy";
println str;*/
//使用更groovy的形式，三个"号之间不再需要+号进行连接，(不过字符串中的格式符都会被保留下来，包括回车和tab)
//def str = """hello world ,groovy!"""
//println str;

//5、类型自动转变
//def var = """hello world,groovy!""";
//println var;
//println var.class;
//
//var = 1001;
//println var.class;

//6、for循环
//def var = """hello world, groovy""";
//def repeat(var)
//{
////    for(i = 0; i < 5; i++)
//    for(i in 0..5)//这里相当于i<=5
//    {
//        println var;
//    }
//}
//repeat(var)
//repeat的作用是进行循环的定义开始,貌似必须要有结束repeat(var)

//7、GString和范围定义(在循环中的0..<5,所包含的字段为0,1,2,3,4，不仅可以作用于数字，还可以作用于字符"a..<e",取值为a,b,c,d)
//def var = """hello world,groovy""";
//def repeat(var)
//{
//    for(i in 0..<5){
//        println "this is ${i}:${var}";
//    }
//}
//repeat(var)

//8、默认参数值
/*def val = """hello world,groovy""";
def repeat(val, repeat=3)
{
    for(i in 0..repeat)
    {
        println "this is ${i}:${val}";
    }
}
repeat(val);*/
//默认参数值只能适用于for(i in 0..repeat)中，而不能适用于for(i = 0; i< repeat; i++)

//9、集合
//def collect=["a","b","c"];
//collect.add(1);
//collect<<"come on";
//collect[collect.size()]=100.0;
//println collect[collect.size()-1];
//println collect[5];
//println collect[6];//groovy访问超出索引范围之外的元素时，不会报错，只是返回的是空值而已
//println collect[-1];//从后面开始进行索引元素100.0

//println "----------------------------------------------------------------";
//集合运算
//collect=collect+5;//向集合中添加元素
//println collect.size();
//println collect[collect.size()-1];
//collect=collect-'a';//减去集合中遇到的第一个字符a
//println collect[0];
//collect=collect-collect[0..4];
//println collect[0];
//println collect[-1];

//10、map groovy中的Map就是java中的LinkedHashMap
def map=['name':'john','age':14,'sex':'boy'];
map=map+['weight':25];//添加John的体重
map=map+['length':1.27];//添加John的身高
map.father='Keller';//添加John的父亲
println map['father'];//key作为下标索引
println map.length;//key作为成员名索引

//11、闭包：使用{}括起来的代码块，它可以被单独运行或调用，也可以被命名。最常用的是对结合进行迭代
map.each({key,value ->println "${key}:${value}";});
//这种形式和java8的lambda表达式非常类似
//map.each({println it});
//和上面的那种效果一直，主要是map的groovytoString方法是如何直接打印里面的元素的？
//map.each({println it.getKey() + "-->" + it.getValue()});

def say={word->
    println "hi,${word}";//目前看来，在使用$进行变量占位时，变量是否需要{}都是没有所谓的
}
say('groovy');
say.call('groovy&grails')
