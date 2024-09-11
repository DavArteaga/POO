/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package friends;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Number:");

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("READ");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnRead)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
                String newName = txtName.getText();
                Long newNumber = Long.parseLong(txtNumber.getText());
                String nameNumberString;
                int index;
                String name;
                Long number;

                // Using file pointer creating the file.
                File file = new File("friendsContact.txt");

                if (!file.exists()) {
                    // Create a new file if not exists.
                    file.createNewFile();
                }

                // Opening file in reading and write mode.
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                boolean found = false;

                // Checking whether the name
                // of contact already exists.
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // if condition to find existence of record.
                if (name == newName 
                    || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                // Enter the if block when a record
                // is not already present in the file.
                nameNumberString = newName + "!" + String.valueOf(newNumber);

                // writeBytes function to write a string
                // as a sequence of bytes.
                raf.writeBytes(nameNumberString);
                // To insert the next record in new line.
                raf.writeBytes(System.lineSeparator());

                // Print the message
                JOptionPane.showMessageDialog(null, "Friend Add");

                // Closing the resources.
                raf.close();
            }
            // The contact to be updated
            // could not be found
            else {
                // Closing the resources.
                raf.close();

                // Print the message
                JOptionPane.showMessageDialog(null, "Input name does not exists.");
            }
        }

        catch (IOException ioe) {
            System.out.println(ioe);
        }
        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String nameNumberString;
            String name;
            long number;
            int index;
            
            String newName = txtName.getText();
            Long newNumber = Long.parseLong(txtNumber.getText());
            
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {
		// Create a new file if not exists.
		file.createNewFile();
            }

            // Opening file in reading and write mode.
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            // Checking whether the name of contact exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
		nameNumberString = raf.readLine();

		// splitting the string to get name and number
		String[] lineSplit = nameNumberString.split("!");

		// separating name and number.
		name = lineSplit[0];
		number = Long.parseLong(lineSplit[1]);

		// if condition to find existence of record.
		if (name.equals(newName) && number == newNumber) {
                    found = true;
                    break;
		}
            }

            // Delete the contact if record exists.
            if (found == true) {
		// Creating a temporary file
		// with file pointer as tmpFile.
		File tmpFile = new File("temp.txt");

		// Opening this temporary file
		// in ReadWrite Mode
		RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

		// Set file pointer to start
		raf.seek(0);

		// Traversing the friendsContact.txt file
		while (raf.getFilePointer() < raf.length()) {
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);
                    
                    String[] lineSplit = nameNumberString.split("!");
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);

                    // Check if the fetched contact is the one to be deleted
                    if (name.equals(newName) && number == newNumber) {
			// Skip inserting this contact into the temporary file
			continue;
                    }

                    // Add this contact in the temporary file
                    tmpraf.writeBytes(nameNumberString);

                    // Add the line separator in the temporary file
                    tmpraf.writeBytes(System.lineSeparator());
                }

		// The contact has been deleted now
		// So copy the updated content from
		// the temporary file to original file.

		// Set both files pointers to start
		raf.seek(0);
		tmpraf.seek(0);

		// Copy the contents from
		// the temporary file to original file.
		while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
		}

		// Set the length of the original file
		// to that of temporary.
		raf.setLength(tmpraf.length());

		// Closing the resources.
		tmpraf.close();
		raf.close();

		// Deleting the temporary file
		tmpFile.delete();

                JOptionPane.showMessageDialog(null, "Friend deleted.");
            }

            // The contact to be deleted
            // could not be found
            else {

		// Closing the resources.
		raf.close();

		// Print the message
                JOptionPane.showMessageDialog(null, newName + " does not exists.");
            }
        }

	catch (IOException ioe) {
            System.out.println(ioe);
	}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtNumber.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try {
            
            String newName = txtName.getText();
            //Long newNumber = Long.parseLong(txtNumber.getText());
            
            String nameNumberString;
            String name;
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
            if (!file.exists()) {
                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and number
                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                if (name.equals(newName)){
                    //txtName.setText(String.valueOf(name));
                    JOptionPane.showMessageDialog(null, "Name: " + newName +
                                                      "\nNumber:" + number);
                    txtNumber.setText(String.valueOf(number));
                    found = true;
                    break;
                }
                
            }
        }
        catch (IOException ioe){
            System.out.println(ioe);
        }
        catch (NumberFormatException nef){
            System.out.println(nef);
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String nameNumberString;
            String name;
            long number;
            int index;
            
            String nametoUpdate = txtName.getText();
            Long numbertoUpdate = Long.parseLong(txtNumber.getText());
            
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
            if (!file.exists()) {
        	// Create a new file if not exists.
		file.createNewFile();
            }

            // Opening file in reading and write mode.
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
		// reading line from the file.
		nameNumberString = raf.readLine();

		// splitting the string to get name and number
		String[] lineSplit = nameNumberString.split("!");

		// separating name and number.
		name = lineSplit[0];
		number = Long.parseLong(lineSplit[1]);

		// if condition to find existence of record.
		if (name.equals(nametoUpdate) || number == numbertoUpdate) {
                    found = true;
                    break;
		}
            }

            // Update the contact if record exists.
            if (found == true) {

                // Creating a temporary file with file pointer as tmpFile.
		File tmpFile = new File("temp.txt");

		// Opening this temporary file in ReadWrite Mode
		RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

		// Set file pointer to start
		raf.seek(0);

		// Traversing the friendsContact.txt file
		while (raf.getFilePointer() < raf.length()) {

                    // Reading the contact from the file
                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);

                    // Check if the fetched contact is the one to be updated
                    if (name.equals(nametoUpdate)) {

			// Update the number of this contact
			nameNumberString
			= name + "!" + String.valueOf(numbertoUpdate);
                    }

                    // Add this contact in the temporary file
                    tmpraf.writeBytes(nameNumberString);

                    // Add the line separator in the temporary file
                    tmpraf.writeBytes(System.lineSeparator());
                }

		// The contact has been updated now
		// So copy the updated content from
		// the temporary file to original file.

		// Set both files pointers to start
		raf.seek(0);
		tmpraf.seek(0);

		// Copy the contents from
		// the temporary file to original file.
		while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
		}

		// Set the length of the original file
		// to that of temporary.
		raf.setLength(tmpraf.length());

		// Closing the resources.
		tmpraf.close();
		raf.close();

		// Deleting the temporary file
		tmpFile.delete();

                JOptionPane.showMessageDialog(null, "Friend updated.");
            }

            // The contact to be updated
            // could not be found
            else {

		// Closing the resources.
		raf.close();
		// Print the message
                JOptionPane.showMessageDialog(null, " Input name" + " does not exists. ");
            }
        }

	catch (IOException ioe) {
            System.out.println(ioe);
	}
	catch (NumberFormatException nef) {
            System.out.println(nef);
	}
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
