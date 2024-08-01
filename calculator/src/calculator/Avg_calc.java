package calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Avg_calc extends javax.swing.JFrame implements ActionListener,MouseListener{
            JTextField[] sub = new JTextField[6];
            JTextField[]  your_marks = new JTextField[6];
            String[] subject = new String[6];
            String[] cred = new String[6];
              double[] marks=new double[6];
             String namek;
              String idk;
    public Avg_calc(String namef,String idf)
    {
             namek =namef;
             idk= idf;
        this.setTitle("Academiccompass");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initcomponents();
    } 
      

    private void initcomponents() {
        photo = new javax.swing.JLabel();
        sublabel= new javax.swing.JLabel();
        markslabel= new javax.swing.JLabel();
        calc_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        gpa_page = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        home_icon = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        gpa_icon = new javax.swing.JLabel();
       
        menu5 = new javax.swing.JPanel();
        about_us_icon = new javax.swing.JLabel();
        
        gpa_page.setBackground(new java.awt.Color(255, 255, 255));
        gpa_page.setSize(900,80);
        
        jPanel1.setBackground(new java.awt.Color(255, 177, 25));
        jPanel1.setLayout(null); 

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomain.png"))); 
        jLabel1.setBounds(45, 13, jLabel1.getPreferredSize().width, jLabel1.getPreferredSize().height); 

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); 
        jLabel2.setForeground(new java.awt.Color(6, 0, 66));
        jLabel2.setText("Average Grade Calculator");
        jLabel2.setBounds(250, 13, 600, 76); 
        this.add(jPanel1);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
     
        menu.setBackground(new java.awt.Color(6, 0, 66));
        menu.setLayout(null);
        menu.setBounds(0, 105, 120, 420);

        // Define the components for menu0
        menu1.setBackground(new java.awt.Color(6, 0, 66));
        menu1.setBounds(0,50 , 120, 53);
        menu1.setLayout(null);
        home_icon.setForeground(new java.awt.Color(255, 153, 0));
        home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layer 3.png")));
        home_icon.setBounds(35, 2, 50, 50);
        menu1.add(home_icon);
        menu.add(menu1);

        // Define the components for menu2
        menu2.setBackground(new java.awt.Color(6, 0, 66));
        menu2.setBounds(0, 150, 120, 53);
        menu2.setLayout(null);
        gpa_icon.setForeground(new java.awt.Color(255, 153, 0));
        gpa_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpa_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calc.png")));
        gpa_icon.setBounds(35, 2, 50, 50);
        menu2.add(gpa_icon);
        menu.add(menu2);

    

        // Define the components for menu5
        menu5.setBackground(new java.awt.Color(6, 0, 66));
        menu5.setBounds(0, 250, 120, 53);

        menu5.setLayout(null);
        about_us_icon.setForeground(new java.awt.Color(255, 153, 0));
        about_us_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        about_us_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about us.png")));
        about_us_icon.setBounds(35, 2, 50, 50);
        menu5.add(about_us_icon);
        menu.add(menu5);
        jPanel1.add(menu);
        
        jPanel2.setBackground(new java.awt.Color(255,255,255));
        jPanel2.setLayout(null);
        jPanel2.setBounds(120, 105, 780, 420);
        jPanel1.add(jPanel2);
        
        
        
         // Declare an array of JTextField
            JLabel[] num = new JLabel[6];
            int space =20;
            int index=1;
        // Initialize the array
        for (int i = 0; i < 6; i++) 
        {
            num[i] = new JLabel();
            jPanel2.add(num[i]);
            num[i].setText(Integer.toString(index)+"-");
            index++;
            num[i].setBounds(40, 35+space, 40, 35);
            space+=50;
            num[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
            num[i].setForeground(new java.awt.Color(255, 153, 00));
            num[i].setHorizontalAlignment(javax.swing.JTextField.CENTER);
            num[i].setBorder(null);
            
        }
            space=20;
        // Declare an array of JTextField
            JPanel[] subsep = new JPanel[6];
        // Initialize the array
        for (int i = 0; i < sub.length; i++) {
            sub[i] = new JTextField();
            jPanel2.add(sub[i]);
            sub[i].setBounds(80, 35+space, 175, 35);
            sub[i].setBackground(new java.awt.Color(249, 214, 146));
            sub[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
            sub[i].setForeground(new java.awt.Color(6, 0, 66));
            sub[i].setHorizontalAlignment(javax.swing.JTextField.CENTER);
            sub[i].setBorder(null);
            sub[i].setSelectionColor(new java.awt.Color(255, 177, 25));
            subsep[i] = new JPanel();
            jPanel2.add(subsep[i]);
            subsep[i].setBounds(80, 70+space, 0, 0);
            subsep[i].setBackground(new java.awt.Color(255, 153, 0));
            subsep[i].setSize(new Dimension(175, 3)); 
            space+=50;
        }
            
         
        
         space=20;
        // Declare an array of JTextField
            JPanel[]  your_markssep = new JPanel[6];
        // Initialize the array
        for (int i = 0; i <  your_marks.length; i++) {
                your_marks[i] = new JTextField();
                jPanel2.add( your_marks[i]);
                your_marks[i].setBounds(270, 35+space, 160, 35);
                your_marks[i].setBackground(new java.awt.Color(249, 214, 146));
                your_marks[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
                your_marks[i].setForeground(new java.awt.Color(6, 0, 66));
                your_marks[i].setHorizontalAlignment(javax.swing.JTextField.CENTER);
                your_marks[i].setBorder(null);
                your_marks[i].setSelectionColor(new java.awt.Color(255, 177, 25));
                your_markssep[i] = new JPanel();
                jPanel2.add( your_markssep[i]);
                your_markssep[i].setBounds(270, 70+space, 0, 0);
                your_markssep[i].setBackground(new java.awt.Color(255, 153, 0));
                your_markssep[i].setSize(new Dimension(160, 3)); 
                space+=50;
        }
        
        
         
        markslabel.setText("Your marks");
        markslabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
        markslabel.setBounds(305, 20, 120, 35);
        markslabel.setForeground(new java.awt.Color(6, 0, 66));
        jPanel2.add( markslabel);
        
        
        sublabel.setText("Subject");
        sublabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
        sublabel.setBounds(140, 20, 120, 35);
        sublabel.setForeground(new java.awt.Color(6, 0, 66));
        jPanel2.add( sublabel);
        
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lol.png"))); // NOI18N
        photo.setBounds(470, 10, 500, 500);
        jPanel2.add(photo);
        
        
        jPanel2.add(calc_btn);
        calc_btn.setText("calculate");
        calc_btn.setBounds(80, 355, 350, 35);
        calc_btn.setBackground(new java.awt.Color(249, 214, 146));
        calc_btn.setForeground(new java.awt.Color(6, 0, 66));
        
        
        

        
        calc_btn.addActionListener(this);
        menu1.addMouseListener(this);
        menu2.addMouseListener(this);
        menu5.addMouseListener(this);
    }
    
    
    
    
    private javax.swing.JButton calc_btn;
    private javax.swing.JLabel sublabel;
    private javax.swing.JLabel markslabel;
    private javax.swing.JLabel about_us_icon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu5;
    private javax.swing.JLabel gpa_icon;
    private javax.swing.JPanel gpa_page;
    private javax.swing.JLabel home_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel photo;
    
    

        @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==calc_btn){
       
          
           for (int i = 0; i < 6; i++) 
           {
            subject[i]=sub[i].getText();
            cred[i]= your_marks[i].getText();
            marks[i]= Double.parseDouble(cred[i]);            
           }
                      boolean valid=true;
              for (int i=0;i<6;i++){
                  if(marks[i]>100)
                  {           valid=false; 
                            
                    }}
              
              if (valid){
                    results g=new results(namek,idk,subject,marks);
                    g.setVisible(true);
                    this.setVisible(false);
              }else{               
                  JOptionPane.showMessageDialog(null, "Please enter avalid numbers", "invalid inputs", JOptionPane.WARNING_MESSAGE);
}
               
        }      
          
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            if (e.getSource()==menu1)
            {
                login g = new login();
                g.stud_name.setText(namek);
                g.stud_id.setText(idk);
                g.setVisible(true);
                this.setVisible(false);
            }
           
            if (e.getSource()==menu5)
            {
                Aboutus g = new Aboutus();
                g.setVisible(true);
                this.setVisible(false);
            }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
