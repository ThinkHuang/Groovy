package groovy

class MetaObject
{
    static void main(def args)
    {
        Student stu = new Student();
        stu.name = 'Joe';
        stu.ID = 1;
        println stu.name;
        println stu.ID;
        println stu.addMarks("john", [1, 2, 3, 4]);
        println stu.hello();
        
//        Student stu = new Student();
//        println stu.getName();
//        
//        stu.metaClass.setAttribute(stu, "name", "john");
//        println stu.getName();
    }
    
//    static class Student{
//        private String name = "joe";
//        
//        String getName(){
//            return this.name;
//        }
//    }
    
    
}

