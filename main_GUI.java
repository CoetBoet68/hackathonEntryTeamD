/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidhappinesstracker;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 */
public class main_GUI extends javax.swing.JFrame {
    activityTracker at = new activityTracker();

    public main_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        routineBoolGroup = new javax.swing.ButtonGroup();
        saunaButtonGroup = new javax.swing.ButtonGroup();
        nutrtionGroup = new javax.swing.ButtonGroup();
        SocialGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        exerciseAmount = new javax.swing.JFormattedTextField();
        exerciseSlider = new javax.swing.JSlider();
        outsideValue = new javax.swing.JFormattedTextField();
        outsideSlider = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sleepSlider = new javax.swing.JSlider();
        jLabel13 = new javax.swing.JLabel();
        sleepValue = new javax.swing.JFormattedTextField();
        routineYes = new javax.swing.JRadioButton();
        routineNo = new javax.swing.JRadioButton();
        waterValue = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        waterSlider = new javax.swing.JSlider();
        saunaNo = new javax.swing.JRadioButton();
        saunaYes = new javax.swing.JRadioButton();
        nutrition0 = new javax.swing.JRadioButton();
        nutrition1 = new javax.swing.JRadioButton();
        nutrition2 = new javax.swing.JRadioButton();
        social0 = new javax.swing.JRadioButton();
        social1 = new javax.swing.JRadioButton();
        social2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Samantha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your day:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Did you spend some time outside today?");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Did you exercise today?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Did you keep with your routine?");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("How well did you sleep?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Social");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Are you keeping up with your nutrition?");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Did you sauna today?");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Did you drink enough water?");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        exerciseAmount.setEditable(false);
        exerciseAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        exerciseAmount.setText("20");
        exerciseAmount.setValue(0);

        exerciseSlider.setMaximum(20);
        exerciseSlider.setValue(0);
        exerciseSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                exerciseSliderStateChanged(evt);
            }
        });

        outsideValue.setEditable(false);
        outsideValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        outsideValue.setValue(0);

        outsideSlider.setMaximum(40);
        outsideSlider.setValue(0);
        outsideSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                outsideSliderStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("min");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("min");

        sleepSlider.setMaximum(10);
        sleepSlider.setValue(0);
        sleepSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sleepSliderStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("hours");

        sleepValue.setEditable(false);
        sleepValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        sleepValue.setValue(0);

        routineBoolGroup.add(routineYes);
        routineYes.setText("Yes");

        routineBoolGroup.add(routineNo);
        routineNo.setText("No");

        waterValue.setEditable(false);
        waterValue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        waterValue.setValue(0);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ml");

        waterSlider.setMaximum(3000);
        waterSlider.setValue(0);
        waterSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterSliderStateChanged(evt);
            }
        });

        saunaButtonGroup.add(saunaNo);
        saunaNo.setText("No");

        saunaButtonGroup.add(saunaYes);
        saunaYes.setText("Yes");

        nutrtionGroup.add(nutrition0);
        nutrition0.setText("Ate Correctly");

        nutrtionGroup.add(nutrition1);
        nutrition1.setText("Cheated a little bit");

        nutrtionGroup.add(nutrition2);
        nutrition2.setText("Only Junk Food");

        SocialGroup.add(social0);
        social0.setText("Talked with Loved Ones");

        SocialGroup.add(social1);
        social1.setText("Interacted with colleagues");

        SocialGroup.add(social2);
        social2.setText("No Socialisation");

        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(waterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(waterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sleepValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(sleepSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saunaYes)
                                        .addGap(222, 222, 222)
                                        .addComponent(saunaNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(routineYes)
                                        .addGap(222, 222, 222)
                                        .addComponent(routineNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nutrition0)
                                        .addGap(261, 261, 261)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(exerciseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(exerciseSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(outsideValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(outsideSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addGap(73, 73, 73)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(social0)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nutrition1)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(social1)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(social2)
                    .addComponent(nutrition2))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exerciseAmount)
                        .addComponent(jLabel12))
                    .addComponent(exerciseSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outsideSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(outsideValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sleepSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sleepValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routineYes)
                    .addComponent(routineNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(waterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(14, 14, 14)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saunaNo)
                    .addComponent(saunaYes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutrition2)
                    .addComponent(nutrition1)
                    .addComponent(nutrition0))
                .addGap(13, 13, 13)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(social0)
                    .addComponent(social1)
                    .addComponent(social2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        at.deleteTodaysDate();
        String notes = "";
        double total = 0;
        int eAmount = (int)exerciseAmount.getValue();
        total += getScoreVal(eAmount);
        notes += "# " + getExerciseNote(eAmount) + "\n";
        int oAmount = (int)outsideValue.getValue();
        total += getScoreVal(oAmount);
        notes += "# " + getOutsideNote(eAmount) + "\n";
        int sAmount = (int)sleepValue.getValue();
        total += getScoreVal(sAmount);
        notes += "# " + getSleepNote(eAmount) + "\n";
        int wAmount = (int)waterValue.getValue();
        total += getScoreVal(wAmount);
        notes += "# " + getWaterNote(wAmount) + "\n";
        boolean routineBool = false;
        if(routineYes.isSelected()){
            routineBool = true;
            notes += "# Keeping up with your routine was a good choice!\n";
            total += getScoreVal(1);
        }else{
            notes += "# Try to stick to your normal routine, otherwise the days will start going by in a blur.\n";
            total += getScoreVal(0);
        } 
        boolean saunaBool = false;
        if(saunaYes.isSelected()){
            notes += "# Enjoying a sauna sure is nice.\n";
            saunaBool = true;
            total += getScoreVal(1);
        }else{
            notes += "# The sauna will make your day, be sure to make time for it next time.\n";
            total += getScoreVal(0);
        } 
        int nuChoice = -1;
        if(nutrition0.isSelected()){
            notes += "# Healthy and nutritious diet, that is the way it should be, well done!\n";
            nuChoice = 2;
        }else if(nutrition1.isSelected()){
            notes += "# Junk food is nice in the moment, but the rest of the day takes a dip. Try and eat a little healthier tomorrow.\n";
            nuChoice = 1;
        }else{
            notes += "# Your diet is not sustainable, you will have to make some changes.\n";
            nuChoice = 0;
        }
        total += getScoreVal(nuChoice);
        int soChoice = -1;
        if(social0.isSelected()){
            notes += "# Good job on connecting with your loved ones today!\n";
            soChoice = 2;
        }else if(social1.isSelected()){
            notes += "# Social interaction is social interaction, just don't neglect your loved ones because of work.\n";
            soChoice = 1;
        }else{
            notes += "# Don't get swallowed in loneliness, phone a friend.\n";
            soChoice = 0;
        }
        total += getScoreVal(soChoice);
        double score = (total/50.0)*100.0;
        JOptionPane.showMessageDialog(null, "Your score is " + score + "%\n\n" + notes);
        at.updateHistory(eAmount, oAmount, sAmount,routineBool,wAmount, saunaBool, nuChoice, soChoice);
    }//GEN-LAST:event_jButton1ActionPerformed
    private String getExerciseNote(int val){
        if(val < 5){
            return "You should try and exercise more as it drastically improves your mood.";
        }else if(val >=5 && val < 15){
            return "Good job on exercising, but you can push yourself just a bit more!";
        }else{
            return "Keep up the good work in the exercise department!";
        }
    }
    private String getOutsideNote(int val){
        if(val < 10){
            return "You're missing out, the outdoors diminishes feelings of isolation.";
        }else if(val >=10 && val < 30){
            return "The outside is amazing! But stay out just a little longer next time.";
        }else{
            return "Great job on connecting with nature!";
        }
    }
    private String getSleepNote(int val){
        if(val < 4){
            return "Wow, you should really get some sleep ASAP!";
        }else if(val >=4 && val < 7){
            return "During this trying time, it is important to get your beauty sleep, so go to bed a little earlier.";
        }else{
            return "Well-rested for today, keep up this sleep pattern!";
        }
    }
    private String getWaterNote(int val){
        if(val < 1000){
            return "Aren't you thirsty, go drink some water!";
        }else if(val >=1000 && val < 2000){
            return "Little more water consumption next time will help in the concentration department.";
        }else{
            return "Water drinking skills are legendary!";
        }
    }
    private int getScoreVal(int val){
            if(val <= 1){
                if(val == 1){
                    return 10;
                }else{
                    return 0;
                }
            }else if(val> 1 && val <= 3){
                if(val == 2){
                    return 5;
                }else{
                    return 10;
                }
            }else if(val>3 && val <= 20){
                return (int)(val/20)*10;
            }else if(val> 20 && val <= 40){
                return (int)(val/40)*10;
            }else{
                return (int)(val/3000)*10;
            }
    }
    private void exerciseSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_exerciseSliderStateChanged
        exerciseAmount.setValue(exerciseSlider.getValue());
    }//GEN-LAST:event_exerciseSliderStateChanged

    private void outsideSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_outsideSliderStateChanged
        outsideValue.setValue(outsideSlider.getValue());
    }//GEN-LAST:event_outsideSliderStateChanged

    private void sleepSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sleepSliderStateChanged
        sleepValue.setValue(sleepSlider.getValue());
    }//GEN-LAST:event_sleepSliderStateChanged

    private void waterSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterSliderStateChanged
        waterValue.setValue(waterSlider.getValue());
    }//GEN-LAST:event_waterSliderStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        actualHistory h = new actualHistory();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_GUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SocialGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField exerciseAmount;
    private javax.swing.JSlider exerciseSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton nutrition0;
    private javax.swing.JRadioButton nutrition1;
    private javax.swing.JRadioButton nutrition2;
    private javax.swing.ButtonGroup nutrtionGroup;
    private javax.swing.JSlider outsideSlider;
    private javax.swing.JFormattedTextField outsideValue;
    private javax.swing.ButtonGroup routineBoolGroup;
    private javax.swing.JRadioButton routineNo;
    private javax.swing.JRadioButton routineYes;
    private javax.swing.ButtonGroup saunaButtonGroup;
    private javax.swing.JRadioButton saunaNo;
    private javax.swing.JRadioButton saunaYes;
    private javax.swing.JSlider sleepSlider;
    private javax.swing.JFormattedTextField sleepValue;
    private javax.swing.JRadioButton social0;
    private javax.swing.JRadioButton social1;
    private javax.swing.JRadioButton social2;
    private javax.swing.JSlider waterSlider;
    private javax.swing.JFormattedTextField waterValue;
    // End of variables declaration//GEN-END:variables
}
