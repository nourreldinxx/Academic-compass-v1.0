    package calculator;

//    import java.awt.Dimension;
import java.awt.Dimension;
    import java.awt.event.*;
//    import java.awt.event.MouseEvent;
//    import java.awt.event.ActionListener;
//    import java.awt.event.MouseListener;
    import javax.swing.*;

    public class GPA_calc extends javax.swing.JFrame implements ActionListener,MouseListener{
                JTextField[] sub = new JTextField[6];
                JTextField[]  credit = new JTextField[6];
                String[] subject = new String[6];
                String[] grad = new String[6];
                String[] cred = new String[6];
                JComboBox[] grade = new JComboBox[6];
                boolean filled=false;
                int[] hours=new int[6];
                                double totalgrades=0;

               
                 String namek;
                String idk;
                    
        public GPA_calc(String namef, String idf)
        {
            this.setTitle("Academiccompass");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(900,550);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            initcomponents();
            namek = namef;
            idk=idf;
        }



        private void initcomponents(){
            
            sublabel= new javax.swing.JLabel();
            creditlabel= new javax.swing.JLabel();
            gradelabel= new javax.swing.JLabel();
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
            

            result_icon = new javax.swing.JLabel();
            menu4 = new javax.swing.JPanel();
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
            jLabel2.setText("GPA Calculator");
            jLabel2.setBounds(350, 13, 325, 76); // Set bounds instead of using layout
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

            jPanel2.setBackground(new java.awt.Color(255,255,255));
            jPanel2.setLayout(null);
            jPanel2.setBounds(120, 105, 780, 420);
            jPanel1.add(jPanel2);


            sublabel.setText("Subject");
            sublabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
            sublabel.setBounds(140, 20, 120, 35);
            sublabel.setForeground(new java.awt.Color(6, 0, 66));
            jPanel2.add(sublabel);

            creditlabel.setText("Credit");
            creditlabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
            creditlabel.setBounds(320, 20, 120, 35);
            creditlabel.setForeground(new java.awt.Color(6, 0, 66));
            jPanel2.add( creditlabel);


             gradelabel.setText("Grade");
             gradelabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); 
             gradelabel.setBounds(500, 20, 120, 35);
             gradelabel.setForeground(new java.awt.Color(6, 0, 66));
            jPanel2.add( gradelabel);



           jPanel2.add(calc_btn);
           calc_btn.setText("calculate");
           calc_btn.setBounds(270, 355, 350, 35);
           calc_btn.setBackground(new java.awt.Color(249, 214, 146));
           calc_btn.setForeground(new java.awt.Color(6, 0, 66));


                
             // Declare an array of jtextField
            JLabel[] num = new JLabel[6];
                int space =20;
                int index=1;
            // Initialize the array
            for (int i = 0; i < 6; i++) {
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
                JPanel[]  creditsep = new JPanel[6];
            // Initialize the array
            for (int i = 0; i <  credit.length; i++) {
                 credit[i] = new JTextField();
                 jPanel2.add( credit[i]);
                 credit[i].setBounds(270, 35+space, 160, 35);
                 credit[i].setBackground(new java.awt.Color(249, 214, 146));
                 credit[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
                 credit[i].setForeground(new java.awt.Color(6, 0, 66));
                 credit[i].setHorizontalAlignment(javax.swing.JTextField.CENTER);
                 credit[i].setBorder(null);
                 credit[i].setSelectionColor(new java.awt.Color(255, 177, 25));
                 creditsep[i] = new JPanel();
                 jPanel2.add( creditsep[i]);
                 creditsep[i].setBounds(270, 70+space, 0, 0);
                 creditsep[i].setBackground(new java.awt.Color(255, 153, 0));
                 creditsep[i].setSize(new Dimension(160, 3)); 
                 space+=50;
            }



            space=20;
            // Declare an array of JTextField
            // Initialize the array
            for (int i = 0; i < grade.length; i++) 
            {
                grade[i] = new JComboBox();
                jPanel2.add(grade[i]);
                grade[i].setBounds(445, 35+space, 175, 38);
                grade[i].setBackground(new java.awt.Color(249, 214, 146));
                grade[i].setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
                grade[i].setForeground(new java.awt.Color(6, 0, 66));
                grade[i].setBorder(null);
                // Customize the renderer
                DefaultListCellRenderer renderer = new DefaultListCellRenderer();
                renderer.setHorizontalAlignment(JLabel.CENTER); // Center-align the text
                grade[i].setRenderer(renderer);
                grade[i].setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","A", "A-", "B+", "B","B-","C+","C","C-","D+","D" ,"D-","F" }));
                space+=50;
            }

            
           
            
            calc_btn.addActionListener(this);
            menu1.addMouseListener(this);
            menu4.addMouseListener(this);
            menu5.addMouseListener(this);
        }
        
        
        

          

        private javax.swing.JButton calc_btn;
        private javax.swing.JLabel sublabel;
        private javax.swing.JLabel gradelabel;
        private javax.swing.JLabel creditlabel;
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



        @Override
                @SuppressWarnings("empty-statement")
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==calc_btn)
            {
               for (int i = 0; i < 6; i++) 
               {
                subject[i]=sub[i].getText();
                grad[i] = String.valueOf(grade[i].getSelectedItem());
                cred[i]=credit[i].getText();
                hours[i]= Integer.parseInt(cred[i]);
                  switch (grad[i]) 
              {
                       case "A" -> totalgrades+= hours[i]*4;
                       case "A-" -> totalgrades+= hours[i]* 3.7;
                       case "B+" -> totalgrades+= hours[i]* 3.3;
                       case "B" -> totalgrades+=  hours[i]*3;
                       case "B-" -> totalgrades+= hours[i]* 2.7;
                       case "C+" -> totalgrades+= hours[i]* 2.3;
                       case "C" -> totalgrades+=  hours[i]*2;
                       case "C-" -> totalgrades+=  hours[i]*1.7;
                       case "D+" -> totalgrades+=  hours[i]*1.3;
                       case "D" -> totalgrades+=  hours[i]*1;
                       case "D-" -> totalgrades+=  hours[i]*0.7;
                       default -> totalgrades+=  0;
              }              
               }
                filled=true;
                gpacert g= new gpacert(namek,idk,subject,grad,hours,totalgrades);
                g.setVisible(true);
                this.setVisible(false);
                
            }      
        }
        @Override
        public void mouseClicked(MouseEvent e)
        {
                if (e.getSource()==menu1)
                {
                    login g = new login();
                    g.setVisible(true);
                    this.setVisible(false);
                }
                if (e.getSource()==menu4)
                {
                    if(filled==false) 
                    {
                        JOptionPane.showMessageDialog(null, "Please fill the form to be able to see the results", "unaccessable page", JOptionPane.WARNING_MESSAGE);
                    }
                    else 
                    {
                    
                    gpacert g = new gpacert(namek, idk, subject, grad, hours,totalgrades);
                    g.setVisible(true);
                    this.setVisible(false);
                    }
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

