/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingefficiencies;

// imports required for this assignment
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Muntaqa Mahmood
 * January 10, 2020
 * Sorting Efficiencies
 * This project sorts 10 numbers to 5000 numbers in ascending or descending order and in selection, insertion, bubble and quick sort algorithm.
 */




public class SortingEfficiencies extends javax.swing.JFrame {

int selectionloop = 0, bubbleloop = 0, insertionloop = 0, quickloop = 0;
int selectionShift = 0, bubbleShift = 0, insertionShift = 0, quickShift = 0;
int selectionComparison = 0, bubbleComparison = 0, insertionComparison = 0, quickComparison = 0;
long selectionStart, selectionFinish, bubbleStart, bubbleFinish, insertionStart, insertionFinish, quickStart, quickFinish;
long selectionElapsed, bubbleElapsed, insertionElapsed, quickElapsed;
    /**
     * Creates new form SortingEfficiencies
     */
    public SortingEfficiencies() {
        initComponents();
    }

    public void swap(int arr[], int i, int j){
            quickShift++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        public int partition (int arr[], int left, int right){
            int pivot = arr[left];
            int i = left;
            
            for (int j = left+1; j <= right; j++){
                quickloop++;
                quickComparison++;
                if (arr[j] < pivot){
                    i++;
                    swap(arr,i,j);
                    
                }
            }
            swap (arr,i,left);
            quickFinish = System.currentTimeMillis();
            return i;
        }
        
        void quicksort(int arr[], int left, int right){
            if(left < right){
                int p = partition(arr, left, right);
                quicksort(arr, left, p-1);
                quicksort(arr, p+1, right);
            }
        }
            
        public int dividingdescend (int arr[], int left, int right){
            int pivot = arr[left];
            int i = left;
            
            for (int j = left+1; j <= right; j++){
                quickloop++;
                quickComparison++;
                if (arr[j] > pivot){
                    i++;
                    swap(arr,i,j);
                }
            }
            swap (arr,i,left);
            quickFinish = System.currentTimeMillis();
            return i;
        }

        void quicksortdescend(int arr[], int left, int right){
            if(left < right){
                int p = dividingdescend(arr, left, right);
                quicksortdescend(arr, left, p);
                quicksortdescend(arr, p+1, right);
            }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        button10 = new javax.swing.JRadioButton();
        button100 = new javax.swing.JRadioButton();
        button1000 = new javax.swing.JRadioButton();
        button5000 = new javax.swing.JRadioButton();
        sortbutton = new javax.swing.JButton();
        sortlabel = new javax.swing.JLabel();
        ascbutton = new javax.swing.JRadioButton();
        desbutton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsoutput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        orgoutput = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        sortoutput = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sortresults = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText("Sorting Efficiencies");

        description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        description.setText("Enter the amount of numbers in the list: ");

        button10.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(button10);
        button10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button10.setText("10");
        button10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button100.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(button100);
        button100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button100.setText("100");
        button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button100ActionPerformed(evt);
            }
        });

        button1000.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(button1000);
        button1000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button1000.setText("1000");
        button1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1000ActionPerformed(evt);
            }
        });

        button5000.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(button5000);
        button5000.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button5000.setText("5000");
        button5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5000ActionPerformed(evt);
            }
        });

        sortbutton.setText("Sort Button");
        sortbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortbuttonActionPerformed(evt);
            }
        });

        sortlabel.setText("Sort Order: ");

        ascbutton.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(ascbutton);
        ascbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ascbutton.setText("Ascending");
        ascbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascbuttonActionPerformed(evt);
            }
        });

        desbutton.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(desbutton);
        desbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        desbutton.setText("Descending");
        desbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desbuttonActionPerformed(evt);
            }
        });

        resultsoutput.setColumns(20);
        resultsoutput.setRows(5);
        jScrollPane1.setViewportView(resultsoutput);

        orgoutput.setEditable(false);
        orgoutput.setColumns(20);
        orgoutput.setRows(5);
        jScrollPane2.setViewportView(orgoutput);

        sortoutput.setEditable(false);
        sortoutput.setColumns(20);
        sortoutput.setRows(5);
        jScrollPane3.setViewportView(sortoutput);

        jLabel4.setText("Original Numbers:");

        jLabel5.setText("Sorted Numbers:");

        sortresults.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sortresults.setText("Sort Results:");

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(desbutton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sortlabel)
                                .addGap(18, 18, 18)
                                .addComponent(ascbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sortresults)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(description)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button10)
                                .addGap(18, 18, 18)
                                .addComponent(button100)
                                .addGap(18, 18, 18)
                                .addComponent(button1000)
                                .addGap(18, 18, 18)
                                .addComponent(button5000))
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(sortbutton)
                        .addGap(45, 45, 45)
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description)
                    .addComponent(button10)
                    .addComponent(button100)
                    .addComponent(button1000)
                    .addComponent(button5000)
                    .addComponent(sortbutton)
                    .addComponent(exitbutton))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortresults)
                    .addComponent(sortlabel)
                    .addComponent(ascbutton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(desbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        // exits the program
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void sortbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortbuttonActionPerformed
        // TODO add your handling code here:
        selectionloop = 0;
        bubbleloop = 0; 
        insertionloop = 0;
        quickloop = 0;
        selectionShift = 0;
        bubbleShift = 0;
        insertionShift = 0;
        quickShift = 0;
        selectionComparison = 0;
        bubbleComparison = 0;
        insertionComparison = 0;
        quickComparison = 0;
        orgoutput.setText("");
        sortoutput.setText("");
        
        //based on the chosen radio button, return an according length
        int length;
        if (button10.isSelected() == true){
            length = 10;
        }
        else if (button100.isSelected() == true){
            length = 100;
        }
        else if (button1000.isSelected() == true){
            length = 1000;
        }
        else if (button5000.isSelected() == true){
            length = 5000;
        }
        else {
            length = 0;
        }
        Random random = new Random();
        //create four new 
        int num [] = new int [length];
        int num1 [] = new int [length];
        int num2 [] = new int [length];
        int num3 [] = new int [length];
        
        for (int i = 0; i < length; i++){
            num[i] = random.nextInt((10000+10000)+1)-10000;
        }
        for (int i = 0; i < length; i++){
            num1[i] = random.nextInt((10000+10000)+1)-10000;
        }
        for (int i = 0; i < length; i++){
            num2[i] = random.nextInt((10000+10000)+1)-10000;
        }
        for (int i = 0; i < length; i++){
            num3[i] = random.nextInt((10000+10000)+1)-10000;
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        
        for(int i = 0; i < num.length; i++){
            orgoutput.setText(orgoutput.getText() + num[i] + "\n");
        }
        
        if(button10.isSelected() == false && button100.isSelected() == false && button1000.isSelected() == false && button5000.isSelected() == false){
            resultsoutput.setText("Please select a number length.");
        }
        else if(ascbutton.isSelected() == false && desbutton.isSelected() == false){
            resultsoutput.setText("Please select a sort order.");
        }
        
        else if (ascbutton.isSelected() == true){
            
            resultsoutput.setText("");
            sortoutput.setText("");
            
            //Selection Sort
            selectionStart = System.currentTimeMillis();
                for(int i = 0; i < num.length; i++){
                    for(int j = i+1; j < num.length; j++){
                        selectionloop++;
                        selectionComparison++;
                        if(num[i] > num[j]){
                            swap(num, i, j);
                            selectionShift++;
                        }
                    }
                }
                selectionFinish = System.currentTimeMillis();
                selectionElapsed = selectionFinish - selectionStart;
                for(int i = 0; i < num.length; i++){
                    sortoutput.setText(sortoutput.getText() + num[i] + "\n");
                }
                
                //Bubble Sort
                bubbleStart = System.currentTimeMillis();
                for(int i = 0; i < num2.length; i++){
                    for(int j = 0; j < num2.length-1; j++){
                        bubbleloop++;
                        bubbleComparison++;
                        if(num2[j] > num2[j+1]){
                            bubbleShift++;
                            swap(num2, j, j+1);
                        }
                    }
            }
                bubbleFinish = System.currentTimeMillis();
             bubbleElapsed = bubbleFinish - bubbleStart;
             int test = 0;
                //Insertion Sort
                insertionStart = System.currentTimeMillis();
                for (int j = 1; j < num3.length; j++){  
                    insertionloop++;
                    int key = num3[j];  
                    int i = j-1;
                    
                    while ((i > -1) && (num3 [i] > key)){ 
                        test++;
                        insertionloop++;
                        num3 [i+1] = num3 [i];  
                        i--;  
                        
                        insertionComparison++;
                    }
                    insertionShift++;
                    num3[i+1] = key;
            }
                System.out.println(test);
                insertionFinish = System.currentTimeMillis();
                insertionElapsed = insertionFinish - insertionStart;
                System.out.println(insertionStart);
                System.out.println(insertionFinish);
            
                //Quick Sort
                quickStart = System.currentTimeMillis();
                quicksort(num1, 0, length-1);       
                quickElapsed = quickFinish - quickStart;
                
                resultsoutput.setText("Selection Sort\n"
                + "Number of times the loop was executed: " + selectionloop 
                        + "\nNumber of times a comparison was made: " + selectionComparison 
                        + "\nNumber of times a value was shifted: " + selectionShift 
                        + "\nNumber of milliseconds to complete sort: " + selectionElapsed
                        
                + "\nBubble Sort\n"
                        + "Number of times the loop was executed: " + bubbleloop 
                        + "\nNumber of times a comparison was made: " + bubbleComparison 
                        + "\nNumber of times a value was shifted: " + bubbleShift 
                        + "\nNumber of milliseconds to complete sort: " + bubbleElapsed
                        
                + "\nInsertion Sort\n"
                        + "Number of times the loop was executed: " + insertionloop 
                        + "\nNumber of times a comparison was made: " + insertionComparison 
                        + "\nNumber of times a value was shifted: " + insertionShift 
                        + "\nNumber of milliseconds to complete sort: " + insertionElapsed
                        
                + "\nQuick Sort\n"
                        + "Number of times the loop was executed: " + quickloop 
                        + "\nNumber of times a comparison was made: " + quickComparison 
                        + "\nNumber of times a value was shifted: " + quickShift 
                        + "\nNumber of milliseconds to complete sort: " + quickElapsed
                        );
        }
        
        else if(desbutton.isSelected() == true){
            resultsoutput.setText("");
            sortoutput.setText("");
            selectionStart = System.currentTimeMillis();
                for(int i = 0; i < num3.length; i++){
                    for(int j = i+1; j < num3.length; j++){
                        selectionloop++;
                        selectionComparison++;
                        if(num3[i] < num3[j]){
                            swap(num3, i, j);
                            selectionShift++;
                    }
                }
                }
                selectionFinish = System.currentTimeMillis();
                selectionElapsed = selectionFinish - selectionStart;
                
                for(int i = 0; i < num.length; i++){
                    sortoutput.setText(sortoutput.getText() + num[i] + "\n");
                }
                
                bubbleStart = System.currentTimeMillis();
                for(int i = 0; i < num1.length; i++){
                    for(int j = 0; j < num1.length-1; j++){
                        bubbleloop++;
                        bubbleComparison++;
                        if(num1[j] < num1[j+1]){
                            bubbleShift++;
                            swap(num1, j, j+1);
                        }
                    }
             bubbleFinish = System.currentTimeMillis();
             bubbleElapsed = bubbleFinish - bubbleStart;
            }
                          
                insertionStart = System.currentTimeMillis();
                for (int j = 1; j < num.length; j++){  
                    int key = num[j];  
                    int i = j-1;  
                    insertionloop++;
                    insertionComparison++;
                    while ((i > -1) && (num [i] < key)){ 
                        num [i+1] = num [i];  
                        i--;  
                    }  
                    insertionShift++;
                    num[i+1] = key;
            }
                insertionFinish = System.currentTimeMillis();
                insertionElapsed = insertionFinish - insertionStart;
            
                quickStart = System.currentTimeMillis();
                quicksortdescend(num2, 0, length-1); 
                quickElapsed = quickFinish - quickStart;
                resultsoutput.setText("Selection Sort\n"
                + "Number of times the loop was executed: " + selectionloop 
                        + "\nNumber of times a comparison was made: " + selectionComparison 
                        + "\nNumber of times a value was shifted: " + selectionShift 
                        + "\nNumber of milliseconds to complete sort: " + selectionElapsed
                        //output sentences for selection sort
                + "\nBubble Sort\n"
                        + "Number of times the loop was executed: " + bubbleloop 
                        + "\nNumber of times a comparison was made: " + bubbleComparison 
                        + "\nNumber of times a value was shifted: " + bubbleShift 
                        + "\nNumber of milliseconds to complete sort: " + bubbleElapsed
                        // output for bubble sort
                + "\nInsertion Sort\n"
                        + "Number of times the loop was executed: " + insertionloop 
                        + "\nNumber of times a comparison was made: " + insertionComparison 
                        + "\nNumber of times a value was shifted: " + insertionShift 
                        + "\nNumber of milliseconds to complete sort: " + insertionElapsed
                        // output for insertion sort
                + "\nQuick Sort\n"
                        + "Number of times the loop was executed: " + quickloop 
                        + "\nNumber of times a comparison was made: " + quickComparison 
                        + "\nNumber of times a value was shifted: " + quickShift 
                        + "\nNumber of milliseconds to complete sort: " + quickElapsed
                        );// output for quick sort
        }
        
        
        
    }//GEN-LAST:event_sortbuttonActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button100ActionPerformed

    private void button1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1000ActionPerformed

    private void button5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button5000ActionPerformed

    private void ascbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ascbuttonActionPerformed

    private void desbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingEfficiencies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingEfficiencies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ascbutton;
    private javax.swing.JRadioButton button10;
    private javax.swing.JRadioButton button100;
    private javax.swing.JRadioButton button1000;
    private javax.swing.JRadioButton button5000;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton desbutton;
    private javax.swing.JLabel description;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea orgoutput;
    private javax.swing.JTextArea resultsoutput;
    private javax.swing.JButton sortbutton;
    private javax.swing.JLabel sortlabel;
    private javax.swing.JTextArea sortoutput;
    private javax.swing.JLabel sortresults;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}