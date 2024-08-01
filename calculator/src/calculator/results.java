package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class results extends JFrame implements ActionListener,MouseListener {

        double[] h=new double[6];
        String[] s=new String[6];
        double totalmarks=0;
        String name,id;
        
        
        
        public results(String namek,String idk,String[] subject,double[] marks)
        {
        for(int i=0;i<6;i++){
            s[i]=subject[i];
            h[i]=marks[i];
            totalmarks+=h[i];
            name = namek;
            id= idk;
        }
        
            
        this.setTitle("Academiccompass");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initcomponents();
        stud_name.setText(titleCase(namek));
        stud_ID.setText(idk);

        }

    private void initcomponents() {
 
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
        cert = new javax.swing.JLabel();
        stud_name = new javax.swing.JLabel();
        stud_ID = new javax.swing.JLabel();
        avg = new javax.swing.JLabel();
        score = new javax.swing.JLabel();


        
         gpa_page.setBackground(new java.awt.Color(255, 255, 255));
        gpa_page.setSize(900,80);
        
        jPanel1.setBackground(new java.awt.Color(255, 177, 25));
        jPanel1.setLayout(null); 
//      Set layout to null for absolute positioning

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomain.png"))); // NOI18N
        jLabel1.setBounds(45, 13, jLabel1.getPreferredSize().width, jLabel1.getPreferredSize().height); // Set bounds instead of using layout

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 0, 66));
        jLabel2.setText("Final results");
        jLabel2.setBounds(380, 13, 600, 76); // Set bounds instead of using layout
        this.add(jPanel1);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        
                // Set the background color for the menu and use null layout for absolute positioning
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
        menu5.setBounds(0, 240, 120, 53);

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

        cert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avgcert.png"))); // NOI18N
        cert.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        cert.setForeground(new java.awt.Color(6, 0, 66));
        cert.setSize(800,390);
        jPanel2.add(cert);
        cert.setBounds(10, 10, 800, 390);


        avg.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        avg.setForeground(new java.awt.Color(6, 0, 66));
        avg.setText(String.format("%.0f",(totalmarks))+"/600" );
        cert.add(avg);
        avg.setBounds(580, 195, 350, 25);

        score.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        score.setForeground(new java.awt.Color(6, 0, 66));
        score.setText(String.format("%.2f",(totalmarks/6))+"%");
        cert.add(score);
        score.setBounds(580, 240, 350, 25);     
       

        stud_name.setFont(new java.awt.Font("Edwardian Script ITC", 0, 42)); // NOI18N
        stud_name.setForeground(new java.awt.Color(6, 0, 66));
        
        cert.add(stud_name);
                stud_ID.setBounds(240, 245, 350, 25);   
                
                
                



        stud_ID.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        stud_ID.setForeground(new java.awt.Color(6, 0, 66));
        cert.add(stud_ID);
 
        
        stud_name.setBounds(250, 140, 500, 42);
        
        
                   
        JLabel[] subj = new JLabel[6];
          
        for (int i = 0; i < 6; i++) {
            subj[i] = new JLabel();
            subj[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
            subj[i].setForeground(new java.awt.Color(6, 0, 66));
            cert.add(subj[i]);
            subj[i].setText(s[i]);

        }
            subj[0].setBounds(55, 303, 350, 25);
            subj[1].setBounds(275, 303, 350, 25);
            subj[2].setBounds(510, 303, 350, 25);
            subj[3].setBounds(55, 340, 350, 25);
            subj[4].setBounds(275, 340, 350, 25);
            subj[5].setBounds(510, 340, 350, 25);
            
            
             JLabel[] marks = new JLabel[6];
          
        for (int i = 0; i < 6; i++) {
            marks[i] = new JLabel();
            marks[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
            marks[i].setForeground(new java.awt.Color(6, 0, 66));
            cert.add(marks[i]);
            marks[i].setText(String.format("%.1f", h[i])+"%");

        }
            marks[0].setBounds(195, 303, 350, 25);
            marks[1].setBounds(430, 303, 350, 25);
            marks[2].setBounds(650, 303, 350, 25);
            marks[3].setBounds(195, 340, 350, 25);
            marks[4].setBounds(430, 340, 350, 25);
            marks[5].setBounds(650, 340, 350, 25);




        menu1.addMouseListener(this);
    menu2.addMouseListener(this);
    menu5.addMouseListener(this);
    }
    
            public static String titleCase(String text) {
          if (text == null || text.isEmpty()) {
            return text; // Handle empty string or null case (optional)
          }

          StringBuilder result = new StringBuilder();
          boolean capitalize = true; // Flag to capitalize the first character

          for (char c : text.toCharArray()) {
            if (Character.isSpaceChar(c)) {
              capitalize = true; // Set flag to capitalize after a space
            } else if (capitalize) {
              result.append(Character.toUpperCase(c)); // Capitalize the first character of each word
              capitalize = false;
            } else {
              result.append(c); // Append remaining characters without change
            }
          }

          return result.toString();
        }

    
 
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
    private javax.swing.JLabel cert;
    private javax.swing.JLabel stud_name;
    private javax.swing.JLabel stud_ID;
    private javax.swing.JLabel avg;
    private javax.swing.JLabel score;


    @Override
    public void actionPerformed(ActionEvent e) {
       
}

    @Override
    public void mouseClicked(MouseEvent e) {
         if (e.getSource()==menu1)
            {
                login g = new login();
                 g.stud_name.setText(name);
                  g.stud_id.setText(id);
                g.setVisible(true);
                this.setVisible(false);
            }
         
            if (e.getSource()==menu2)
            {
               Avg_calc l=new Avg_calc(name,id);
                l.setVisible(true);
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
     

     
    



    

