class Student_Details{
    int roll_No;
    String Name;
    Student_Details(int roll_No, String Name){
        this.roll_No=roll_No;
        this.Name=Name;
    }
    void show (){
        System.out.println("Roll No "+roll_No+" Name "+Name);
    }
}
public class Array_implementINOops {
    public static void main(String[] args) {
        Student_Details[] studentDetails=new Student_Details[3];
        studentDetails[0]=new Student_Details(50320, "Kishore");
        studentDetails[1]=new Student_Details(50330, "purushoth");
        studentDetails[2]=new Student_Details(50322, "Manjunath");
        for(int i=0; i<studentDetails.length; i++){
            studentDetails[i].show();
        }
    }
}
