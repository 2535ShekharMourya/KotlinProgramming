package OOpsInKotlin.Encapsulation;

 class StudentJV {
     private int marks;
     int age;
     String name;
     public void setMarks(int marks) {
         if (marks >= 0 && marks <= 100) {
             this.marks = marks;
         }
     }

     public int getMarks() {
         return marks;
     }
}
