import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI {
    private JFrame fr; //หน้าต่างหลัก
    private JPanel pn; //จัดกลุ่มปุ่ม
    private JButton bn1, bn2, bn3, bn4; //สี่ปุ่ม
    private JTextField textField ,text2,text3; //ช่องกรอกข้อมูล
    
    public CalculatorOneGUI(){
        fr = new JFrame("Calculator"); //สร้างหน้าต่างใหม่
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ให้โปรแกรมปิดเมื่อปิดหน้าต่าง
        fr.setSize(300, 200); //ขนาดของหน้าต่าง
        fr.setLayout(new GridLayout(4,1)); //รูปแบบการจัดเรียง
        
        textField = new JTextField(); //สร้างช่องเก็บข้อมูล
        text2 = new JTextField();
        text3 = new JTextField();
        fr.add(textField); //เพิ่มtextFieldไปที่หน้าต่างfr
        
        pn = new JPanel();
        pn.setLayout(new FlowLayout()); //จัดตำแหน่งปุ่มในลักษณะตามลำดับ
                
        bn1 = new JButton("Plus");
        bn2 = new JButton("Minus");
        bn3 = new JButton("Multiplie");
        bn4 = new JButton("Divide");
        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bn4);
        
        fr.add(text2);
        fr.add(pn);
        fr.add(text3);
        fr.setVisible(true); //เปิดการแสดงผลของหน้าต่าง
    }
}
