package nea.project.program;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ProgressTrackerUI extends javax.swing.JFrame {

    Connection Connecting = null;
    ResultSet Result = null;
    PreparedStatement Stmt = null;
    String Query;
    public static String UsersID;

    public ProgressTrackerUI() {
        initComponents();
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setVerticalAlignment(SwingConstants.CENTER);
        lblChoose.setVerticalAlignment(SwingConstants.CENTER);
        lblChoose.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panGraph = new javax.swing.JPanel();
        btnOkay = new javax.swing.JButton();
        lblChoose = new javax.swing.JLabel();
        comTopic = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(66, 100, 100));

        lblTitle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Progress Tracker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panGraphLayout = new javax.swing.GroupLayout(panGraph);
        panGraph.setLayout(panGraphLayout);
        panGraphLayout.setHorizontalGroup(
            panGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panGraphLayout.setVerticalGroup(
            panGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        btnOkay.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnOkay.setText("Okay");
        btnOkay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkayActionPerformed(evt);
            }
        });

        lblChoose.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        lblChoose.setText("Which Topic's Progress would you like to view?");

        comTopic.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        comTopic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quadratics", "Coordinate Geometry", "Numerical Equations" }));

        btnExit.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(panGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(comTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOkay)
                .addGap(459, 459, 459))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOkay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkayActionPerformed
        //Declares the item chosen in the combo box as a variable
        String TopicChoice = comTopic.getSelectedItem().toString();
        String Topic = "";
        String ChartTitle = "";
        
        //Assigns topic a value based on what item was chosen in the combo box, as well as declaring part of the chart title
        
        switch (TopicChoice) {
            case "Quadratics":
                Topic = "1";
                ChartTitle = "Quadratics";
                break;
            case "Coordinate Geometry":
                Topic = "2";
                ChartTitle = "Coordinate Geometry";
                break;
            case "Numerical Equations":
                Topic = "3";
                ChartTitle = "Numerical Equations";
                break;
            default:
                break;
        }
        //A connection to the database
        Connecting = ConnectDB.ConnectDB();
        //Assigns the first chart value a percentage based on the users target grade
        //Used so that the user can see how they are progressing towards their target grade
        int TargetValue = 0;
        try {
            Query = "SELECT TargetGrade FROM user WHERE UserID = ?";
            Stmt = Connecting.prepareStatement(Query);
            Stmt.setString(1, UsersID);
            Result = Stmt.executeQuery();
            while (Result.next()) {
                String TargetGrade = Result.getString("TargetGrade");

                switch (TargetGrade) {
                    case "A*/A": {
                        TargetValue = 80;
                        break;
                    }
                    case "B": {
                        TargetValue = 60;
                        break;
                    }
                    case "C": {
                        TargetValue = 40;
                        break;
                    }
                    default:
                        break;
                }
                
                //Takes the users  percentage to display it as a value of the chart
                Query = "SELECT Topic" + Topic + "Percentage FROM progress WHERE UserID = ?";
                Stmt = Connecting.prepareStatement(Query);
                Stmt.setString(1, UsersID);
                Result = Stmt.executeQuery();   
                if (Result.next()) {
                    String UserValue = Result.getString("Topic" + Topic + "Percentage");

                    
                    //Selects every user ID in the table
                    Query = "SELECT UserID FROM user";
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery();
                    //represents the number of users in the table
                    int NoUsers = 0;
                    //Selects the last User ID in tbe result set
                    Result.last();
                    //Gets the row number of the last User ID, so that I can get the number of users in the table
                    NoUsers = Result.getRow();
                    Result.beforeFirst();
                    //Selects every users percentage from the table
                    Query = "SELECT Topic" + Topic + "Percentage FROM progress";
                    Stmt = Connecting.prepareStatement(Query);
                    Result = Stmt.executeQuery();
                    int TotalPercent = 0;
                    int PercentCheck = 0;
                    //I need to get a sum of every users percentage, to do this i need to use a loop 
                    while (Result.next() && PercentCheck < NoUsers) {
                        
                        /*On the first Iteration of the loop, Individual percent will be the first users percentage,
                        * The second iteration will be the second user and so on. */
                        String IndividualPercent = Result.getString("Topic" + Topic + "Percentage");
                        //The individual Percent is added to a running total of all the other user's percentages before that user
                        TotalPercent = TotalPercent + Integer.parseInt(IndividualPercent);
                        //PercentCheck is used to make sure that the number of iterations is the same as the number of users
                        PercentCheck = PercentCheck + 1;
                        }

                    
                    //To find the average percentage of all users, the total percent is divided by the numberof users
                    int AverageValue = TotalPercent / NoUsers;
                    
                    //Sets the number of values there will be on the chart and what those values will be
                    DefaultCategoryDataset ChartData = new DefaultCategoryDataset();
                    ChartData.setValue(TargetValue, "Row1", "Required to achieve Target");
                    ChartData.setValue(Integer.parseInt(UserValue), "Row2", "Current Percentage");
                    ChartData.setValue(AverageValue, "Row3", "Average of All Users");
                   
                    //The Chart title was set to a certain topic name at the start of the code, so the title will be specific to each topic
                    ChartTitle = "Progress in " + ChartTitle;
                    

                    //Creates a bar chart and fills in all the chart data, as well as titles for the two axis
                    JFreeChart Chart = ChartFactory.createBarChart(ChartTitle, "Percentages", "%", ChartData, PlotOrientation.HORIZONTAL, false, false, false);

                    //Displays the bar chart on the panel panGraph
                    panGraph.setLayout(new java.awt.BorderLayout());
                    ChartPanel Panel = new ChartPanel(Chart);
                    panGraph.add(Panel, BorderLayout.CENTER);
                    panGraph.validate();

                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnOkayActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        new MainMenuUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ProgressTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressTrackerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOkay;
    private javax.swing.JComboBox<String> comTopic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panGraph;
    // End of variables declaration//GEN-END:variables
}
