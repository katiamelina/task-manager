/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taskmanager;

import java.lang.String;
import java.io.*;
import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.*;

import taskmanager.Task;
import taskmanager.TaskList;
import java.time.format.DateTimeParseException;



/**
 *
 * @author 16825
 */
public class AddTaskGUI extends javax.swing.JFrame {

    /**
     * Creates new form AddTask
     */
    public AddTaskGUI() {
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
        
        addTaskLabel = new javax.swing.JLabel();
        taskNameLabel = new javax.swing.JLabel();
        priorityLabel = new javax.swing.JLabel();
        dueDateLabel = new javax.swing.JLabel();
        taskNameInput = new javax.swing.JTextField();
        priorityInput = new javax.swing.JComboBox<>();
        dueDateInput = new javax.swing.JTextField();
        accept = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        taskGUI = new TaskListGUI();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Task Menu");

        addTaskLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addTaskLabel.setText("Create a new task by entering the data below:");

        taskNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taskNameLabel.setText("Task Name: ");

        priorityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priorityLabel.setText("Priority: ");

        dueDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dueDateLabel.setText("Complete By: ");

        taskNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        priorityInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low" }));

        dueDateInput.setText("MM-dd-yyyy");

        accept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/todo/Add.png"))); // NOI18N
        accept.setText("Add");

        cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/todo/Cancel.png"))); // NOI18N
        cancel.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addTaskLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dueDateLabel)
                                    .addComponent(priorityLabel)
                                    .addComponent(taskNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taskNameInput)
                                    .addComponent(priorityInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dueDateInput)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(accept)
                        .addGap(45, 45, 45)
                        .addComponent(cancel)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addTaskLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskNameLabel)
                    .addComponent(taskNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityLabel)
                    .addComponent(priorityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueDateLabel)
                    .addComponent(dueDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accept)
                    .addComponent(cancel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        addListener();
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        add listener to either accept the task or just cancel the box.

    */

    public void addListener(){
        accept.addMouseListener(new MouseAdapter(){
            @override
            public void mousePressed(MouseEvent e) {
                //get priority
                Hashtable <String,Integer> ht = new Hashtable<String,Integer>(); 
                ht.put("High",1);
                ht.put("Medium",2);
                ht.put("Low",3);

                //Get input
                String getTaskNameInput = taskNameInput.getText();
                String getPriorityInput = priorityInput.getSelectedItem().toString(); 

                //get currentDate
                LocalDate currentDate = LocalDate.now();

                //get deadline 
                String getDueDateInput = dueDateInput.getText();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
                LocalDate dueDate = LocalDate.now();
                try{
                    dueDate = LocalDate.parse(getDueDateInput,formatter);
                }
                catch(DateTimeParseException err){
                    //To do, create a error box that warns incorrect date type.
                    System.out.println(err.getMessage());
                }

                //add new task to task list
                Task newTask = new Task(ht.get(getPriorityInput),getTaskNameInput,currentDate,dueDate);
                taskGUI.addTaskToGUI(newTask);

                dispose();
                revalidate();
            }

        });

        cancel.addMouseListener(new MouseAdapter(){
            @override
            public void mousePressed(MouseEvent e) {
                //Exit box.
                dispose();
            }
        });
    }




    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddTaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTaskGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTaskGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addTaskLabel;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JButton accept;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> priorityInput;
    private javax.swing.JTextField taskNameInput;
    private javax.swing.JTextField dueDateInput;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JLabel taskNameLabel;

    public TaskListGUI taskGUI;

    // End of variables declaration//GEN-END:variables
}