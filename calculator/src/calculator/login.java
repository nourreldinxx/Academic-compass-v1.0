package calculator;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class login extends JFrame implements ActionListener{
    
    String[] subject=new String[6];
    String[] grad=new String[6];
    int[] hours= new int[6];
    double[] marks= new double[6];
    double to=0;
    
    public login(){
        this.setTitle("Academiccompass");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initcomponents();       
    }
    
    private void initcomponents(){
//        initialize components
        home_page = new javax.swing.JPanel();
        orangeSide = new javax.swing.JPanel();
        stud_name = new javax.swing.JTextField();
        stud_id = new javax.swing.JTextField();
        gpa_btn = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        avg_btn = new javax.swing.JButton();
        stud_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        logo3 = new javax.swing.JLabel();
        copyrights = new javax.swing.JLabel();
        
        
//        panel adjustment
        this.add(home_page);
        this.add(orangeSide);
        this.setLayout(new GridLayout(1,2));
        home_page.setSize(450, 550);
        home_page.setBackground(new java.awt.Color(255, 255, 255));
        home_page.setLayout(null);

        orangeSide.setSize(450, 550);
        orangeSide.setBackground(new java.awt.Color(255, 177, 25));
        orangeSide.setLayout(null);
      
        stud_name.setBackground(new java.awt.Color(249, 214, 146));
        stud_name.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        stud_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stud_name.setBorder(null);
        stud_name.setMargin(new java.awt.Insets(2, 10, 2, 10));
        stud_name.setSelectedTextColor(new java.awt.Color(32, 29, 57));
        stud_name.setSelectionColor(new java.awt.Color(255, 204, 102));
    
        stud_id.setBackground(new java.awt.Color(249, 214, 146));
        stud_id.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        stud_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stud_id.setBorder(null);
        stud_id.setSelectedTextColor(new java.awt.Color(32, 29, 57));
        stud_id.setSelectionColor(new java.awt.Color(255, 204, 102));
        
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo1.png"))); // NOI18N
        
        gpa_btn.setBackground(new java.awt.Color(249, 214, 146));
        gpa_btn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        gpa_btn.setForeground(new java.awt.Color(32, 29, 57));
        gpa_btn.setText("GPA calculator");
        gpa_btn.setBorder(null);
        
        avg_btn.setBackground(new java.awt.Color(249, 214, 146));
        avg_btn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 12)); // NOI18N
        avg_btn.setForeground(new java.awt.Color(32, 29, 57));
        avg_btn.setText("Average grade calculator");
        avg_btn.setBorder(null);
        
//        labels adjustments
        stud_label.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        stud_label.setForeground(new java.awt.Color(6, 0, 66));
        stud_label.setText("Student Name");
        id_label.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        id_label.setForeground(new java.awt.Color(6, 0, 66));
        id_label.setText("Student ID");
        
        
//                           x   y  width  height         
        stud_name.setBounds(75, 235, 280, 46);
        photo.setBounds(63, 20, 305, 175);
        stud_label.setBounds(156, 206, 129, 23);
        id_label.setBounds(171, 292, 129, 23);
        stud_id.setBounds(75, 320, 280, 47);
        avg_btn.setBounds(118, 397, 194, 33);
        gpa_btn.setBounds(135, 442, 160, 33);

//         Add the components to the panel
        orangeSide.add(photo);
        orangeSide.add(stud_label);
        orangeSide.add(stud_name);
        orangeSide.add(id_label);
        orangeSide.add(stud_id);
        orangeSide.add(avg_btn);
        orangeSide.add(gpa_btn);
        
        
//      logo adjustments
        logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        
        
//      copyrights adjustments
        copyrights.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        copyrights.setForeground(new java.awt.Color(32, 29, 57));
        copyrights.setText("copyright © academic compass, all rights reserved 2024");
        
        
        
//      Set the bounds for each component manually
        logo3.setBounds(115, 90, 224, 231);
        copyrights.setBounds(37, 440, 380, 27);
        orangeSide.setBounds(450, 0, orangeSide.getWidth(), home_page.getHeight());

//      Add the components to the panel
        home_page.add(logo3);
        home_page.add(copyrights);
        home_page.add(orangeSide);
        
        gpa_btn.addActionListener(this); 
        avg_btn.addActionListener(this);

    }
    

    
//          components declaration
    private javax.swing.JButton gpa_btn;
    private javax.swing.JButton avg_btn;
    private javax.swing.JLabel copyrights;
    private javax.swing.JPanel home_page;
    private javax.swing.JLabel stud_label;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel logo3;
    private javax.swing.JPanel orangeSide;
    private javax.swing.JLabel photo;
    javax.swing.JTextField stud_id;
    javax.swing.JTextField stud_name;

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==avg_btn)
        {
            if ("".equals(stud_name.getText()))
            {
                JOptionPane.showMessageDialog(null, "Please enter your name", "invalid inputs", JOptionPane.WARNING_MESSAGE);
            }
            else if("".equals(stud_id.getText()))
            {
                JOptionPane.showMessageDialog(null, "Please enter your ID", "invalid inputs", JOptionPane.WARNING_MESSAGE);
            }
            else
            {  
                String namef=stud_name.getText();
                String idf=stud_id.getText();
                results m = new results(namef,idf,subject,marks);
                Avg_calc g = new Avg_calc(namef,idf);  
                g.setVisible(true);
                this.setVisible(false);
                
                
                
            };
        }
            
            
        if (e.getSource()==gpa_btn)
        {
            if ("".equals(stud_name.getText()))
            {
                JOptionPane.showMessageDialog(null, "Please enter your name", "invalid inputs", JOptionPane.WARNING_MESSAGE);
            } 
            else if("".equals(stud_id.getText()))
            {
                
                JOptionPane.showMessageDialog(null, "Please enter your ID", "invalid inputs", JOptionPane.WARNING_MESSAGE);
            }
            else
            {   
               String namef=stud_name.getText();
               String idf=stud_id.getText();
                GPA_calc   g = new GPA_calc(namef,idf);
                gpacert m = new gpacert(namef, idf, subject, grad, hours, to);
             
                g.setVisible(true);
                this.setVisible(false);
            }
        }
    }    
}



