/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidhappinesstracker;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Jaco Coetsee
 */
public class actualHistory extends javax.swing.JFrame {
    private activityTracker ac = new activityTracker();
    private ResultSet rs;
    ArrayList<Integer> rawData = new ArrayList();
    ArrayList<String> dates = new ArrayList();
    private DecimalFormat df = new DecimalFormat("#.##");
    /**
     * Creates new form actualHistory
     */
    
    public actualHistory() {
        initComponents();
        try {
            rs = ac.getValues();
            rawData = new ArrayList(getTableValues(rs));
            ArrayList<Integer> allScores = new ArrayList(getScores(rawData));
            populateTable(allScores);
        } catch (SQLException ex) {
            Logger.getLogger(actualHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private ArrayList<Integer> getTableValues(ResultSet results) throws SQLException{
        ArrayList<Integer> data = new ArrayList();
        while(results.next()){
            String date = "";
            for(int i = 0; i < 8; i ++){
                int _id = rs.getInt("ID");
                int _actid = rs.getInt("act_ID");
                date = rs.getString("whenDid");
                int amount = rs.getInt("amountDone");
                data.add(amount);
                if(i!= 7){
                    rs.next();
                }
            }
            dates.add(date);
        }
        
        return data;
    }
    private ArrayList<Integer> getScores(ArrayList<Integer> rd){
        ArrayList<Integer> scores = new ArrayList();
        int total = 0;
        for(int i = 0; i  < rd.size(); i ++){
            if(i%8 == 0 && i != 0){
                scores.add(total);
                total = 0;
            }
            if(rd.get(i) <= 1){
                if(rd.get(i) == 1){
                    total+= 10;
                }
            }else if(rd.get(i)> 1 && rd.get(i) <= 3){
                if(rd.get(i) == 2){
                    total+= 5;
                }else{
                    total += 10;
                }
            }else if(rd.get(i)>3 && rd.get(i) <= 20){
                total += (int)(rd.get(i)/20)*10;
            }else if(rd.get(i)> 20 && rd.get(i) <= 40){
                total += (int)(rd.get(i)/40)*10;
            }else{
                total += (int)(rd.get(i)/3000)*10;
            }
        }
        scores.add(total);
        return scores;
    }
    private void populateTable(ArrayList<Integer> _scores){
        clearTable();
        for(int i = 0; i < _scores.size(); i++){
            double perc = (_scores.get(i)/50.0)*100.0;
            String data[] = {dates.get(i), perc + "%"};
            DefaultTableModel model = (DefaultTableModel)historyTable.getModel();
            model.addRow(data);
        }
    }
    private void clearTable(){
        DefaultTableModel model = (DefaultTableModel)historyTable.getModel();
        while(model.getRowCount()> 0){
            model.removeRow(0);
        }
    }
    //private int calculateScore
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        titleBlock1 = new javax.swing.JLabel();
        reportButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(historyTable);

        titleBlock1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleBlock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleBlock1.setText("History");

        reportButton.setText("Generate Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(backButton)
                                .addGap(106, 106, 106)
                                .addComponent(titleBlock1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(titleBlock1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        main_GUI mg = new main_GUI();
        mg.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        int rows = historyTable.getRowCount();
        double total = 0.0;
        for(int i = 0; i < rows; i ++){
            String stringPerc = (String)historyTable.getValueAt(i, 1);
            int percIndex = stringPerc.indexOf("%");
            total += Double.parseDouble(stringPerc.substring(0,percIndex));
        }
        double average = total/rows;
        if(average < 30.0){
            JOptionPane.showMessageDialog(null, "Your average daily score is " + df.format(average) + "%\n"+
                                            "This score is very low, maybe you should contact a close friend or a relative and notify them of your situation.");
        }else if(average >= 30.0 && average < 60.0){
            JOptionPane.showMessageDialog(null, "Your average daily score is " + df.format(average) + "%\n"+
                                            "This score is not ideal, just try and focus on one thing at a time and slowly you will get better at managing your time in quarantine.");
        }else if(average >= 60.0 && average < 85.0){
            JOptionPane.showMessageDialog(null, "Your average daily score is " + df.format(average) + "%\n"+
                                            "Decent score, you'll definitely survive quarantine, but you can always strive for more.");
        }else{
            JOptionPane.showMessageDialog(null, "Your average daily score is " + df.format(average) + "%\n"+
                                            "Well done, you really have your stuff in order!");
        }
    }//GEN-LAST:event_reportButtonActionPerformed

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
            java.util.logging.Logger.getLogger(actualHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable historyTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel titleBlock1;
    // End of variables declaration//GEN-END:variables
}
