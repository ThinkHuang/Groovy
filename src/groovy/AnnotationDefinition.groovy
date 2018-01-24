package groovy

/**
 * 字符串注解
 */
@interface StringExa{
    String str() default "hellogroovy";
}

/**
 * 枚举注解
 */
enum DayOfWeek {
    mon, tue, wed, thu, fri, sat, sun
}

@interface Scheduled{
    DayOfWeek dayOfWeek();
}

/**
 * 类注解
 */
//    @interface Simple {}
//    @Simple
//    class User{
//        String username;
//        int age;
//    }
//    def user = new User(username: "Joe",age:1);
//    println(user.age);
//    println(user.username);

@interface OnlyIf{
    Class value();
}

class Number{
    @OnlyIf({Number <=6 })
    static void Version6(){
        println 'Number greater than 6';
    }
}

static void main(def args)
{
    Number.Version6();
}



