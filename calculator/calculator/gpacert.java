
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gpacert extends JFrame implements ActionListener, MouseListener {

    
        String[] g=new String[6];
        int[] h=new int[6];
        String[] s=new String[6];
        
         int totalhours=0;
                double totalgrades;         
                double gpa;
                String mark;
    public gpacert(String namek, String idk, String[] subject, String[] grad, int[] hours, double totalgrades1) {
        


        for(int i=0;i<6;i++){
            s[i]=subject[i];
            g[i]=grad[i]; 
            h[i]=hours[i];
        }
        totalgrades=totalgrades1;
        
        this.setTitle("Academiccompass");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 550);
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

        menu4 = new javax.swing.JPanel();
        result_icon = new javax.swing.JLabel();
        menu5 = new javax.swing.JPanel();
        about_us_icon = new javax.swing.JLabel();
        cert = new javax.swing.JLabel();
        stud_name = new javax.swing.JLabel();
        stud_ID = new javax.swing.JLabel();
        avg = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        GPA = new javax.swing.JLabel();
        stamp = new javax.swing.JLabel();
        quote = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        gpa_page.setBackground(new java.awt.Color(255, 255, 255));
        gpa_page.setSize(900, 80);

        jPanel1.setBackground(new java.awt.Color(255, 177, 25));
        jPanel1.setLayout(null);
        // Set layout to null for absolute positioning

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomain.png"))); // NOI18N
        jLabel1.setBounds(45, 13, jLabel1.getPreferredSize().width, jLabel1.getPreferredSize().height); // Set bounds
                                                                                                        // instead of
                                                                                                        // using layout

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 0, 66));
        jLabel2.setText("Final results");
        jLabel2.setBounds(380, 13, 600, 76); // Set bounds instead of using layout
        this.add(jPanel1);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);

        // Set the background color for the menu and use null layout for absolute
        // positioning
        menu.setBackground(new java.awt.Color(6, 0, 66));
        menu.setLayout(null);
        menu.setBounds(0, 105, 120, 420);

        // Define the components for menu0
        menu1.setBackground(new java.awt.Color(6, 0, 66));
        menu1.setBounds(0, 50, 120, 53);
        menu1.setLayout(null);
        home_icon.setForeground(new java.awt.Color(255, 153, 0));
        home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Layer 3.png")));
        home_icon.setBounds(35, 2, 50, 50);
        menu1.add(home_icon);
        menu.add(menu1);

        // Define the components for menu2
        menu2.setBackground(new java.awt.Color(6, 0, 66));
        menu2.setBounds(0, 120, 120, 53);
        menu2.setLayout(null);
        gpa_icon.setForeground(new java.awt.Color(255, 153, 0));
        gpa_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpa_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calc.png")));
        gpa_icon.setBounds(35, 2, 50, 50);
        menu2.add(gpa_icon);
        menu.add(menu2);

        // Define the components for menu4
        menu4.setBackground(new java.awt.Color(6, 0, 66));
        menu4.setBounds(0, 180, 120, 53);
        menu4.setLayout(null);
        result_icon.setForeground(new java.awt.Color(255, 153, 0));
        result_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result.png")));
        result_icon.setBounds(35, 2, 50, 50);
        menu4.add(result_icon);
        menu.add(menu4);

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.setBounds(120, 105, 780, 420);
        jPanel1.add(jPanel2);
        
        for(int i=0;i<6;i++){
        totalhours+=h[i]; 
               }
               gpa=totalgrades/totalhours; 
                
                  if(gpa>3.7)
                mark= "A";
            else if(gpa>3.3&&gpa<=3.7)
                mark= "A-";
            else if(gpa>3.0&&gpa<=3.3)
                mark= "B+";
            else if(gpa>2.7&&gpa<=3.0)
                mark= "B";
            else if(gpa>2.3&&gpa<=2.7)
                mark= "B-";
            else if(gpa>2.0&&gpa<=2.3)
                mark= "C+";
            else if(gpa>1.7&&gpa<=2.0)
                mark= "C";
            else if(gpa>1.3&&gpa<=1.7)
                mark= "C-";
            else if(gpa>1.0&&gpa<=1.3)
                mark= "D+";
            else if(gpa>0.7&&gpa<=1.0)
                mark= "D";
            else if(gpa>0.3&&gpa<=0.7)
                mark= "D-";
            else
                mark= "F"; 
       

        grade.setText(mark);
        if ("F".equals(grade.getText())) {

            stud_name.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            stud_name.setForeground(new java.awt.Color(6, 0, 66));
            jPanel2.add(stud_name);
            stud_name.setBounds(20, 100, 400, 42);

            stud_ID.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            stud_ID.setForeground(new java.awt.Color(6, 0, 66));
            jPanel2.add(stud_ID);
            stud_ID.setBounds(20, 150, 350, 42);

            GPA.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            GPA.setForeground(new java.awt.Color(6, 0, 66));
            GPA.setText(String.format("%.2f", gpa));
            jPanel2.add(GPA);
            GPA.setBounds(20, 200, 350, 25);

            avg.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            avg.setForeground(new java.awt.Color(6, 0, 66));
            avg.setText("Avg. grade : 97.5%");
            jPanel2.add(avg);
            avg.setBounds(20, 250, 350, 25);

            grade.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            grade.setForeground(new java.awt.Color(6, 0, 66));
            grade.setText("Overall grade : "+ mark);
            jPanel2.add(grade);
            grade.setBounds(20, 300, 350, 25);

            quote.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
            quote.setForeground(new java.awt.Color(6, 0, 66));
            quote.setText("“Failure is the condiment that gives success its flavor.”");
            jPanel2.add(quote);
            quote.setBounds(20, 350, 600, 40);

            note.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            note.setForeground(new java.awt.Color(6, 0, 66));
            note.setText("I regret to tell you that the exam didn’t go well.");
            jPanel2.add(note);
            note.setBounds(20, 35, 600, 40);

            stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\F.png")); // NOI18N
                    jPanel2.add(stamp);
                    stamp.setBounds(450, 60, 300, 300);

        } 
        else {

            cert.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\GPAcert.png")); // NOI18N
            cert.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
            cert.setForeground(new java.awt.Color(6, 0, 66));
            cert.setSize(800, 390);
            jPanel2.add(cert);
            cert.setBounds(10, 10, 800, 390);

            GPA.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
            GPA.setForeground(new java.awt.Color(6, 0, 66));
            GPA.setText(String.format("%.2f", gpa));
            cert.add(GPA);
            GPA.setBounds(580, 195, 350, 25);

            grade.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
            grade.setForeground(new java.awt.Color(6, 0, 66));
            grade.setText(mark);
            cert.add(grade);
            grade.setBounds(585, 240, 350, 25);

            switch (grade.getText()) {
                case "A" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\A.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "A-" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\A-.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "B+" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\B+.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "B" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\B.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "B-" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\B-.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "C+" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\C+.png")); // NOI18N
            stud_ID.setText("ID: ");
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "C" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\C.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "C-" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\C-.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "D+" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\D+.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "D" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\D.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                case "D-" -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\D-.png")); // NOI18N
                    cert.add(stamp);
                    stamp.setBounds(620, 160, 200, 200);
                }
                default -> {
                    stamp.setIcon(new javax.swing.ImageIcon("E:\\New folder (2)\\F.png")); // NOI18N
                    jPanel2.add(stamp);
                    stamp.setBounds(450, 60, 300, 300);
                }
            }


                   
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
            
            
             JLabel[] gr = new JLabel[6];
          
        for (int i = 0; i < 6; i++) {
            gr[i] = new JLabel();
            gr[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
            gr[i].setForeground(new java.awt.Color(6, 0, 66));
            cert.add(gr[i]);
            gr[i].setText(g[i]);

        }
            gr[0].setBounds(220, 303, 350, 25);
            gr[1].setBounds(455, 303, 350, 25);
            gr[2].setBounds(670, 303, 350, 25);
            gr[3].setBounds(220, 340, 350, 25);
            gr[4].setBounds(455, 340, 350, 25);
            gr[5].setBounds(670, 340, 350, 25);

            
            
            
            stud_name.setFont(new java.awt.Font("Edwardian Script ITC", 0, 42)); // NOI18N
            stud_name.setForeground(new java.awt.Color(6, 0, 66));
            cert.add(stud_name);
            stud_name.setBounds(250, 140, 500, 42);
            

         

            stud_ID.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
            stud_ID.setForeground(new java.awt.Color(6, 0, 66));
            cert.add(stud_ID);
            stud_ID.setBounds(240, 245, 350, 25);

            menu1.addMouseListener(this);
            menu2.addMouseListener(this);
            menu5.addMouseListener(this);

        }

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
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JLabel result_icon;
    private javax.swing.JLabel gpa_icon;
    private javax.swing.JPanel gpa_page;
    private javax.swing.JLabel home_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel cert;
    public javax.swing.JLabel stud_name;
    public javax.swing.JLabel stud_ID;
    public javax.swing.JLabel GPA;
    public javax.swing.JLabel grade;
    public javax.swing.JLabel avg;
    public javax.swing.JLabel stamp;
    public javax.swing.JLabel quote;
    public javax.swing.JLabel note;
    public javax.swing.JLabel score;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == menu1) {
            login g = new login();
            g.setVisible(true);
            this.setVisible(false);
        }
       

        if (e.getSource() == menu5) {
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
