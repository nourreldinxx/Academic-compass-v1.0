
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Aboutus extends javax.swing.JFrame implements ActionListener,MouseListener {
    
    public Aboutus()
    {
        this.setTitle("Academiccompass");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initcomponents();
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
        
        
        
        
         gpa_page.setBackground(new java.awt.Color(255, 255, 255));
        gpa_page.setSize(900,80);
        
        jPanel1.setBackground(new java.awt.Color(255, 177, 25));
        jPanel1.setLayout(null); 
//      Set layout to null for absolute positioning

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomain.png"))); // NOI18N
        jLabel1.setBounds(45, 13, jLabel1.getPreferredSize().width, jLabel1.getPreferredSize().height); // Set bounds instead of using layout

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 0, 66));
        jLabel2.setText("About me");
        jLabel2.setBounds(430, 13, 600, 76); // Set bounds instead of using layout
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
        
        
        
          int space;
         // Declare an array of JTextField
        JLabel names = new JLabel();
        
        // Initialize the array
        
            jPanel2.add(names);
            names.setBounds(40, 35+20, 250, 250);
           
            names.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            names.setForeground(new java.awt.Color(6, 0, 66));
        
            names.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nonz.png")));
            

            
         // Declare an array of JTextField
        JLabel[] ID = new JLabel[6];
            space =20;
        // Initialize the array
        for (int i = 0; i < 6; i++) {
            ID[i] = new JLabel();
            jPanel2.add(ID[i]);
            ID[i].setBounds(300, 25+space, 800, 35);
            space+=50;
            ID[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            ID[i].setForeground(new java.awt.Color(6, 0, 66));
        }
            ID[0].setText("Nour Eldin Ahmed");
            ID[1].setText("Computer science student");
            ID[2].setText("www.fb.com/nourreldinxx/");
            ID[3].setText("www.github.com/nourreldinxx/");
            ID[4].setText("www.linkedin.com/in/nour-aldin-ahmed/");
            ID[5].setText("+20 01119404075");
            
            
        menu1.addMouseListener(this);
        menu2.addMouseListener(this);
       
            
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

    @Override
    public void actionPerformed(ActionEvent e) {
          }

    @Override
    public void mouseClicked(MouseEvent e) {
         if (e.getSource()==menu1)
            {
                login g = new login();
                g.setVisible(true);
                this.setVisible(false);
            }
         
            if (e.getSource()==menu2)
            {
                JOptionPane.showMessageDialog(null, "Please return home to calculate a new result", "unaccessable page", JOptionPane.WARNING_MESSAGE);
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
