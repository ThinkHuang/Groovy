package groovy

class TraitDefinition {
    static void main(def args) {
        Student student = new Student();
        student.setMarks(10);
        student.setStudentId(1);
        student.DisplayMarks();
        student.DisplayTotal();
    }
    
//    interface Total{
//        void DisplayTotal();
//    }
    
    trait Total{
        void DisplayTotal(){
            println "display total";
        }
    }
    
    trait Mark extends Total{
       int Marks;
       void DisplayMarks(){
            Marks = 10;
            println Marks;
        }
    }
    
    static class Student implements Mark{
        int studentId;
        
//        void DisplayMarks(){
//            println "student mark";
//        }
    }
}
