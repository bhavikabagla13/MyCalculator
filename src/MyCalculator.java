
public class MyCalculator extends javax.swing.JFrame {

   double num1=0,num2=0;
   String operator=null;
    
    
    public MyCalculator() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bdivide = new javax.swing.JButton();
        bmultiply = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        b0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(500, 100));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Calculator");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bdivide.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bdivide.setText("/");
        bdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivideActionPerformed(evt);
            }
        });

        bmultiply.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bmultiply.setText("*");
        bmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bdot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        bequal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bminus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        bplus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 69, Short.MAX_VALUE)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(b4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(bdot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(70, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bequal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bmultiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bdivide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(bplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {                                       
       num1=Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator="-";
    }                                      

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
                jTextField1.setText(jTextField1.getText()+"5");

    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               jTextField1.setText(jTextField1.getText()+"2");

    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               jTextField1.setText(jTextField1.getText()+"6");

    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        jTextField1.setText(jTextField1.getText()+"7");
        
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
              jTextField1.setText(jTextField1.getText()+"8");

    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
                jTextField1.setText(jTextField1.getText()+"9");

    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
                jTextField1.setText(jTextField1.getText()+"1");

    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
                jTextField1.setText(jTextField1.getText()+"3");

    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               jTextField1.setText(jTextField1.getText()+"4");

    }                                  

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
               jTextField1.setText(jTextField1.getText()+"0");

    }                                  

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {                                     
               jTextField1.setText(jTextField1.getText()+".");

    }                                    

    private void bdivideActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num1=Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator="/";
        
        
    }                                       

    private void bmultiplyActionPerformed(java.awt.event.ActionEvent evt) {                                          
       num1=Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator="*";
    }                                         

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {                                      
       num1=Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        operator="+";
    }                                     

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        
        num2=Double.parseDouble(jTextField1.getText());
        
        double ans=0;
        
        if(operator  == "+"){
            
            ans=num1+num2;
        }
        if(operator  == "-"){
            
            ans=num1-num2;
        }
        if(operator  == "*"){
            
            ans=num1*num2;
        }
        if(operator  == "/"){
            
            ans=num1/num2;
        }
        
        jTextField1.setText(""+ans);
        
        operator=null;
    }                                      

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jTextField1.setText("");
    }                                     

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String str=jTextField1.getText();
        
        jTextField1.setText(str.substring(0,str.length()-1));
        
    }                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton back;
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmultiply;
    private javax.swing.JButton bplus;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
