public class Student {
    public String name;
    public double mScore;
    public double fScore;
    
    //Method ดพื่อคำนวณและแสดงเกรด
    public void showGrade() {
        //คำนวณคะแนนรวม
        double s = (mScore*0.4)+(fScore*0.4)+20;
        char grade = 'F';
        if (80 <= s) {
            grade = 'A';
        }else if (70 <= s && s < 80) {
            grade = 'B';
        }else if (60 <= s && s < 70) {
            grade = 'C';
        }else if (50 <= s && s < 60) {
            grade = 'D';
        }
        System.out.println("Your grade is ["+grade+"].");
    }
    //เมะอดหลักที่เริ่มต้นทำงานของโปรแกรม
    public static void main(String[] args) {
        //สร้าง object ของ class Student
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        //เรียกใช้ method showGrade() เพื่อคำนวณและแสดงเกรด
        s.showGrade();
    }
}
