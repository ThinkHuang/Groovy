/**
 * 用于对其他操作做说明
 */

//1、?运算符用来进行条件判断，可以达到if(rs!=null) {do something} else {do nothing}的效果

//2、可变参数
/*int sum(int... var)
 {
 def total = 0;
 for (i in var) {
 total += i;
 }
 return total;
 }
 println sum(1);
 println sum(1,2);
 println sum(1,2,3);*/

//3、枚举
/*enum Day
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,
    THURSDAY,FRIDAY,SATURDAY
}

def today = Day.SUNDAY;
switch(today)
{
    case [Day.SATURDAY, Day.SUNDAY]:
        println "Weekends are cool";
        break;
    case [Day.MONDAY..Day.FRIDAY]:
        println "Boring work day";
        break;
    default :
        println "Are you sure this is a valid day?";
}*/

//enum在List中的用法
/*enum Planet
{
    MERCURY(3.303e+23, 2.4397e6),
    
    VENUS(4.869e+24, 6.0518e6),
    
    EARTH(5.976e+24, 6.37814e6),
    
    MARS(6.421e+23, 3.3972e6),
    
    JUPITER(1.9e+27,7.1492e7),
    
    SATURN(5.688e+26, 6.0268e7),
    
    URANUS(8.686e+25, 2.5559e7),
    
    NEPTUNE(1.024e+26, 2.4746e7)
    
    double mass;
    double radius;
    
    Planet(double mass, double radius)
    {
        this.mass = mass;
        this.radius = radius;
    }
    
    void printMe()
    {
        //关于name()的定义：Returns the name of this enum constant, exactly as declared in its enum declaration.
        println "${name()} has a mass of ${mass} " +
                "and a radius of ${radius}";
    }
}

Planet.EARTH.printMe();*/
 
 //4、Elvis操作符，三目运算符的简写形式
// def name = "huangyejun";
// def displayname  = name ?: 'Unknown';
// println displayname;
 
 //5、动态性,动态的给对象添加元素或者方法，不知道在java中使用原型可不可以做到？
 def msg = "hello";
 println msg.metaClass;
 String.metaClass.up = { delegate.toUpperCase()};
 //delegate隶属于闭包里面的元素，那么这个闭包中元素类型如何确定呢？，通过前面的metaClass确定
 println msg.up();
 