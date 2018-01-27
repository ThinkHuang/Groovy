/**
对类的声明和定义进行说明
*/
//1、不需要使用public修饰符，groovy默认的修饰符是public，不像java使用默认的default
//2、不需要类型说明，groovy是弱类型的语言，不需要进行具体类型的定义
//3、不需要getter/setter
//4、不需要构造函数
//5、不需要return
//6、不需要(),groovy默认返回最后一条语句的结果作为函数的返回值
//class Person
//{
//    def name;
//    def age;
//    
//    String toString()
//    {
//        "$name,$age";
//    }
//}
//不需要main函数，直接在类外部使用即可
/*def person = new Person();
person.age = 20;
person.name='kk';
println person;*/


