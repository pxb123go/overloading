class Student{
    int id;
    String name;
    float steipeind;

    Student(){}

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    Student(int id, String name, float steipeind){
        this.id=id;
        this.name=name;
        this.steipeind=steipeind;
    }
   public void display(){
    System.out.println("Id is "+ this.id + " Name is" + this.name + " Steipeind is" + this.steipeind);
   }
}
class program{
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student(100, "pradyun" );
        Student s3= new Student(100, "pradyun" , 1000);
        s1.display();
        s2.display();
        s3.display();
    }
}